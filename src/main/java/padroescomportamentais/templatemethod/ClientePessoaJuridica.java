package padroescomportamentais.templatemethod;

public class ClientePessoaJuridica extends Cliente {

    public String verificarCredito() {
        if (this.calcularComprometimentoRenda() <= 50.0) {
            return "Aprovado";
        }
        else {
            return "Reprovado";
        }
    }

    @Override
    public String getTipo() {
        return "ClientePJ";
    }
}
