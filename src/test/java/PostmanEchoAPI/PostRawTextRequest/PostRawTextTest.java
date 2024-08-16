package PostmanEchoAPI.PostRawTextRequest;

import PostmanEchoAPI.Global.Global;
import PostmanEchoAPI.ResponseTemplate.ResponseBody;
import PostmanEchoAPI.Specifications.Specifications;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.assertAll;

public class PostRawTextTest {

    @Test
    public void postRawTextTest() {
        String[] data = new String[] {"{", "\n", "\"test\":\"value\"", "\n", "}"};
        String json = null;
        String url = "https://postman-echo.com/post";
        RawText rawText = new RawText("value");
        String content_length = "23";
        String host = "postman-echo.com";
        String x_forwarded_proto = "https";
        String connection = "close";
        String x_forwarded_port = "443";
        String[] accept_encoding = new String[] {"gzip", "deflate", "br"};
        String accept = "*/*";
        String content_type = "text/plain";
        String x_request_start = "t=17";
        String x_amzn_trace_id = "Root=1-66";

        Specifications.setupSpecifications(Specifications.requestSpec(Global.URL), Specifications.responseOK200());
        ResponseBody responseBody = given()
                .body(rawText)
                .when()
                .post("/post")
                .then()
                .log()
                .all()
                .extract()
                .body()
                .jsonPath()
                .getObject("", ResponseBody.class);
        final boolean isContentLengthInBoundaries = (Integer.parseInt(content_length) >= Integer.parseInt(responseBody.getHeaders().getContent_length()));
        assertAll(
                "Grouped assertions of POST Raw Text request response",
                () -> Assertions.assertEquals(url, responseBody.getUrl()),
                () -> assertThat(responseBody.getData(), anyOf(startsWith(data[0]), endsWith(data[data.length-1]), containsString(data[1]), containsString(data[2]), containsString(data[3]))),
                () -> Assertions.assertEquals(json, responseBody.getJson()),
                () -> Assertions.assertTrue(isContentLengthInBoundaries),
                () -> Assertions.assertEquals(host, responseBody.getHeaders().getHost()),
                () -> Assertions.assertEquals(x_forwarded_proto, responseBody.getHeaders().getX_forwarded_proto()),
                () -> Assertions.assertEquals(connection, responseBody.getHeaders().getConnection()),
                () -> Assertions.assertEquals(x_forwarded_port, responseBody.getHeaders().getX_forwarded_port()),
                () -> Assertions.assertEquals(accept, responseBody.getHeaders().getAccept()),
                () -> assertThat(responseBody.getHeaders().getAccept_encoding(), anyOf(containsString(accept_encoding[0]), containsString(accept_encoding[1]), containsString(accept_encoding[2]))),
                () -> assertThat(responseBody.getHeaders().getX_request_start(), allOf(startsWith(x_request_start))),
                () -> assertThat(responseBody.getHeaders().getX_amzn_trace_id(), allOf(startsWith(x_amzn_trace_id)))
        );
    }

}
