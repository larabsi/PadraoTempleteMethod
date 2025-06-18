import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class TestImpostoCentroOeste {
    @Test
    void devecalcularValorImpostoCentroOeste() {
        ImpostoCentroOeste impostoCentroOeste = new ImpostoCentroOeste();
        impostoCentroOeste.setValorCapital(1000);
        assertEquals(1800, impostoCentroOeste.verificarImposto());
    }

    @Test
    void develancarExcessaoValorNegativoCentroOeste() {

        try {
            ImpostoCentroOeste impostoCentroOeste = new ImpostoCentroOeste();
            impostoCentroOeste.setValorCapital(-5);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("O valor deve ser maior que zero.", e.getMessage());
        }
    }
}
