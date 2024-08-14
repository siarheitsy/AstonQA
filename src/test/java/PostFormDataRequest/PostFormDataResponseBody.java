package PostFormDataRequest;

import ResponseTemplate.ResponseArgs;
import ResponseTemplate.ResponseBody;
import ResponseTemplate.ResponseFiles;
import ResponseTemplate.ResponseHeaders;
import com.fasterxml.jackson.annotation.JsonProperty;

public class PostFormDataResponseBody extends ResponseBody {

    private String data;
    private ResponseFiles files;
    private PostFormDataResponseForm form;
    private PostFormDataResponseJson json;

    public PostFormDataResponseBody(@JsonProperty("args") ResponseArgs args, @JsonProperty("data") String data, @JsonProperty("files") ResponseFiles files, @JsonProperty("form") PostFormDataResponseForm form, @JsonProperty("headers") ResponseHeaders headers, @JsonProperty("json") PostFormDataResponseJson json, @JsonProperty("url") String url) {
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

    public PostFormDataResponseForm getForm() {
        return form;
    }

    public PostFormDataResponseJson getJson() {
        return json;
    }

}
