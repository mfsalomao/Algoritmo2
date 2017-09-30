package Lista03;

import java.util.Scanner;

public class Exerc10 {
	public static void main(String[] args) {
		int num1,num2,menor;
		Scanner scan = new Scanner(System.in);
		System.out.print("Digite um número: ");
		num1 = scan.nextInt();
		System.out.print("Digite outro número: ");
		num2 = scan.nextInt();
		if (num1 == num2) {
			System.out.println("Os dois números são iguais.");
		}else {
			menor = calcularMenor(num1,num2);
			System.out.println("O menor número é "+menor+".");
		}
	}
	
	public static int calcularMenor(int a, int b) {
		if (a<b) { 
			return a;
		} else {
			return b;
		}
	}
}
