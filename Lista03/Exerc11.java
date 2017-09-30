package Lista03;

import java.util.Scanner;

public class Exerc11 {
	
	public static void main (String[] args) {
		int num1, num2;
		boolean resultado;
		Scanner scan = new Scanner(System.in);
		System.out.print("Digite o dividendo: ");
		num1 = scan.nextInt();
		System.out.print("Digite o divisor: ");
		num2 = scan.nextInt();
		while (num2 == 0) {
			System.out.println("O divisor é zero. Favor informar outro número.");
			System.out.print("Digite o divisor: ");
			num2 = scan.nextInt();
		}
		resultado = verificarDiv(num1,num2);
		if (resultado) {
			System.out.println("O número "+num1+" é divisível por "+num2+".");
		}else{
			System.out.println("Os números não são divisíveis.");
		}		
	}
	
	public static boolean verificarDiv (int a, int b) {
		if (a % b == 0) {
			return true;
		}else {
			return false;
		}
	}

}
