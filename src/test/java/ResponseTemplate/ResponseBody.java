package ResponseTemplate;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ResponseBody {

    private ResponseArgs args;
    private ResponseHeaders headers;
    private String url;

    public ResponseBody(@JsonProperty("args") ResponseArgs args, @JsonProperty("headers") ResponseHeaders headers, @JsonProperty("url") String url) {
        this.args = args;
        this.headers = headers;
        this.url = url;
    }

    public ResponseArgs getArgs() {
        return args;
    }

    public ResponseHeaders getHeaders() {
        return headers;
    }

    public String getUrl() {
        return url;
    }

}
