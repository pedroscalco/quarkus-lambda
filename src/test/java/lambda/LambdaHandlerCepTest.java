package lambda;

import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;
import model.OutputCEP;

@QuarkusTest
public class LambdaHandlerCepTest {

    @Test
    public OutputCEP testGetCep() throws Exception {

        System.out.println("input foi");

        return new OutputCEP();

    }
}
