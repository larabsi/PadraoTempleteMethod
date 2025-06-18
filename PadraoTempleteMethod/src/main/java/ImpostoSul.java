public class ImpostoSul extends Imposto {

    public float verificarImposto() {

        return this.calcularImposto(3f);
    }
@Override
public String getTipo() {
    return "Imposto Região sul";
}
}