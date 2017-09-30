package Lista01;

import java.util.Scanner;

public class Exerc2 {

	public static void main(String[] args) {
		int [] A;
		A = new int [5];
		int aux;
		int l=0;
		int pesq;
		int opcaoMenu;
		boolean preenchido = false;
		do {
			Scanner scan = new Scanner(System.in);
			System.out.println("\nEscolha uma opção:");
			System.out.println("\n1. preencher dados no vetor");
			System.out.println("\n2. ordenar os dados do vetor");
			System.out.println("\n3. pesquisar um dado no vetor");
			System.out.println("\n4. sair");
			opcaoMenu = scan.nextInt();
			switch (opcaoMenu) {
				case 1:
					for (int i=0; i<A.length; i++) {
						System.out.print("Digite um número inteiro: ");
						A[i] = scan.nextInt();
					}
					preenchido = true;
					break;
				case 2:	
					if (preenchido) {
						for (int j=0; j<A.length-1; j++) {
							for (int k=0; k<A.length-1-j; k++) {
								if (A[k] > A[k+1]) {
									aux = A[k];
									A[k] = A[k+1];
									A[k+1] = aux;
								}
							}
						}
					}else{
						System.out.println("Vetor não preenchido. Escolha opção 1 para preencher o vetor.");
					}
					break;
				case 3:
					if (preenchido) {
						System.out.print("Informe um número a ser pesquisado: ");
						pesq = scan.nextInt();
						while ((l < A.length) && (pesq != A[l])) {
							l++;
						}
						if (l == A.length) {
							System.out.println("Número não encontrado.");
						}else{
							System.out.println("O número "+pesq+" foi encontrado na posição "+(l+1)+" do vetor.");
						}
					}else{
						System.out.println("Vetor não preenchido. Escolha opção 1 para preencher o vetor.");
					}
					break;
				case 4:
					System.out.println("Fim do programa.");
					break;
				default:
					System.out.println("Opção inválida.");
					break;
			}
		}while(opcaoMenu != 4);
		System.out.println("\nExibindo o vetor...\n");
		for (int m=0; m<A.length; m++) {
			System.out.print(A[m]);
			}
	}
}