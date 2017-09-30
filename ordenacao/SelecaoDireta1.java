package ordenacao;

public class SelecaoDireta1 {

	public static void main(String[] args) {
		int vet[] = {23, 4, 33, 45, 19, 12, 28, 40};
	    int menor, x;
	    for(int i = 0; i < vet.length - 1; i++){
	      menor = i; // Posição 0.
	      x = vet[i]; // x = 23.
	      for(int j = i + 1; j < vet.length; j++){
	        if(vet[j] < x){
	          menor = j;  // Menor = posição 1 (onde está o 4).
	          x = vet[j]; // x = 4.
	        }
	      }
	      vet[menor] = vet[i];  // vet[1] = vet[0] (4 passa a ser 23).
	      vet[i] = x; // vet[0] = 4 (23 passa a ser 4). 
	    }
	    for(int i = 0; i < vet.length; i++){
	      System.out.println(vet[i]);
	    }
	}

}
