package PostRawTextRequest;

import ResponseTemplate.*;
import com.fasterxml.jackson.annotation.JsonProperty;

public class PostRawTextResponseBody extends ResponseBody {

    private Object data;
    private ResponseFiles files;
    private ResponseForm form;
    private Object json;

    public PostRawTextResponseBody(@JsonProperty("args") ResponseArgs args, @JsonProperty("data") Object data, @JsonProperty("files") ResponseFiles files, @JsonProperty("form") ResponseForm form, @JsonProperty("headers") ResponseHeaders headers, @JsonProperty("json") Object json, @JsonProperty("url") String url) {
        super(args, headers, url);
        this.data = data;
        this.files = files;
        this.form = form;
        this.json = json;
    }

    public Object getData() {
        return data;
    }

    public ResponseFiles getFiles() {
        return files;
    }

    public ResponseForm getForm() {
        return form;
    }

    public Object getJson() {
        return json;
    }

}
