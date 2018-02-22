package br.com.iweducation.passos;

import static org.junit.Assert.assertEquals;

import java.util.List;

import br.com.iweducation.model.Banco;
import br.com.iweducation.model.Conta;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BancoSteps {
	
	private Banco banco;
    private int totalContas;
    private Double totalDinheiro;

    @Given("^que as contas sao do \"(.*?)\"$")
    public void que_as_contas_sao_do(String nome, List<Conta> listaDeContas) throws Throwable {
          banco = new Banco(nome, listaDeContas);

    }

    @Given("^o calculo do total de contas criadas$")
    public void o_calculo_do_total_de_contas_criadas() throws Throwable {
          totalContas = banco.getListaDeContas().size();
    }

    @When("^o total de contas e (\\d+)$")
    public void o_total_de_contas_e(int totalContasEsperado) throws Throwable {
          assertEquals("O calculo do total de contas esta incorreto", 
          totalContasEsperado, totalContas);
    }

    @When("^o calculo do total de dinheiro$")
    public void o_calculo_do_total_de_dinheiro() throws Throwable {
          totalDinheiro = banco.getListaDeContas().stream().mapToDouble
          (c -> c.getSaldo()).sum();
    }

    @Then("^o total de dinheiro no banco e (\\d+)$")
    public void o_total_de_dinheiro_no_banco_e(Double totalDinheiroEsperado) 
      throws Throwable {

          assertEquals("O calculo do total de dinheiro no banco " + banco.getNome() 
           + " esta incorreto",
           totalDinheiroEsperado, totalDinheiro);
    }

}
