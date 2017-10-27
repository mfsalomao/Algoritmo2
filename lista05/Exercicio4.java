package lista05;

public class Exercicio4 {
	private int codigo;
	private String descricao;
	private double precoCompra;
	private double precoVenda;
	private int estoque;
	private int estoqueMin;
	
	public Exercicio4 () {
		this.codigo = 0;
		this.descricao = "";
		this.precoCompra = 0;
		this.precoVenda = 0;
		this.estoque = 0;
		this.estoqueMin = 0;
	}
	
	public Exercicio4 (int codigo, String descricao, double precoCompra, double precoVenda, int estoque,
			int estoqueMin) {
		this.codigo = codigo;
		this.descricao = descricao;
		this.precoCompra = precoCompra;
		this.precoVenda = precoVenda;
		this.estoque = estoque;
		this.estoqueMin = estoqueMin;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getPrecoCompra() {
		return precoCompra;
	}

	public void setPrecoCompra(double precoCompra) {
		this.precoCompra = precoCompra;
	}

	public double getPrecoVenda() {
		return precoVenda;
	}

	public void setPrecoVenda(double precoVenda) {
		this.precoVenda = precoVenda;
	}

	public int getEstoque() {
		return estoque;
	}

	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}

	public int getEstoqueMin() {
		return estoqueMin;
	}

	public void setEstoqueMin(int estoqueMin) {
		this.estoqueMin = estoqueMin;
	}

	public String toString() {
		return "\nCodigo: " + codigo + "\nDescrição: " + descricao + "\nPreço de compra: R$ " + String.format("%.2f", precoCompra)
				+ "\nPreço de venda: R$ " + String.format("%.2f", precoVenda) + "\nQuantidade em estoque: " + estoque + 
				"\nEstoque mínimo: " + estoqueMin + "\n";
	}
}
