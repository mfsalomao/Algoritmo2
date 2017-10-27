package lista05;

public class Exercicio3Vet {
    private Exercicio3 [] vetor;
    private int quantVetor;
    
    public Exercicio3Vet (int tam) {
        this.vetor = new Exercicio3 [tam];
        this.quantVetor = 0;
    }

    public Exercicio3 getVetor(int i) {
        return this.vetor[i];
    }

    public void setVetor(int i, Exercicio3 novo) {
        this.vetor[i] = novo;
    }

    public int getQuantVetor() {
        return this.quantVetor;
    }

    public void setQuantVetor(int i) {
        this.quantVetor = i;
    }
    
    public String toString() {
        String resposta = "";
        for (int i=0; i<quantVetor;i++) {
            resposta += (i+1) + "." + "\n" + this.vetor[i] + "\n";
        }
        return resposta;
    }
    
    public boolean inserirElementoVetor (Exercicio3 novo) {
        if (this.quantVetor == this.vetor.length) {
            return false;
        }else{
            this.vetor[this.quantVetor] = novo;
            this.quantVetor ++;
            return true;
        }
    }
    
    public String consultarNomesNotas (double valor) {
        String NomesNotas = "";
        int contador = 0;
        for (int i=0; i<this.quantVetor; i++) {
            if ( (this.vetor[i].getNota1() < valor) && (this.vetor[i].getNota2() < valor) ) {
                NomesNotas += this.vetor[i].getNome() + "\n";
                contador ++;
            }
        }
        if (contador > 0) {
            return NomesNotas;
        }else{
            return "Não foram encontrados alunos com as duas notas menores que " + valor;
        }
         
    }    
}


