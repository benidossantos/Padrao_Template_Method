package padroescomportamentais.templatemethod;

public abstract class Cliente {

    private int codigo;
    protected String nome;
    private double rendaMensal;
    private double parcelaMensal;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getRendaMensal() {
        return rendaMensal;
    }

    public void setRendaMensal(double rendaMensal) {
        this.rendaMensal = rendaMensal;
    }

    public double getParcelaMensal() {
        return parcelaMensal;
    }

    public void setParcelaMensal(double parcelaMensal) {
        this.parcelaMensal = parcelaMensal;
    }

    public double calcularComprometimentoRenda() {
        return (this.parcelaMensal / this.rendaMensal) * 100;
    }

    public abstract String verificarCredito();

    public String getTipo() {
        return "Cliente";
    }

    public String getInfo() {
        return getTipo() + "{" +
                "codigo=" + this.codigo +
                ", nome='" + this.nome + '\'' +
                ", resultado=" + this.verificarCredito() +
                '}';
    }
}
