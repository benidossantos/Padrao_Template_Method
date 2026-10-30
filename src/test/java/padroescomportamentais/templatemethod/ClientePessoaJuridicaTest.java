package padroescomportamentais.templatemethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClientePessoaJuridicaTest {

    @Test
    void deveRetornarAprovado() {
        ClientePessoaJuridica cliente = new ClientePessoaJuridica();
        cliente.setRendaMensal(80000.0);
        cliente.setParcelaMensal(40000.0);
        assertEquals("Aprovado", cliente.verificarCredito());
    }

    @Test
    void deveRetornarReprovado() {
        ClientePessoaJuridica cliente = new ClientePessoaJuridica();
        cliente.setRendaMensal(80000.0);
        cliente.setParcelaMensal(40100.0);
        assertEquals("Reprovado", cliente.verificarCredito());
    }

    @Test
    void deveRetornarInformacoes() {
        ClientePessoaJuridica cliente = new ClientePessoaJuridica();
        cliente.setRendaMensal(80000.0);
        cliente.setParcelaMensal(40000.0);
        cliente.setNome("Tech Invest Ltda");
        cliente.setCodigo(1);
        assertEquals("ClientePJ{codigo=1, nome='Tech Invest Ltda', resultado=Aprovado}", cliente.getInfo());
    }
}
