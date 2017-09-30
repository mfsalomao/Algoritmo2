package Lista03;

import java.util.Scanner;

public class Exerc18 {

	public static void main(String[] args) {
		double[] vetor = new double [1000];
		preencherVetor(vetor);
		System.out.println("O maior valor é "+ mostrarMaior(vetor));
		System.out.println("O menor valor é "+ mostrarMenor(vetor));
		System.out.println("A quantidade de elementos do vetor é "+mostrarQuant(vetor));
		System.out.println("A média do vetor é "+calcularMedia(vetor));
	}
	
	public static void preencherVetor (double[] vet) {
		Scanner scan = new Scanner(System.in);
		for (int i=0; i<vet.length; i++ ){
			System.out.print("Prencha a posição "+i+" do vetor: (-1 para sair) ");
			vet[i] = scan.nextDouble();
			if (vet[i] == -1) {
				vet[i] = 0;
				i = vet.length;
			}
		}
	}
	
	public static double mostrarMaior (double [] entrada) {
		double maior = entrada[0];
		int posicao = 0;
		for (int i=1; i<entrada.length; i++) {
			if (entrada[i] > maior) {
				maior = entrada[i];
				posicao = i;
			}
		}
		return maior;	
	}
	
	public static double mostrarMenor (double [] entrada) {
		double menor = entrada[0];
		int posicao = 0;
		for (int i=1; i<mostrarQuant(entrada); i++) {
			if (entrada[i] < menor) {
				menor = entrada[i];
				posicao = i;
			}
		}
		return menor;	
	}
	
	public static int mostrarQuant (double [] entrada) {
		int[] zeros = new int[entrada.length];
		int somaEntrada = 0;
		int somaZeros = 0;
		for (int i=0; i<entrada.length; i++) {
			for (int j=i; j<entrada.length;j++) {
				if (entrada[j] == 0) {
					somaEntrada++;
				}
			}
			zeros[i] = somaEntrada;
			somaEntrada = 0;
		}
		for (int i=0; i<zeros.length; i++) {
			if (zeros[i] == zeros.length-i-1) {
				somaZeros = zeros[i];
			}
		}
		somaZeros = zeros.length-somaZeros;
		return somaZeros;
	
	}
	
	public static double calcularMedia (double [] entrada) {
		int soma = 0;
		double media;
		for (int i=0; i<mostrarQuant(entrada); i++) {
			soma += entrada[i];
		}
		media = soma/mostrarQuant(entrada);
		return media;
	}

}
