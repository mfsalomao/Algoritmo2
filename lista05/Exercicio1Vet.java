package lista05;

public class Exercicio1Vet {
    private Exercicio1 [] vetor;
    private int quantVetor;
    
    public Exercicio1Vet (int tam) {
        this.vetor = new Exercicio1 [tam];
        this.quantVetor = 0;
    }

    public Exercicio1 getVetor(int indice) {
        return this.vetor[indice];
    }
    
    public void setVetor (int indice, Exercicio1 novo) {
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
        for (int i=0; i<quantVetor; i++) {
            resposta += "\n" + (i+1) + "." +
                    this.vetor[i].toString();
        }
        return resposta;
    }
    
    public boolean incluirElementoVetor (Exercicio1 novo) {
        if (this.quantVetor == this.vetor.length) {
            return false;
        }else{
            this.vetor[this.quantVetor] = novo;
            this.quantVetor++;
            return true;
        }
    }
    
    public int consultarElementoVetor (String nom) {
        int i = 0;
        while ( (i<this.quantVetor) && (!this.vetor[i].getTitulo().equals(nom)) ) {
            i++;
        }
        if (i == quantVetor) {
            return -1;
        }else{
            return i;
        }
    }
   
    public int somarGenero (char gen) {
        int totalFilmes = 0;
        for (int i=0; i<quantVetor; i++) {
            if (this.vetor[i].getGenero() == gen) {
                totalFilmes ++;
            }
        }
        return totalFilmes;
    }
    
    public boolean excluirElementoVetor (int posicao) {
        if (this.quantVetor == 0) {
            return false;
        }else{
            this.vetor[posicao] = this.vetor[quantVetor-1];
            this.quantVetor --;
            return true;
        }
    }
}
