package lista05;

public class Exercicio5Vet {
	private Exercicio5 [] vetor;
	private int quantVetor;
	
	public Exercicio5Vet (int tam) {
		this.vetor = new Exercicio5 [tam];
		this.quantVetor = 0;
	}

	public Exercicio5 getVetor(int i) {
		return vetor[i];
	}

	public void setVetor(int i, Exercicio5 novo) {
		this.vetor[i] = novo;
	}

	public int getQuantVetor() {
		return quantVetor;
	}

	public void setQuantVetor(int novo) {
		this.quantVetor = novo;
	}

	@Override
	public String toString() {
		String resposta = "";
		for (int i=0; i<quantVetor; i++) {
			resposta += "\n" + (i+1) + this.vetor[i];
		}
		return resposta;
	}
	
	public boolean inserirElementoVetor (Exercicio5 novo) {
		if (this.quantVetor == this.vetor.length) {
			return false;
		}else{
			this.vetor[this.quantVetor] = novo;
			this.quantVetor ++;
			return true;
		}
	}
	
	public int consultarCliente (String nome) {
		int i = 0;
		while (i<this.quantVetor && !this.vetor[i].getNome().equals(nome)) {
			i++;
		}
		if (i == this.quantVetor) {
			return -1;
		}else{
			return i;
		}
	}
	
	public int clienteMaiorEmprestimo () {
		int posicao = 0;
		double maior = 0;
		for (int i=0; i<quantVetor; i++) {
			if (this.vetor[i].getEmprestimo() > maior) {
				maior = this.vetor[i].getEmprestimo();
				posicao = i;
			}
		}
		return posicao;
	}
}
