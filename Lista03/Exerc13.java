package Lista03;

import java.util.Scanner;

public class Exerc13 {

	public static void main(String[] args) {
		int [] vetor;
		vetor = new int [50];
		preencherVetor(vetor);
		mostrarMaior(vetor);
	}
	
	public static void preencherVetor (int [] vet) {
		Scanner scan = new Scanner(System.in);
		for (int i=0; i<vet.length ; i++) {
			System.out.print("Prencha a posição "+i+" do vetor: ");
			vet[i] = scan.nextInt();
		}
	}
	
	public static void mostrarMaior(int [] entrada) {
		int maior = entrada[0]; 
		int posicao = 0;
		for (int i=1; i<entrada.length; i++) {
			if (entrada[i] > maior) {
				maior = entrada[i];
				posicao = i;
			}
		}
		System.out.println("O maior número é "+maior+" e a posição no vetor é a "+posicao+".");
		
	}
}
