package PostRawTextRequest;

import ResponseTemplate.ResponseBody;
import ResponseTemplate.ResponseHeaders;
import ResponseTemplate.ResponseArgs;
import ResponseTemplate.ResponseFiles;
import ResponseTemplate.ResponseForm;
import com.fasterxml.jackson.annotation.JsonProperty;

public class PostRawTextResponseBody extends ResponseBody {

    private String data;
    private ResponseFiles files;
    private ResponseForm form;
    private Object json;

    public PostRawTextResponseBody(@JsonProperty("args") ResponseArgs args, @JsonProperty("data") String data, @JsonProperty("files") ResponseFiles files, @JsonProperty("form") ResponseForm form, @JsonProperty("headers") ResponseHeaders headers, @JsonProperty("json") Object json, @JsonProperty("url") String url) {
        super(args, headers, url);
        this.data = data;
        this.files = files;
        this.form = form;
        this.json = json;
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

    public Object getJson() {
        return json;
    }

}
