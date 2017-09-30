package vetor;

import java.util.Scanner;

public class ExemploVetor {

        public static void main(String[] args) {
                Scanner scan = new Scanner(System.in);
                // Declarar vetor
                int [] numeros;
                // Instanciar vetor
                numeros = new int [5];
                // Entrada de dados
                for (int i=0; i<numeros.length; i++) {
                        System.out.print("Entre com um número inteiro: ");
                        numeros[i] = scan.nextInt();
                }
                // Processamento - alterar um dado no vetor
                int pesq;
                System.out.print("Entre com um número inteiro para pesquisar: ");
                pesq =  scan.nextInt();
                int j = 0;
                while ((j<numeros.length) && (pesq != numeros[j])) {
                        j++;
                }
                if (j == numeros.length) {
                        System.out.println("Número não encontrado no vetor.");
                }else{
                        System.out.print("Entre com um novo valor inteiro: ");
                        numeros[j] = scan.nextInt();
                        System.out.println("Operação realizada com sucesso.");
                }

                // Saída de dados
                for (int i=0; i<numeros.length; i++) {
                        System.out.print(numeros[i] + " ");
                }
        }
}