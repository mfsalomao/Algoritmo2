package lista04;

import javax.swing.JOptionPane;

public class PautaMain {

	public static void main(String[] args) {
		// Declaração de variáveis.
		boolean cadastrou = false;
		boolean reprovadoFalta = false;
		boolean reprovadoNota = false;
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
					if (aluno1.getNumFalta() < 25) {
						reprovadoFalta = false;
						JOptionPane.showMessageDialog(null, "O aluno "+aluno1.getNomeAluno()+ " tem "+aluno1.getNumFalta()+ " faltas."
								+ " Situação: Regular.");
					}else {
						reprovadoFalta = true;
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
				// Verifica se o aluno reprovou por falta.
				if (cadastrou) {
					if (aluno1.getNumFalta() < 25) {
						reprovadoFalta = false;
					}else {
						reprovadoFalta = true;
					}
					// Verifica se o aluno reprovou por nota.
					if (((aluno1.getNota1() + aluno1.getNota2())/2) < 7) {
						reprovadoNota = true;
					}else{
						reprovadoNota = false;
					}
					// Exibe mensagens com a situação do aluno.
					if (reprovadoFalta && reprovadoNota) {
						JOptionPane.showMessageDialog(null, "O aluno "+aluno1.getNomeAluno()+" está reprovado por falta e por nota.");
					}else{
						if (reprovadoFalta && !reprovadoNota) {
							JOptionPane.showMessageDialog(null, "O aluno "+aluno1.getNomeAluno()+" está reprovado por falta.");
						}else{
							if (!reprovadoFalta && reprovadoNota) {
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
}
