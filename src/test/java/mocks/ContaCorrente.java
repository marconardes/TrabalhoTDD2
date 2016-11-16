package mocks;

import main.InterfaceContaCorrente;

public class ContaCorrente implements InterfaceContaCorrente {
	double saldo;
	String Conta;

	
	
	public ContaCorrente(double saldo, String conta) {
		this.saldo = saldo;
		Conta = conta;
	}

	@Override
	public double getSaldo() {
			return saldo;
	}
	
	@Override
	public void depositar(Double valor) {
		saldo = saldo + valor;
	}

	public String getConta() {
		return Conta;
	}
}
