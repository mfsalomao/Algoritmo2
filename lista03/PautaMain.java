package lista03;

import javax.swing.JOptionPane;

public class PautaMain {

	public static void main(String[] args) {
		// Declaração de variáveis.
		boolean cadastrou = false;
		double media = 0;
		char opcao;
		// Instanciação da classe Pauta. Cria objeto aluno1 vazio (construtor vazio).
		Pauta aluno1 = new Pauta();
		 do {
			opcao = (JOptionPane.showInputDialog("Digite a opção desejada: \n"+
			"1. Cadastrar aluno \n"+
			"2. Mostrar todos os dados do aluno \n"+
			"3. Verificar se o aluno está reprovado por falta \n"+
			"4. Mostrar a média do aluno \n"+
			"5. Mostrar situação de aprovação ou reprovação \n"+
			"6. Finalizar operações \n")).charAt(0);
			switch(opcao) {
			case '1':
				// Preenche objeto aluno1 com o segundo construtor (construtor principal).
				aluno1 = new Pauta(
						Integer.parseInt(JOptionPane.showInputDialog("Digite a matrícula do aluno: ")), 
						JOptionPane.showInputDialog("Digite o nome do aluno: "),
						Integer.parseInt(JOptionPane.showInputDialog("Digite o número de faltas do aluno: ")),
						Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota do aluno: ")),
						Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota do aluno: ")));
				cadastrou = true;
				// Verifica se as notas foram preenchidas no intervalo de 1 a 10.
				if (aluno1.getNota1() > 10 || aluno1.getNota1() <0) {
					JOptionPane.showMessageDialog(null, "Nota inválida. \n");
					cadastrou = false;
				}else{
					if (aluno1.getNota2() > 10 || aluno1.getNota2() <0) {
						JOptionPane.showMessageDialog(null, "Nota inválida. \n");
						cadastrou = false;
					}
				}
				
				break;
			case '2':
				// Mostra o toString.
				if (cadastrou) {
					JOptionPane.showMessageDialog(null, aluno1.toString());
				}else{
					JOptionPane.showMessageDialog(null, "Favor cadastrar o aluno. \n");
				}
				break;
			case '3':
				// Verifica faltas e mostra situação do aluno.
				if (cadastrou) {
					if (!verificarFaltas(aluno1)) {
						JOptionPane.showMessageDialog(null, "O aluno "+aluno1.getNomeAluno()+ " tem "+aluno1.getNumFalta()+ " faltas."
								+ " Situação: Regular.");
					}else {
						JOptionPane.showMessageDialog(null, "O aluno "+aluno1.getNomeAluno()+ " tem "+aluno1.getNumFalta()+ " faltas."
								+ " Situação: Reprovado por faltas.");
					}
				}else{
					JOptionPane.showMessageDialog(null, "Favor cadastrar o aluno.");
				}
					break;
			case '4':
				// Calcula e exibe a média.
				if (cadastrou) {
					media = (aluno1.getNota1() + aluno1.getNota2())/2;
					JOptionPane.showMessageDialog(null,"A média do aluno "+aluno1.getNomeAluno()+" é "+media);
				}else{
					JOptionPane.showMessageDialog(null, "Favor cadastrar o aluno.");
				}	
			break;
			case '5':
				
				if (cadastrou) {
					// Exibe mensagens com a situação do aluno.
					if (verificarFaltas(aluno1) && verificarNotas(aluno1)) {
						JOptionPane.showMessageDialog(null, "O aluno "+aluno1.getNomeAluno()+" está reprovado por falta e por nota.");
					}else{
						if (verificarFaltas(aluno1) && verificarNotas(aluno1)) {
							JOptionPane.showMessageDialog(null, "O aluno "+aluno1.getNomeAluno()+" está reprovado por falta.");
						}else{
							if (!verificarFaltas(aluno1) && verificarNotas(aluno1)) {
								JOptionPane.showMessageDialog(null, "O aluno "+aluno1.getNomeAluno()+" está reprovado por nota.");
							}else{
								JOptionPane.showMessageDialog(null, "O aluno "+aluno1.getNomeAluno()+" está aprovado.");
							}
						}
					}
				}else{
					JOptionPane.showMessageDialog(null, "Favor cadastrar o aluno.");
				}
			break;
			case '6':
				JOptionPane.showMessageDialog(null, "Encerrando o programa...");
				break;
			default:
				JOptionPane.showMessageDialog(null, "Favor escolher uma opção válida.");
			break;
			}
		 }while(opcao != '6');
	}
	
	static boolean verificarFaltas(Pauta a) {
		if (a.getNumFalta() <= 25) {
			return false;
		}else{
			return true;
		}
	}
	
	static boolean verificarNotas(Pauta b) {
		if (((b.getNota1() + b.getNota2())/2) < 7) {
			return true;
		}else{
			return false;
		}
	}
}
