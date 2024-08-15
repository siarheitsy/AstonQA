package GetRequest;

import Global.Global;
import Specifications.Specifications;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.Matchers.startsWith;

public class GetRequestTest {

    @Test
    public void getRequestTest() {

        String url = "http://postman-echo.com/get";
        String host = "postman-echo.com";
        String x_forwarded_proto = "http";
        String connection = "close";
        String x_forwarded_port = "443";
        String accept = "*/*";
        String x_request_start = "t=17";
        String x_amzn_trace_id = "Root=1-66";

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
        Assertions.assertEquals(url, responseBody.getUrl());
        Assertions.assertEquals(host, responseBody.getHeaders().getHost());
        Assertions.assertEquals(x_forwarded_proto, responseBody.getHeaders().getX_forwarded_proto());
        Assertions.assertEquals(connection, responseBody.getHeaders().getConnection());
        Assertions.assertEquals(x_forwarded_port, responseBody.getHeaders().getX_forwarded_port());
        Assertions.assertEquals(accept, responseBody.getHeaders().getAccept());
        assertThat(responseBody.getHeaders().getX_request_start(), allOf(startsWith(x_request_start)));
        assertThat(responseBody.getHeaders().getX_amzn_trace_id(), allOf(startsWith(x_amzn_trace_id)));
    }

}