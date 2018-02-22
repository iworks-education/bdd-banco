package br.com.iweducation.passos;

import org.junit.Assert;

import br.com.iweducation.model.Conta;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class DepositoSteps {

	private Conta conta;
	
	@Dado("^uma conta com o titular \"(.*?)\" de numero (\\d+) com o limite (\\d+) e saldo (\\d+)$")
	public void uma_conta_do_dono_de_numero_com_o_limite_e_saldo(String dono, int numero, Double limite,
			Double saldo) {

		// Aqui a conta eh criada de acordo com os parametros enviados
		// por argumento, depois atribuida a variavel de instancia
		conta = new Conta(dono, numero, limite, saldo);
		
		// Posso me certificar se a conta foi criada
		Assert.assertNotNull(conta);
		
		
	}

	@Quando("^o for realizado um deposito no valor de (\\d+) na conta$")
	public void o_dono_realiza_o_saque_no_valor_de_na_conta(Double valor) throws Throwable{
		
		conta.depositar(valor);
		
	}

	@Entao("^o saldo da conta sera (\\d+)$")
	public void o_dono_tem_o_saldo_na_conta_no_valor_de(Double saldoEsperado) {
		
		// Aqui eu verifico se o saldo esperado eh igual 
		// ao saldo atual do objeto conta
		
		Assert.assertEquals(saldoEsperado, conta.getSaldo());
	}

}
