import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.ErrorLoggingFilter;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import org.apache.http.HttpStatus;
import org.apache.http.protocol.HTTP;
import org.hamcrest.Matchers;
import org.junit.Before;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.MatcherAssert.assertThat;

public class ReqRestTestFourth {
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
                    //Configurado y compilado esto para no repetir en contenType(ContentType.JSON)
                    .build();
        }

        @Test
        public void deleteUser(){
        given()
                .delete("/user/2")
                .then()
                .statusCode(HttpStatus.SC_NO_CONTENT);

        }


        @Test

        public void patchUserTest(){
         String name=   given()
                    .when()
                    .body("{\n" +
                            "    \"name\": \"morpheus\",\n" +
                            "    \"job\": \"zion resident\"\n" +
                            "}")
                    .patch("/user/2")
                    .then()
                    .statusCode(HttpStatus.SC_OK)
                 //Entrar al json y rebuscar todas las propiedades
                    .extract()
                 //entra al json path y le dice que entre al name, pongo clave, me trae el registro
                    .jsonPath().getString("name");
         //assercion para verificar
         assertThat(name, Matchers.equalTo("morpheus"));




        }
}
