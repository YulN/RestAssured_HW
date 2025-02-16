package services;

import dto.UserDTO;
import io.restassured.http.ContentType;
import io.restassured.response.ValidatableResponse;
import static io.restassured.RestAssured.given;

public class PetStoreApi {
    public ValidatableResponse createUser(UserDTO user) {
      return given()
                .baseUri("https://petstore.swagger.io/v2")
                .contentType(ContentType.JSON)
                .log().all()
                .when()
                .post("/path")
                .then()
                .log().all();
    }
}
