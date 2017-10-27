/* Nome: Martinho de Freitas Salomão
 * Disciplina: Algoritmo 2
 * Data: 17/10/2017
*/

package lista05;

public class Exercicio7Vet {
	private Exercicio7 [] vetor;
	private int quantVetor;
	
	// Construtor
	public Exercicio7Vet (int tam) {
		this.vetor = new Exercicio7 [tam];
		this.quantVetor = 0;
	}
	
	// Gets, sets e toString
	public Exercicio7 getVetor (int indice) {
		return this.vetor[indice];
	}
	
	public void setVetor (int indice, Exercicio7 novo) {
		this.vetor[indice] = novo;
	}
	
	public int getQuantVetor () {
		return this.quantVetor;
	}
	
	public void setQuantVetor (int novo) {
		this.quantVetor = novo;
	}
	
	public String toString () {
		String resposta = "";
		for (int i=0; i<this.quantVetor; i++) {
			resposta += "\n" + (i+1) + "." +
                                this.vetor[i].toString(); 
		}
		return resposta;
	}
	
	// Inserção no vetor
	public boolean incluirElementoVetor (Exercicio7 novo) {
		if (this.quantVetor == this.vetor.length) {
			return false;
		}else{
			this.vetor[this.quantVetor] = novo;
			quantVetor ++;
			return true;
		}
	}
	
	// Busca no vetor
	public int buscarFuncionario (String nomePesquisado) {
		int i = 0;
		while ((i<this.quantVetor) && 
                        (!this.vetor[i].getNome().equals(nomePesquisado))) {
			i++;
		}
		if (i == this.quantVetor) {
			return -1;
		}else{
			return i;
		}
	}
	
	// Altera horas no vetor e "seta" novo salário.
	public boolean alterarHoras (String nomePesquisado, int novo) {
		int posicaoVetor;
		if (buscarFuncionario(nomePesquisado) > -1) {
			posicaoVetor = buscarFuncionario(nomePesquisado);
			this.vetor[posicaoVetor].setHoras(novo);
			this.vetor[posicaoVetor].setSalario(novo);
			return true;
		}else{
			return false;
		}
	}
}