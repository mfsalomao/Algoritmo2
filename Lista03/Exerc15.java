package Lista03;

import java.util.Scanner;

public class Exerc15 {

	public static void main(String[] args) {
		int [] vetor;
		vetor = new int [10];
		preencherVetor(vetor);
		if (verificarOrdem(vetor)) {
			System.out.println("O vetor está em ordem crescente.");
		}else{
			System.out.println("O vetor não está em ordem crescente.");
		}
	}
	

	public static void preencherVetor (int [] vet) {
		Scanner scan = new Scanner(System.in);
		for (int i=0; i<vet.length ; i++) {
			System.out.print("Prencha a posição "+i+" do vetor: ");
			vet[i] = scan.nextInt();
		}
	}
	
	public static boolean verificarOrdem(int [] entrada) {
		int [] crescente = new int [entrada.length];
		int [] igual = new int [entrada.length];
		int somaCrescente = 0;
		int somaIgual = 0;
		for (int i=1; i<entrada.length; i++) {
			if (entrada[i] > entrada[i-1]) {
				crescente[i] = 1;
			}else{
				if (entrada[i] == entrada[i-1]) {
					crescente[i] = 1;
					igual[i] = 1;
				}else {
					crescente[i] = 0;
					igual[i] = 0;
				}
			}
		}
		for (int i=0; i<crescente.length; i++) {
			somaCrescente += crescente[i];
			somaIgual += igual[i];
		}		
		if ((somaCrescente == entrada.length-1) && (somaIgual != entrada.length-1)) {
			return true;
		}else{
			return false;
		}
	}
}
