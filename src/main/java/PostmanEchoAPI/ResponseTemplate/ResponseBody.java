package PostmanEchoAPI.ResponseTemplate;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ResponseBody {

    private ResponseArgs args;
    private ResponseHeaders headers;
    private String url;
    private String data;
    private ResponseFiles files;
    private ResponseForm form;
    private ResponseJson json;

    public ResponseBody(@JsonProperty("args") ResponseArgs args, @JsonProperty("data") String data, @JsonProperty("files") ResponseFiles files, @JsonProperty("form") ResponseForm form, @JsonProperty("headers") ResponseHeaders headers, @JsonProperty("json") ResponseJson json, @JsonProperty("url") String url) {
        this.args = args;
        this.headers = headers;
        this.url = url;
        this.data = data;
        this.files = files;
        this.form = form;
        this.json = json;
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

    public String getData() {
        return data;
    }

    public ResponseFiles getFiles() {
        return files;
    }

    public ResponseForm getForm() {
        return form;
    }

    public ResponseJson getJson() {
        return json;
    }
}
