import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.junit.Test;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;

public class ReqRestTestSecond {

    @Test
    public void loginTest(){
        RestAssured
                .given()
                .log().all()
                .contentType(ContentType.JSON)
                .body("{\n" +
                        "    \"email\": \"eve.holt@reqres.in\",\n" +
                        "    \"password\": \"cityslicka\"\n" +
                        "}")
                .post("https://reqres.in/api/login")
                .then()
                .log().all()
                //Antes de acer la asercion quiero validar que mi respuesta fue 200
                .statusCode(200);
                //Validar  que en el boy que nos devuelve de token, no sea nulo

    }

    @Test
    public void getSingleUserTest(){
        RestAssured
                .given()
                .log().all()
                .contentType(ContentType.JSON)
                //como no es post no es necesario mandarle un body
                .get("https://reqres.in/api/users/2")
                //then-asertion
                .then()
                .log()
                .all()
                //solo se hara la asercion si es de un status 200
                .statusCode(200)
                //Validar data.id
                .body("data.id",equalTo(2))
                .body("data.email",equalTo("janet.weaver@reqres.in"));




    }

}
