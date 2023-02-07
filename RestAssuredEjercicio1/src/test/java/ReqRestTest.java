import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.junit.Test;

public class ReqRestTest {


    @Test //creamos siempre la etiqueta test

    public void loginTest(){ //declaramos la clase publica con el metodo void que no retorna ningun valor y el nombre de la clase

        RestAssured //Al poner RestAssured parecen las librerias de RestAssured
                .given()
                .log().all()
                .contentType(ContentType.JSON) //Vamos a andarle nuestras variables, una request para que nos de una respuesta
                .body("{\n" +
                        "    \"email\": \"eve.holt@reqres.in\",\n" +
                        "    \"password\": \"cityslicka\"\n" +
                        "}")
                .post("https://reqres.in/api/login")  //al decir que es un post, un get o etc dentro de los parentesis  va la url
                .then()   //Validar respuesta
                .log().all()  //sin el log.all no muestra absolutamente nada,aca estgamos diciendo
                .extract() //Extraiga toda la informacion y la presente como un string
                .asString();//Le estoy diciendo que me muestre


    }



}
