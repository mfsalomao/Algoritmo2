package Lista01;

import java.util.Scanner;

public class Exerc1 {

	public static void main(String[] args) {
		int [] A;
		A = new int [5];
		Scanner scan = new Scanner(System.in);
		for (int i=0; i<A.length; i++) {
			System.out.print("Digite um número inteiro: ");
			A[i] = scan.nextInt();
			}
		int aux;
		for (int j=0; j<A.length-1; j++) {
			for (int k=0; k<A.length-1-j; k++) {
				if (A[k] > A[k+1]) {
					aux = A[k];
					A[k] = A[k+1];
					A[k+1] = aux;
				}
			}
		}
		int l=0;
		int pesq;
		System.out.print("Informe um número a ser pesquisado: ");
		pesq = scan.nextInt();
		while ((l<A.length) && (pesq != A[l])) {
			l++;
		}
		if (l==A.length) {
			System.out.println("Número não encontrado.");
		}else{
			System.out.println("O número "+pesq+" foi encontrado na posição "+(l+1)+" do vetor ordenado.");
		}
		for (int m=0; m<A.length; m++) {
			System.out.print(A[m]);
			}
	}
}
