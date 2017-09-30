package Lista03;

import java.util.Scanner;

public class Exerc12 {
	
	public static void main (String[] args) {
		int [] vetor;
		vetor = new int [10];
		int soma;
		preencherVetor(vetor);
		soma = somarVetor(vetor);
		System.out.println("A soma do vetor é "+soma+".");
	}
	
	public static void preencherVetor (int [] vet) {
		Scanner scan = new Scanner(System.in);
		for (int i=0; i<vet.length ; i++) {
			System.out.print("Prencha a posição "+i+" do vetor: ");
			vet[i] = scan.nextInt();
		}
	}
	
	public static int somarVetor (int [] entrada) {
		int saida = 0;
		for (int i=0; i<entrada.length; i++) {
			saida += entrada[i];
		}
		return saida;
	}
		

}
