import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class TestImpostoSudeste {

    @Test
    void devecalcularValorImpostoSudeste() {
        ImpostoSudeste impostoSudeste = new ImpostoSudeste();
        impostoSudeste.setValorCapital(1000);
        assertEquals(2400, impostoSudeste.verificarImposto());
    }
    @Test
    void develancarExcessaoValorNegativoSudeste() {

        try {
            ImpostoSudeste impostoSudeste = new ImpostoSudeste();
            impostoSudeste.setValorCapital(-5);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("O valor deve ser maior que zero.", e.getMessage());
        }
    }

}
