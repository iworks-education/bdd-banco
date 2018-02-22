package br.com.iweducation.model;

public class Conta {

	private String dono;
	private Integer numero;
	private Double saldo = 0.0;
	private Double limite = 0.0;

	public Conta(String dono, int numero, Double limite, Double saldo) {
		this.dono = dono;
		this.numero = numero;
		this.saldo = saldo;
		this.limite = limite;

	}

	public boolean sacar(Double valor) {
		if ((saldo + limite) < valor) {
			// Nao pode sacar
			return false;
		} else {
			// Pode sacar
			saldo = saldo - valor;
			return true;
		}
	}

	public void depositar(Double quantidade) {
		saldo += quantidade;
	}

	public String getDono() {
		return dono;
	}

	public void setDono(String dono) {
		this.dono = dono;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public Double getSaldo() {
		return saldo + limite;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public Double getLimite() {
		return limite;
	}

	public void setLimite(Double limite) {
		this.limite = limite;
	}

	public boolean transfere(Double valor, Conta favorecido) {

		if (this.sacar(valor)) {

			favorecido.depositar(valor);
			return true;
		}

		return false;
	}

}
