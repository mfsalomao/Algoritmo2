package Lista02;

import javax.swing.JOptionPane;

public class Exerc9 {

	public static void main(String[] args) {
		int A;
		A = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano de nascimento"));
		JOptionPane.showMessageDialog(null,"A idade é: "+ calcularIdade(A));
	}
	
	static int calcularIdade (int ano) { 
		int idade;
		idade = 2017-ano;
		return idade;
	}

}
