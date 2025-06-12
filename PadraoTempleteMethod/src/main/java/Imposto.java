public abstract class Imposto {
    private String estado;
    private int cpf;
    private float valorCapital;


    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public float getValorCapital() {
        return valorCapital;
    }

    public void setValorCapital(String valorCapital) {
        this.valorCapital = valorCapital;
    }
    public float calcularImposto() {
        return (this.valorCapital);

        public abstract String verificarImposto();
    }
    public String getTipo() {
        return "Imposto";
    }
    public String getInfo() {
        return getTipo() + "{" +
                "cpf=" + this.cpf +
                ", estado='" + this.estado +
                ", valorCapital=' "+ this.valorCapital+'\'' +
                ", valor do imposto=" + this.verificarImposto() +
                '}';
    }
}
