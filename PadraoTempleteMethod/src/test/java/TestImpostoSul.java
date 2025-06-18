import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class TestImpostoSul{

    @Test
    void devecalcularValorImpostoSul() {
        ImpostoSul impostoSul = new ImpostoSul();
        impostoSul.setValorCapital(1000);
        assertEquals(3000, impostoSul.verificarImposto());
    }
    @Test
    void develancarExcessaoValorNegativoSul() {

        try {
            ImpostoSul impostoSul = new ImpostoSul();
            impostoSul.setValorCapital(-5);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("O valor deve ser maior que zero.", e.getMessage());
        }
    }

}

