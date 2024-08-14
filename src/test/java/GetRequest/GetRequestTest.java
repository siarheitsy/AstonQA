package GetRequest;

import Global.Global;
import Specifications.Specifications;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class GetRequestTest {

    @Test
    public void getRequestTest() {

        Specifications.setupSpecifications(Specifications.requestSpec(Global.URL), Specifications.responseOK200());
        GetResponseBody responseBody = given()
                .when()
                .contentType(ContentType.JSON)
                .get("/get")
                .then()
                .log()
                .all()
                .extract()
                .body()
                .jsonPath()
                .getObject("", GetResponseBody.class);
        Assertions.assertEquals("http://postman-echo.com/get", responseBody.getUrl());
        Assertions.assertEquals("postman-echo.com", responseBody.getHeaders().getHost());
        Assertions.assertEquals("http", responseBody.getHeaders().getX_forwarded_proto());
        Assertions.assertEquals("close", responseBody.getHeaders().getConnection());
        Assertions.assertEquals("443", responseBody.getHeaders().getX_forwarded_port());
        Assertions.assertEquals("*/*", responseBody.getHeaders().getAccept());
    }

}
