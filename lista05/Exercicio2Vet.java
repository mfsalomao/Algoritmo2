package lista05;

public class Exercicio2Vet {
    private Exercicio2 [] vetor;
    private int quantVetor;
    
    public Exercicio2Vet (int tam) {
        this.vetor = new Exercicio2 [tam];
        this.quantVetor = 0;
    }
    
    public Exercicio2 getVetor (int i) {
        return this.vetor[i];
    }
    
    public void setVetor (int i, Exercicio2 novo) {
        this.vetor[i] = novo;
    }
    
    public int getQuantVetor() {
        return this.quantVetor;
    }
    
    public void setQuantVetor (int novo) {
        this.quantVetor = novo;
    }
    
    public String toString () {
        String resposta = "";
        for (int i=0; i<this.quantVetor; i++) {
            resposta += (i+1) + "." + "\n" + this.vetor[i] + "\n";
        }
        return resposta;
    }
    
    public boolean incluirElementoVetor (Exercicio2 novo) {
        if (this.quantVetor == this.vetor.length) {
            return false;
        }else{
            this.vetor[quantVetor] = novo;
            quantVetor ++;
            return true;
        }
    }
    
    public int consultarElementoVetor (String nom) {
        int i = 0;
        while (i<quantVetor && !this.vetor[i].getNome().equals(nom)) {
            i++;
        }
        if (i == quantVetor) {
            return -1;
        }else{
            return i;
        }
    }
    
    public int somaVendedoresTipo (char t) {
        int totalVendedores = 0;
        for (int i=0; i<this.quantVetor; i++) {
            if (this.vetor[i].getTipo() == t) {
                totalVendedores++;
            }
        }
        return totalVendedores;
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


