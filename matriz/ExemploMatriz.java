package matriz;

import java.util.Scanner;

public class ExemploMatriz {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		final int lin = 3;
		final int col = 2;
		String [][] matriz;
		matriz = new String [lin][col];
		// Preenchimento da matriz:
		for (int i=0; i<lin; i++) {
			for (int j=0; j<col; j++) {
				System.out.print("Digite o valor do elemento da linha "+(i+1)+", coluna "+(j+1)+" da matriz: ");
				matriz[i][j] = scan.next();				
			}
		}
		// Pesquisa e alteração da matriz:
		String pesq;
		System.out.print("Informe o termo a ser alterado: ");
		pesq = scan.next();
		int linha = 0, coluna = 0;
		while (linha < lin && !pesq.equals(matriz[linha][coluna])) {
			coluna = 1;
			while (coluna < col && !pesq.equals(matriz[linha][coluna])) {
				coluna++;
			}
			if (coluna >= col) {
				coluna = 0;
				linha++;
			}
		}
		
		if (linha >= lin || coluna >= col) {
			System.out.println("Termo não encontrado.");
		}else{
			System.out.print("Entre com um novo valor para o elemento da linha "+(linha+1)+", coluna "+(coluna+1)+": ");
			matriz[linha][coluna] = scan.next();
			System.out.println("Operação realizada com sucesso.");
		}
		
		// Exibição dos dados da matriz:
		System.out.println("Exibindo os elementos da matriz: ");
		for (int i=0; i<lin; i++) {
			for (int j=0; j<col; j++) {
				System.out.println("Linha "+(i+1)+", Coluna "+(j+1)+": "+matriz[i][j]);
			}
		}
	}
}
