package test;

import org.apache.camel.EndpointInject;
import org.apache.camel.ProducerTemplate;
import org.apache.camel.test.spring.junit5.CamelSpringBootTest;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@CamelSpringBootTest
class CamelTest {

    @EndpointInject("seda:in")
    ProducerTemplate in;

    @Test
    void test() throws Exception {
        in.sendBody("{}");
    }
}
