import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class TestImpostoNordeste {

    @Test
    void devecalcularValorImpostoNordeste() {
        ImpostoNordeste impostoNordeste = new ImpostoNordeste();
        impostoNordeste.setValorCapital(1000);
        assertEquals(800, impostoNordeste.verificarImposto());
    }
    @Test
    void develancarExcessaoValorNegativoNordeste() {

        try {
            ImpostoNordeste impostoNordeste = new ImpostoNordeste();
            impostoNordeste.setValorCapital(-5);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("O valor deve ser maior que zero.", e.getMessage());
        }
    }
}

