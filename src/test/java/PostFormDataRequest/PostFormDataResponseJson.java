package PostFormDataRequest;

import ResponseTemplate.ResponseJson;
import com.fasterxml.jackson.annotation.JsonProperty;

public class PostFormDataResponseJson extends ResponseJson {

    private String foo1;
    private String foo2;

    public PostFormDataResponseJson(@JsonProperty("foo1") String foo1, @JsonProperty("foo2") String foo2) {
        this.foo1 = foo1;
        this.foo2 = foo2;
    }

    public String getFoo1() {
        return foo1;
    }

    public String getFoo2() {
        return foo2;
    }
}
