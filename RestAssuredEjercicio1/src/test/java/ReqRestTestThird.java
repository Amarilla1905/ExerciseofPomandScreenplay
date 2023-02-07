import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.ErrorLoggingFilter;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.Matchers.equalTo;

public class ReqRestTestThird {

    @Before
    public void setUp(){
        //Url del api
        RestAssured.baseURI = "https://reqres.in/";
        //lo que acompaña cada request
        RestAssured.basePath= "/api";
        //Filters nos permiten capturar el request o el response, nos va  a permitir ver antes se reciba o envie all servidor
                            //LOG DE MI REQUEST, LOG DE MI RESPUESTA, LOG DE ERROR DE 400 HACIA ARRIBA
        RestAssured.filters(new RequestLoggingFilter(), new ResponseLoggingFilter() , new ErrorLoggingFilter());

    }
    @Test
    public void getSingleUserTest(){
        RestAssured
                .given()
                .contentType(ContentType.JSON)
                //como no es post no es necesario mandarle un body
                .get("/users/2")
                //then-asertion
                .then()
                //solo se hara la asercion si es de un status 200
                .statusCode(200)
                //Validar data.id
                .body("data.email",equalTo("janet.weaver@reqres.in"));




    }


}
