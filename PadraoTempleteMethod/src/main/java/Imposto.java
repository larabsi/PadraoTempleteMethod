public abstract class Imposto {
    private String estado;
    private float valorCapital;


    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public float getValorCapital() {
        return valorCapital;
    }

    public float setValorCapital(float valorCapital) {
        if (valorCapital <= 0) {
            throw new IllegalArgumentException("O valor deve ser maior que zero.");
        }
       return this.valorCapital = valorCapital;
    }

    public float calcularImposto(float taxa) {
        return this.valorCapital*taxa;}

        public abstract float verificarImposto();

    public String getTipo() {
        return "Imposto";
    }
    public String getInfo() {
        return getTipo() + "{" +
                ", estado='" + this.estado +
                ", valorCapital=' "+ this.valorCapital+'\'' +
                ", valor do imposto=" + this.verificarImposto() +
                '}';
    }
}
