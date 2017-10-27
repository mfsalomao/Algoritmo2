package lista05;

import javax.swing.JOptionPane;

public class Exercicio6Vet {
	private Exercicio6 [] vetor;
	private int quantVetor;
	
	public Exercicio6Vet(int tam) {
		this.vetor = new Exercicio6 [tam];
		this.quantVetor = 0;
	}

	public Exercicio6 getVetor(int i) {
		return vetor[i];
	}

	public void setVetor(int i, Exercicio6 novo) {
		this.vetor[i] = novo;
	}

	public int getQuantVetor() {
		return quantVetor;
	}

	public void setQuantVetor(int quantVetor) {
		this.quantVetor = quantVetor;
	}

	@Override
	public String toString() {
		String resposta = "";
		for (int i=0; i<quantVetor; i++) {
			resposta += "\n" + (i+1) +"." + vetor[i] + "\n";
		}
		return resposta;
	}
	
	public boolean inserirElementoVetor (Exercicio6 novo) {
		if (this.quantVetor == this.vetor.length) {
			return false;
		}else{
			this.vetor[quantVetor] = novo;
			this.quantVetor ++;
			return true;
		}
	}
	
	public String consultarElementoVetor (String nom) {
		String janela = "";
		int i = 0;
		while (i<this.quantVetor && !this.vetor[i].getNomeCliente().equals(nom)){
			i++;
		}
		if (i == this.quantVetor) {
			return "Cliente não encontrado!";
		}else{
			for (int j=0; j<this.quantVetor; j++) {
				if (this.vetor[j].getNomeCliente().equals(nom)) {
					janela += this.vetor[j].toString();
				}
			}
			return janela;
		}
	}
	
	public boolean excluirConta() {
		if (this.quantVetor == 0) {
			return false;
		}else{
			double menor = this.vetor[0].getSaldo();
			int posicao = 0;
			for (int i=0; i<this.quantVetor; i++) {
				if (this.vetor[i].getSaldo() < menor) {
					posicao = i;
				}
			}
			this.vetor[posicao] = this.vetor[this.quantVetor-1];
			this.quantVetor --;
			return true;
		}
	}
}
