package padroescomportamentais.templatemethod;

public class ClientePessoaFisica extends Cliente {

    public String verificarCredito() {
        if (this.calcularComprometimentoRenda() <= 30.0) {
            return "Aprovado";
        }
        else {
            return "Reprovado";
        }
    }

}
