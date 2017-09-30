package Lista01;

import java.util.Scanner;

public class Exerc5 {

	public static void main(String[] args) {
		int [] vetor;
		vetor = new int[200];
		Scanner scan = new Scanner(System.in);
		// Construindo o vetor.
		for (int i=0; i<vetor.length; i++) {
			vetor[i] = (int) (Math.random()*1000);
		}
		// Ordenando o vetor pelo método de inserção direta.
		int i,j,temp;
		for (i = 1; i < vetor.length; i++){
			temp = vetor[i];
			j = i-1;
			while ((j >= 0)&&(vetor[j]>temp)){
				vetor[j+1] = vetor[j--];
			}
			vetor[j+1] = temp;
		}
		// Pesquisa utilizando busca binária.		
		int x = 0, meio, inicio = 0, fim = vetor.length-1;
		System.out.print("Digite o número a ser procurado: ");
		x = scan.nextInt();
		meio = (inicio + fim) / 2;
		boolean achou = false;
		while ((inicio <= fim) && (!achou)){
		   meio = (inicio + fim) / 2;
		   if (x == vetor[meio]){
		     achou = true;
		   }
		   if (x < vetor[meio]){
		     fim = meio - 1;
		   } else {
		     inicio = meio + 1;
		   }
		}
		if (!achou){
			 System.out.println("Não achou");
		} else {
		     System.out.println("Achou e está na posição "+meio);
		}
		
		// Mostrando o vetor.
		for (int k=0; k<vetor.length; k++) {
			System.out.println(vetor[k]);
		}

	}

}
