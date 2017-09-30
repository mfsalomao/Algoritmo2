package Lista03;

import java.util.Scanner;

public class Exerc17 {

	public static void main(String[] args) {
		int[] vetor;
		vetor = new int[15];
		preencherVetor(vetor);
		if (testarRepetidos(vetor)) {
			System.out.println("Há elementos repetidos no vetor.");
		}else{
			System.out.println("Não há elementos repetidos no vetor.");
		}
	}
	
	public static void preencherVetor (int [] vet) {
		Scanner scan = new Scanner(System.in);
		for (int i=0; i<vet.length ; i++) {
			System.out.print("Prencha a posição "+i+" do vetor: ");
			vet[i] = scan.nextInt();
		}
	}
	
	public static boolean testarRepetidos(int [] entrada) {
		int soma = 0;
		int numero;
		for (int i=0; i<entrada.length-1; i++) {
			numero = entrada[i];
			for (int j=i+1; j<entrada.length; j++) {
				if (entrada[j] == numero) {
					soma ++;
				}
			}
		}
		if (soma != 0) {
			return true;
		}else{
			return false;
			
		}
	}

}
