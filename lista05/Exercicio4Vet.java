package lista05;

public class Exercicio4Vet {
	private Exercicio4 [] vetor;
	private int quantVetor;
	
	public Exercicio4Vet (int tam) {
		this.vetor = new Exercicio4 [tam];
		this.quantVetor = 0;
	}

	public Exercicio4 getVetor(int i) {
		return vetor[i];
	}

	public void setVetor(int i, Exercicio4 novo) {
		this.vetor[i] = novo;
	}

	public int getQuantVetor() {
		return quantVetor;
	}

	public void setQuantVetor(int novo) {
		this.quantVetor = novo;
	}

	public String toString() {
		String resposta = "";
		for (int i=0; i<quantVetor; i++) {
			resposta += "\n" + (i+1)+ this.vetor[i];
		}
		return resposta;
	}
	
	public boolean incluirElementoVetor (Exercicio4 novo) {
		if (this.quantVetor == this.vetor.length) {
			return false;
		}else{
			this.vetor[quantVetor] = novo;
			this.quantVetor++;
			return true;
		}
	}
	
	public int consultarLucroProduto (int codig) {
		int i = 0;
		while (i<this.quantVetor && this.vetor[i].getCodigo() != codig) {
			i++;
		}
		if (i == quantVetor) {
			return -1;
		}else{
			return i;
		}
	}
	
	public String mostrarProdutosMin () {
		String produtos = "";
		int contador=0;
		for (int i=0; i<quantVetor; i++) {
			if (this.vetor[i].getEstoque() < this.vetor[i].getEstoqueMin()) {
				produtos += this.vetor[i].getDescricao() + "\n";
				contador ++;
			}
		}
		if (contador == 0) {
			return "Não foram encontrados produtos com quantidade em estoque menor do que o mínimo.";
		}else{
			return produtos;
		}
	}
}
