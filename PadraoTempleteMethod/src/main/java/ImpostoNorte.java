public class ImpostoNorte extends Imposto {

    public float verificarImposto() {

        return this.calcularImposto(0.8f);
    }
@Override
public String getTipo() {
    return "Imposto Região norte";
}
}