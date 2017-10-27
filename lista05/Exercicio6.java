package lista05;

public class Exercicio6 {
	private int numeroConta;
	private String nomeCliente;
	private double saldo;
	
	public Exercicio6(int numeroConta, String nomeCliente, double saldo) {
		this.numeroConta = numeroConta;
		this.nomeCliente = nomeCliente;
		this.saldo = saldo;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return "\nNúmero da conta: " + numeroConta + "\nNome do cliente: " + nomeCliente + "\nSaldo bancário: " + saldo + "\n";
	}
}
