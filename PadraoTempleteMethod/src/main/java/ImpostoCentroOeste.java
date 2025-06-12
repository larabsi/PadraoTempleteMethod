public class ImpostoCentroOeste extends Imposto {

    public float verificarImposto() {
            return calcularImposto()*0.8;
        }
    }
    @Override
    public String getTipo() {
        return "Imposto Região centro-oeste";
    }
}

