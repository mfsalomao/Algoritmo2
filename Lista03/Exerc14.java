package Lista03;

import java.util.Scanner;

public class Exerc14 {

	public static void main(String[] args) {
		int idade;
		String categoria;
		Scanner scan = new Scanner(System.in);
		System.out.print("Informe a idade do jogador: ");
		idade = scan.nextInt();
		categoria = verificarCat(idade);
		System.out.println("O jogador tem "+idade+" anos. Sua categoria é "+categoria+".");
	}
	
	public static String verificarCat(int a) {
		if (a<=7) {
			return "pré-mirim";
		}else{
			if (a<=10) {
				return "mirim";
			}else{
				if (a<=13) {
					return "infantil";
				}else{
					if (a<=17) {
						return "juvenil";
					}else{
						return "adulto";
					}
				}
			}
		}
	}
}
