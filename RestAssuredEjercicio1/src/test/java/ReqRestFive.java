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

import java.sql.SQLOutput;

import static io.restassured.RestAssured.given;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class ReqRestFive {
    @Before
    public void setUp(){
        //Url del api
        RestAssured.baseURI = "https://reqres.in/";
        //lo que acompaña cada request
        RestAssured.basePath= "/api";
        //Filters nos permiten capturar el request o el response, nos va  a permitir ver antes se reciba o envie all servidor
        //LOG DE MI REQUEST, LOG DE MI RESPUESTA, LOG DE ERROR DE 400 HACIA ARRIBA
        RestAssured.filters(new RequestLoggingFilter(), new ResponseLoggingFilter() , new ErrorLoggingFilter());
        //Content-Type
        RestAssured.requestSpecification = new RequestSpecBuilder()
                .setContentType(ContentType.JSON)
                //Compilar
                .build();
    }
    @Test
    public void getAllUserTest(){
        //Por medio de est vamos a capturar los campos
        //como esto trae una respuesta vamos a decir
        Response response = given().get("/users?page=2");
        //Estams parametrizando
        Headers headers =response.getHeaders();
        int statusCode = response.getStatusCode();
        //Lo eclaramos en string, y convertimos el body con asString, ya que el body viene con formato distinto y puede generar error
        String body = response.getBody().asString();
        String contentType= response.getContentType();

        assertThat(statusCode,equalTo(HttpStatus.SC_OK));
        //Para comprobar que si nos muestre lo que es, y verlo de una forma organizada
        System.out.println("********************Body:******************** " + body);
        System.out.println("********************************************************************************" );
        System.out.println("********************ContentType:********************" +contentType);
        System.out.println("********************************************************************************" );
        System.out.println("********************Header:********************" + headers.toString());

        //Acceder a una parte en especifico de alguno de los campos anteriores

        System.out.println("********************************************************************************" );
        System.out.println("********************************************************************************" );
        System.out.println(headers.get("Transfer-Encoding"));
        System.out.println(headers.get("Cache-Control"));
        System.out.println("********************************************************************************" );
        System.out.println("********************************************************************************" );

        //Con estos campos tambien podemos hacer aserciones
       // assertThat(headers.get("Transfer-Encoding=chunked"),equalTo("Transfer-Encoding=chunked"));

    }
}






