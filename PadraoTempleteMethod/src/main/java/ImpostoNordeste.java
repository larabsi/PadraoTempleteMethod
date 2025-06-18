public class ImpostoNordeste extends Imposto {

    public float verificarImposto() {

        return this.calcularImposto(0.8f);
    }
@Override
public String getTipo() {
    return "Imposto Região nordeste";
}
}