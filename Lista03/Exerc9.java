package Lista03;

import java.util.Scanner;

public class Exerc9 {
	public static void main (String[] args) {
		int idade, anoAtual, anoNascimento;
		Scanner scan = new Scanner(System.in);
		System.out.print("Digite o ano de nascimento: ");
		anoNascimento = scan.nextInt();
		anoAtual = 2017;
		if (anoNascimento > anoAtual) {
			System.out.println("O ano de nascimento não pode ser maior que o ano atual. ");
		}else {
			idade = calcularIdade(anoNascimento, anoAtual);
			System.out.println("A idade é "+idade+".");
		}
	}
	
	public static int calcularIdade (int n, int a) {
		int resultado;
		resultado = a - n;
		return resultado;
		}
}
	
	

