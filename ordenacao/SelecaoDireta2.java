package ordenacao;

import java.util.Scanner;
import java.util.Arrays;

public class SelecaoDireta2 {
	public static void main (String [] args) {
		String [] vetor;
		vetor = new String[5];
		String [] original;
		original = new String[5];
		int menu, menor, idOrdenado, contadorBL, contadorBB;
		String sd, bs, id, bl, bb;
		boolean encontrouBB = false;
		Scanner scan = new Scanner(System.in);
		do {
			System.out.println("\n************************************");
			System.out.println("*** Escolha sua opção:           ***");
			System.out.println("***                              ***");
			System.out.println("*** 1) Preencher vetor;          ***");
			System.out.println("*** 2) Ordenar por SD;           ***");
			System.out.println("*** 3) Ordenar por BS;           ***");
			System.out.println("*** 4) Ordenar por ID;           ***");
			System.out.println("*** 5) Busca linear;             ***");
			System.out.println("*** 6) Busca binária;            ***");
			System.out.println("*** 7) Mostrar vetor original;   ***");
			System.out.println("*** 8) Mostrar vetor ordenado;   ***");
			System.out.println("***                              ***");
			System.out.println("************************************");
			System.out.println("");
			System.out.print("> ");
			menu = scan.nextInt();
			switch (menu) {
			case 1:
				for (int i=0; i<vetor.length; i++) {
					System.out.print("Digite o elemento ("+(i+1)+"/"+vetor.length+") da posição do vetor: ");
					vetor[i] = scan.next();
					original[i] = vetor[i];
				}
				break;
			case 2:  // Seleção Direta
				for (int i=0; i<vetor.length-1; i++) {
					menor = i;
					sd = vetor[i];
					for (int j=i+1; j<vetor.length; j++) {
						if (vetor[j].compareTo(sd) < 0) {
							menor = j;
							sd = vetor[j];
						}
					}
					vetor[menor] = vetor[i];
					vetor[i] = sd;
					System.out.println(Arrays.toString(vetor)+" - "+(i+1)+ " interação.");
				}
				break;
			case 3: // Bubblesort
				for (int i=0; i<vetor.length-1; i++) {
					for (int j=1; j<vetor.length-i; j++) {
						if (vetor[j-1].compareTo(vetor[j]) > 0) {
							bs = vetor[j];
							vetor[j] = vetor[j-1];
							vetor[j-1] = bs;
						}
						System.out.println(Arrays.toString(vetor)+" - "+(i+1)+ " interação.");
					}
				}
				break;
			case 4: // Inserção Direta
				for (int i=1; i<vetor.length; i++) {
					System.out.println(Arrays.toString(vetor));
					id = vetor[i];
					idOrdenado = i-1;
					while ((idOrdenado>=0) && (vetor[idOrdenado].compareTo(id)>0)) {
						vetor[idOrdenado+1] = vetor[idOrdenado--];
					}
					vetor[idOrdenado+1] = id;	
				}
				System.out.println(Arrays.toString(vetor));
				break;
			case 5: // Busca Linear
				System.out.print("Informe um valor para busca linear: ");
				bl = scan.next();
				contadorBL = 0;
				while ((contadorBL < vetor.length) && (! bl.equalsIgnoreCase(vetor[contadorBL]))) {
					contadorBL++;
				}
				if (contadorBL >= vetor.length) {
					System.out.println("O valor "+bl+" não foi encontrado no vetor.");
				}else{
					System.out.println("O valor "+bl+" foi encontrado no vetor e está na "+(contadorBL+1)+" posição.");
				}
				break;
			case 6: // Busca Binária
				System.out.print("Informe um valor para busca linear: ");
				bb = scan.next();
				contadorBB = (vetor.length-1)/2;
				while (!encontrouBB) {
					if (bb.compareTo(vetor[contadorBB]) > 0) {
						contadorBB += contadorBB/2;
					}else{
						if (bb.compareTo(vetor[contadorBB]) < 0) {
							contadorBB -= contadorBB/2;
						}else {
							encontrouBB = true;
						}
					}
				}
				if (encontrouBB) {
					System.out.println("O valor "+bb+" foi encontrado no vetor e está na "+(contadorBB+1)+" posição.");
				}else{
					System.out.println("O valor "+bb+" não foi encontrado no vetor.");
				}
				break;
			case 7:
				for(int i=0; i<original.length; i++) {
					System.out.print(original[i]+" ");
				}
				break;
			case 8:
				for(int i=0; i<vetor.length; i++) {
					System.out.print(vetor[i]+" ");
				}
				break;
			case 0:
				System.out.println("Saindo do programa...\n");
				break;
			default:
				System.out.println("Esta não é uma opção válida!");
			} 
		} while(menu !=0);
	}
}

// 4,5,2,1,3,9,6
// 2,5,4,1,3,9,6
// 1,5,4,2,3,9,6

// 1,4,5,2,3,9,6
// 1,2,5,4,3,9,6

// 1,2,4,5,3,9,6
// 1,2,3,5,4,9,6