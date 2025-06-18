public class ImpostoCentroOeste extends Imposto {

    public float verificarImposto() {

        return this.calcularImposto(1.8f);
        }
    @Override
    public String getTipo() {
        return "Imposto Região centro-oeste";
    }
}