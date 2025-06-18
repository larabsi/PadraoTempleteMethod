import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class TestImpostoNorte {

    @Test
    void devecalcularValorImpostoNorte() {
        ImpostoNorte impostoNorte = new ImpostoNorte();
        impostoNorte.setValorCapital(1000);
        assertEquals(800, impostoNorte.verificarImposto());
    }
    @Test
    void develancarExcessaoValorNegativoNorte() {

        try {
            ImpostoNorte impostoNorte = new ImpostoNorte();
            impostoNorte.setValorCapital(-5);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("O valor deve ser maior que zero.", e.getMessage());
        }
    }
}
