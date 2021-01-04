package test;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class Route extends RouteBuilder {

    public static final String IN_URI = "seda:in";

    @Override
    public void configure() {
        from(IN_URI)
            .to("http://{{http.username}}:{{http.password}}@{{http.host}}:{{http.port}}");
    }
}
