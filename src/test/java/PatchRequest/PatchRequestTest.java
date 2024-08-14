package PatchRequest;

import Global.Global;
import Specifications.Specifications;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class PatchRequestTest {

    @Test
    public void putRequestTest() {
        String json = null;
        String url = "http://postman-echo.com/patch";
        String data = "This is expected to be sent back as part of response body.";
        String contentLength = "58";
        String host = "postman-echo.com";
        String x_forwarded_proto = "http";
        String connection = "close";
        String x_forwarded_port = "443";
        //"gzip,deflate" will work
        String accept_encoding = "gzip, deflate, br";
        String accept = "*/*";
        String content_type = "text/plain";

        Specifications.setupSpecifications(Specifications.requestSpec(Global.URL), Specifications.responseOK200());
        PatchResponseBody responseBody = given()
                .contentType(content_type)
                .body(data)
                .when()
                .patch("/patch")
                .then()
                .log()
                .all()
                .extract()
                .body()
                .jsonPath()
                .getObject("", PatchResponseBody.class);
        Assertions.assertEquals(url, responseBody.getUrl());
        Assertions.assertEquals(data, responseBody.getData());
        Assertions.assertEquals(json, responseBody.getJson());
        Assertions.assertEquals(contentLength, responseBody.getHeaders().getContent_length());
        Assertions.assertEquals(host, responseBody.getHeaders().getHost());
        Assertions.assertEquals(x_forwarded_proto, responseBody.getHeaders().getX_forwarded_proto());
        Assertions.assertEquals(connection, responseBody.getHeaders().getConnection());
        Assertions.assertEquals(x_forwarded_port, responseBody.getHeaders().getX_forwarded_port());
        Assertions.assertEquals(accept_encoding, responseBody.getHeaders().getAccept_encoding());
        Assertions.assertEquals(accept, responseBody.getHeaders().getAccept());
    }

}
