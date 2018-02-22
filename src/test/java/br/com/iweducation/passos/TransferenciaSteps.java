package br.com.iweducation.passos;

import org.junit.Assert;

import br.com.iweducation.model.Conta;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class TransferenciaSteps {

	private Conta favorecido;
	private Conta titular;

	@Dado("^a conta do titular \"(.*?)\" de saldo(\\d+)$")
	public void criaTitular(String dono, Double saldo) {

		titular = new Conta(dono, 1, 0.0, saldo);

	}

	@Dado("^a conta do favorecido \"(.*?)\" de saldo(\\d+)$")
	public void criaFavorecido(String dono, Double saldo) {

		favorecido = new Conta(dono, 2, 0.0, saldo);

	}

	@Quando("^o titular transferir o valor de (\\d+) na conta$")
	public void transferi(Double valor) {

		boolean transferiu = titular.transfere(valor, favorecido);
		Assert.assertTrue(transferiu);

	}

	@Entao("^o saldo da conta do favorecido tera o saldo de (\\d+)$")
	public void saldoFavorecido(Double saldoEsperado) {
		Assert.assertEquals(saldoEsperado, favorecido.getSaldo());

	}

	@Entao("^Entao o saldo da conta do titular tera o saldo de(\\d+)$")
	public void saldoTitular(Double saldoEsperado) {
		Assert.assertEquals(saldoEsperado, titular.getSaldo());

	}

}
