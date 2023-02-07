import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.ErrorLoggingFilter;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.mapper.ObjectMapperDeserializationContext;
import io.restassured.mapper.ObjectMapperSerializationContext;
import org.apache.http.HttpStatus;
import org.junit.Before;
import org.junit.Test;
import models.*;

import static io.restassured.RestAssured.given;


public class LoginConduit {
String token;
    @Before
    public void setUp() {

        RestAssured.baseURI = "https://api.realworld.io";
        RestAssured.basePath = "/api";
        RestAssured.filters(new RequestLoggingFilter(), new ResponseLoggingFilter(), new ErrorLoggingFilter());
        RestAssured.requestSpecification = new RequestSpecBuilder()
                .setContentType(ContentType.JSON)
                .build();
    }


    @Test
    public void loginTest() throws JsonProcessingException {
        Data data= new Data();
        User user= new User();
        user.setEmail("jarv078@gmail.com");
        user.setPassword("123qwe");
        data.setUser(user);
        ObjectMapper objectMapper = new ObjectMapper();
        System.out.println(objectMapper.writeValueAsString(data));

        }

    @Test
    public void loginConduit() {
        token = given()
                .body(Data)
                .post("/users/login")
                .then()
                .statusCode(HttpStatus.SC_OK)
                .extract()
                .response().jsonPath().getString("user.token");



        System.out.println("********************************************************************************" );
        System.out.println("********************TOKEN:******************** " + token);
        System.out.println("********************************************************************************" );

    }
    //Traiga Articulos

    @Test
    public void articlesGetConduit() {
        given()
                .when()
                .header("Authorization", "Bearer" + token)
                //.auth().oauth2("token")
                .get("/articles?limit=10&offset=0")
                .then()
                .extract().asString();


    }


    }
