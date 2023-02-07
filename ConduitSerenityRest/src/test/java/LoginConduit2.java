import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.ErrorLoggingFilter;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import org.apache.http.HttpStatus;
import org.junit.Before;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class LoginConduit2 {

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
    public void loginConduit2() {

        Response response = given().body("{\n" +
                        "  \"user\": {\n" +
                        "    \"email\": \"jarv078@gmail.com\",\n" +
                        "    \"password\": \"123qwe\"\n" +
                        "  }\n" +
                        "}")
                .post("/users/login");
        //Estams parametrizando
        Headers headers = response.getHeaders();
        int statusCode = response.getStatusCode();
        //Lo eclaramos en string, y convertimos el body con asString, ya que el body viene con formato distinto y puede generar error
        String body = response.getBody().asString();
        String contentType = response.getContentType();

        assertThat(statusCode, equalTo(HttpStatus.SC_OK));
        //Para comprobar que si nos muestre lo que es, y verlo de una forma organizada
        System.out.println("********************Body:******************** " + body);
        System.out.println("********************************************************************************");
        System.out.println("********************ContentType:********************" + contentType);
        System.out.println("********************************************************************************");
        System.out.println("********************Header:********************" + headers.toString());
        System.out.println("********************************************************************************");
        System.out.println("********************Header:********************" + headers.toString());

        //Acceder a una parte en especifico de alguno de los campos anteriores

        System.out.println("********************************************************************************");
        System.out.println("********************************************************************************");
        System.out.println(headers.get("Transfer-Encoding"));
        System.out.println(headers.get("Cache-Control"));
        System.out.println("********************************************************************************");
        System.out.println("********************************************************************************");

        //Con estos campos tambien podemos hacer aserciones
        // assertThat(headers.get("Transfer-Encoding=chunked"),equalTo("Transfer-Encoding=chunked"));

    }





}






