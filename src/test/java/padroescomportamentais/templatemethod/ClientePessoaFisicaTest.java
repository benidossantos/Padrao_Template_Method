package padroescomportamentais.templatemethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClientePessoaFisicaTest {

    @Test
    void deveRetornarAprovado() {
        ClientePessoaFisica cliente = new ClientePessoaFisica();
        cliente.setRendaMensal(5000.0);
        cliente.setParcelaMensal(1500.0);
        assertEquals("Aprovado", cliente.verificarCredito());
    }

    @Test
    void deveRetornarReprovado() {
        ClientePessoaFisica cliente = new ClientePessoaFisica();
        cliente.setRendaMensal(5000.0);
        cliente.setParcelaMensal(1550.0);
        assertEquals("Reprovado", cliente.verificarCredito());
    }

    @Test
    void deveRetornarInformacoes() {
        ClientePessoaFisica cliente = new ClientePessoaFisica();
        cliente.setRendaMensal(5000.0);
        cliente.setParcelaMensal(1550.0);
        cliente.setNome("Joana");
        cliente.setCodigo(2);
        assertEquals("Cliente{codigo=2, nome='Joana', resultado=Reprovado}", cliente.getInfo());
    }
}
