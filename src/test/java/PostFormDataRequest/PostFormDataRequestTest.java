package PostFormDataRequest;

import Global.Global;
import PostRawTextRequest.PostRawTextResponseBody;
import PostRawTextRequest.RawText;
import Specifications.Specifications;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class PostFormDataRequestTest {

    @Test
    public void postFormDataRequestTest() {
        String data = "";
        String foo1 = "bar1";
        String foo2 = "bar2";
        String url = "http://postman-echo.com/post";
        String contentLength = "19";
        String host = "postman-echo.com";
        String x_forwarded_proto = "http";
        String connection = "close";
        String x_forwarded_port = "443";
        //"gzip,deflate" will work"
        String accept_encoding = "gzip,deflate";
        String accept = "*/*";
        String content_type = "application/x-www-form-urlencoded";

        Specifications.setupSpecifications(Specifications.requestSpec(Global.URL), Specifications.responseOK200());
        PostFormDataResponseBody responseBody = given()
                .contentType("application/x-www-form-urlencoded; charset=utf-8")
                .formParam("foo1", "bar1")
                .formParam("foo2", "bar2")
                .when()
                .post("/post")
                .then()
                .log()
                .all()
                .extract()
                .body()
                .jsonPath()
                .getObject("", PostFormDataResponseBody.class);
        Assertions.assertEquals(url, responseBody.getUrl());
        Assertions.assertEquals(data, responseBody.getData());
        Assertions.assertEquals(foo1, responseBody.getForm().getFoo1());
        Assertions.assertEquals(foo2, responseBody.getForm().getFoo2());
        Assertions.assertEquals(foo1, responseBody.getJson().getFoo1());
        Assertions.assertEquals(foo2, responseBody.getJson().getFoo2());
        Assertions.assertEquals(contentLength, responseBody.getHeaders().getContent_length());
        Assertions.assertEquals(host, responseBody.getHeaders().getHost());
        Assertions.assertEquals(x_forwarded_proto, responseBody.getHeaders().getX_forwarded_proto());
        Assertions.assertEquals(connection, responseBody.getHeaders().getConnection());
        Assertions.assertEquals(x_forwarded_port, responseBody.getHeaders().getX_forwarded_port());
        Assertions.assertEquals(accept_encoding, responseBody.getHeaders().getAccept_encoding());
        Assertions.assertEquals(accept, responseBody.getHeaders().getAccept());
        Assertions.assertEquals(content_type, responseBody.getHeaders().getContent_type());
    }

}
