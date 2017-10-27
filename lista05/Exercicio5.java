package lista05;

public class Exercicio5 {
	private String nome;
	private double emprestimo;
	private double taxaJuros;
	private double parcela;
	
	public Exercicio5(String nome, double emprestimo, double taxaJuros) {
		this.nome = nome;
		this.emprestimo = emprestimo;
		this.taxaJuros = taxaJuros;
		this.parcela = emprestimo*taxaJuros;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getEmprestimo() {
		return emprestimo;
	}

	public void setEmprestimo(double emprestimo) {
		this.emprestimo = emprestimo;
	}

	public double getTaxaJuros() {
		return taxaJuros;
	}

	public void setTaxaJuros(double taxaJuros) {
		this.taxaJuros = taxaJuros;
	}
	
	public double getParcela() {
		return parcela;
	}

	public void setParcela(double parcela) {
		this.parcela = parcela;
	}
	
	

	public String toString() {
		return "\nCliente: " + nome + "\nValor do emprestimo: R$ " + String.format("%.2f",emprestimo) + "\nTaxa de juros: " + taxaJuros + "\nJuros a pagar no mês: R$ " + String.format("%.2f", parcela);
	}	

}
