package GetRequest;

import ResponseTemplate.ResponseArgs;
import ResponseTemplate.ResponseBody;
import ResponseTemplate.ResponseHeaders;
import com.fasterxml.jackson.annotation.JsonProperty;

public class GetResponseBody extends ResponseBody {

    public GetResponseBody(@JsonProperty("args") ResponseArgs args, @JsonProperty("headers") ResponseHeaders headers, @JsonProperty("url") String url) {
        super(args, headers, url);
    }

}
