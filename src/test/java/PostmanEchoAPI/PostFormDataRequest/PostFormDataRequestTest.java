package PostFormDataRequest;

import Global.Global;
import ResponseTemplate.ResponseBody;
import Specifications.Specifications;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.Matchers.startsWith;

public class PostFormDataRequestTest {

    @Test
    public void postFormDataRequestTest() {
        String data = "";
        String foo1 = "bar1";
        String foo2 = "bar2";
        String url = "https://postman-echo.com/post";
        String contentLength = "19";
        String host = "postman-echo.com";
        String x_forwarded_proto = "https";
        String connection = "close";
        String x_forwarded_port = "443";
        String accept = "*/*";
        String content_type = "application/x-www-form-urlencoded";
        String[] accept_encoding = new String[] {"gzip", "deflate", "br"};
        String x_request_start = "t=17";
        String x_amzn_trace_id = "Root=1-66";

        Specifications.setupSpecifications(Specifications.requestSpec(Global.URL), Specifications.responseOK200());
        ResponseBody responseBody = given()
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
                .getObject("", ResponseBody.class);
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
        Assertions.assertEquals(accept, responseBody.getHeaders().getAccept());
        assertThat(responseBody.getHeaders().getContent_type(), allOf(containsString(content_type)));
        assertThat(responseBody.getHeaders().getAccept_encoding(), anyOf(containsString(accept_encoding[0]), containsString(accept_encoding[1]), containsString(accept_encoding[2])));
        assertThat(responseBody.getHeaders().getX_request_start(), allOf(startsWith(x_request_start)));
        assertThat(responseBody.getHeaders().getX_amzn_trace_id(), allOf(startsWith(x_amzn_trace_id)));
    }

}
