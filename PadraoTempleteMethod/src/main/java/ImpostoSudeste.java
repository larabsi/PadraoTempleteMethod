public class ImpostoSudeste extends Imposto {

    public float verificarImposto() {

        return this.calcularImposto(2.4f);
    }
@Override
public String getTipo() {
    return "Imposto Região sudeste";
}
}