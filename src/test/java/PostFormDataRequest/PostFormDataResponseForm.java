package PostFormDataRequest;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PostFormDataResponseForm {

    private String foo1;
    private String foo2;

    public PostFormDataResponseForm(@JsonProperty("foo1") String foo1, @JsonProperty("foo2") String foo2) {
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
