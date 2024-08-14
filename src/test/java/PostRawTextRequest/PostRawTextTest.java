package PostRawTextRequest;

import Global.Global;
import Specifications.Specifications;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class PostRawTextTest {

    @Test
    public void postRawTextTest() {
        //"{\"test\":\"value\"}" will work
        String data = "{\n    \"test\": \"value\"\n}";
        String json = null;
        String url = "http://postman-echo.com/post";
        RawText rawText = new RawText("value");
        //16 will work
        String contentLength = "23";
        String host = "postman-echo.com";
        String x_forwarded_proto = "http";
        String connection = "close";
        String x_forwarded_port = "443";
        //"gzip,deflate" will work
        String accept_encoding = "gzip, deflate, br";
        String accept = "*/*";
        //"text/plain; charset=ISO-8859-1" will work
        String content_type = "text/plain";

        Specifications.setupSpecifications(Specifications.requestSpec(Global.URL), Specifications.responseOK200());
        PostRawTextResponseBody responseBody = given()
                .body(rawText)
                .when()
                .post("/post")
                .then()
                .log()
                .all()
                .extract()
                .body()
                .jsonPath()
                .getObject("", PostRawTextResponseBody.class);
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
