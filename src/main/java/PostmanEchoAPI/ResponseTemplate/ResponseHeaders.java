package PostmanEchoAPI.ResponseTemplate;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ResponseHeaders {

    private String host;
    private String x_forwarded_proto;
    private String x_request_start;
    private String connection;
    private String x_forwarded_port;
    private String x_amzn_trace_id;
    private String user_agent;
    private String accept;
    private String postman_token;
    private String cookie;
    private String content_type;
    private String accept_encoding;
    private String content_length;

    public ResponseHeaders(@JsonProperty("host") String host, @JsonProperty("x-forwarded-proto") String x_forwarded_proto, @JsonProperty("x-request-start") String x_request_start, @JsonProperty("connection") String connection, @JsonProperty("x-forwarded-port") String x_forwarded_port, @JsonProperty("x-amzn-trace-id") String x_amzn_trace_id, @JsonProperty("user-agent") String user_agent, @JsonProperty("accept") String accept, @JsonProperty("postman-token") String postman_token, @JsonProperty("cookie") String cookie, @JsonProperty("content-type") String content_type, @JsonProperty("accept-encoding") String accept_encoding, @JsonProperty("content-length") String content_length) {
        this.host = host;
        this.x_forwarded_proto = x_forwarded_proto;
        this.x_request_start = x_request_start;
        this.connection = connection;
        this.x_forwarded_port = x_forwarded_port;
        this.x_amzn_trace_id = x_amzn_trace_id;
        this.user_agent = user_agent;
        this.accept = accept;
        this.postman_token = postman_token;
        this.cookie = cookie;
        this.content_type = content_type;
        this.accept_encoding = accept_encoding;
        this.content_length = content_length;
    }

    public String getHost() {
        return host;
    }

    public String getX_forwarded_proto() {
        return x_forwarded_proto;
    }

    public String getX_request_start() {
        return x_request_start;
    }

    public String getConnection() {
        return connection;
    }

    public String getX_forwarded_port() {
        return x_forwarded_port;
    }

    public String getX_amzn_trace_id() {
        return x_amzn_trace_id;
    }

    public String getUser_agent() {
        return user_agent;
    }

    public String getAccept() {
        return accept;
    }

    public String getPostman_token() {
        return postman_token;
    }

    public String getCookie() {
        return cookie;
    }

    public String getContent_type() {
        return content_type;
    }

    public String getAccept_encoding() {
        return accept_encoding;
    }

    public String getContent_length() {
        return content_length;
    }

}
