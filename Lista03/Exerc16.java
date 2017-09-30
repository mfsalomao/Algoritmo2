package Lista03;

import java.util.Scanner;

public class Exerc16 {

	public static void main(String[] args) {
		String[] vetor;
		vetor = new String[10];
		int opcao;
		Scanner scan = new Scanner(System.in);
		do {
			System.out.println("\n*******************************");
			System.out.println("Escolha uma opção: ");
			System.out.println("1 - Inserir");
			System.out.println("2 - Listar");
			System.out.println("3 - Sair");
			System.out.println("*******************************\n");
			System.out.print("> ");
			opcao = scan.nextInt();
			switch(opcao) {
			case 1:
				preencherVetor(vetor);
				break;
			case 2:
				listarVetor(vetor);
				break;
			case 3:
				System.out.println("Saindo do programa...\n");
				break;
			default:
				System.out.println("Erro. Digite uma opção válida. \n");
				break;
			}
		} while(opcao != 3);

	}
	
	public static void preencherVetor(String[] vet) {
		Scanner scan = new Scanner(System.in);
		for (int i=0; i<vet.length; i++) {
			System.out.print("Informe o elemento "+(i+1)+"° do vetor: ");
			vet[i] = scan.next();
		}
	}
	
	public static void listarVetor(String[] entrada) {
		for (int i=0; i<entrada.length; i++) {
			System.out.print(entrada[i]+" ");
		}
	}
	
		
}
