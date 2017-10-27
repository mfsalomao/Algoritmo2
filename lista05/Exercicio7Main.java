/* Nome: Martinho de Freitas Salomão
 * Disciplina: Algoritmo 2
 * Data: 17/10/2017
*/

package lista05;

import javax.swing.JOptionPane;

public class Exercicio7Main {

	public static void main(String[] args) {
		int tamanho = 18;
		Exercicio7Vet vetorFunc = new Exercicio7Vet (tamanho); 
		char opcao;
		do {
			opcao = menu();
			switch (opcao) {
			case '1':
				cadastrarFuncionario(vetorFunc);
				break;
			case '2':
				alterarNumeroHoras(vetorFunc);
				break;
			case '3':
				exibirInformacoes(vetorFunc);
				break;
			case '4':
				JOptionPane.showMessageDialog(null, "Saindo do programa...");
				break;
			default:
				JOptionPane.showMessageDialog(null, "Opção Inválida!");
				break;
			}
		}while(opcao != '4');
	}
	
        // Função menu, retorna a opção selecionada, sem entrada de parâmetros.
	static char menu() {
		char opt;
		opt = JOptionPane.showInputDialog("Escolha a opção:\n"
				+ "1. Cadastrar dados do funcionário\n"
				+ "2. Alterar o número de horas de um funcionário\n"
				+ "3. Mostrar dados dos funcionários\n"
				+ "4. Sair do programa\n").charAt(0);
		return opt;
	}
	
        // Procedimento de cadastro de funcionário
	static void cadastrarFuncionario (Exercicio7Vet v) {
		Exercicio7 dadosFunc = new Exercicio7 (
				JOptionPane.showInputDialog("Digite o nome do funcionário: \n"),
				Integer.parseInt(JOptionPane.showInputDialog("Digite o número de horas trabalhadas do funcionário: \n")),
				JOptionPane.showInputDialog("Informe a categoria do funcionário (O - Operário ou G - Gerente): \n").charAt(0));
		if (v.incluirElementoVetor(dadosFunc)) {
			JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso.");
		}else{
			JOptionPane.showMessageDialog(null, "Limite total de funcionários atingido");
		}
	}
	
        // Procedimento de alteração de horas
	static void alterarNumeroHoras (Exercicio7Vet v) {
		String nomePesq;
		int novoHoras;
		nomePesq = JOptionPane.showInputDialog("Digite o nome a ser pesquisado: \n");
		novoHoras = Integer.parseInt(JOptionPane.showInputDialog("Informe o novo número de horas trabalhadas: \n"));
		if (v.alterarHoras(nomePesq,novoHoras)) {
			JOptionPane.showMessageDialog(null, "Operação realizada com sucesso.");
		}else{
			JOptionPane.showMessageDialog(null, "Funcionário não encontrado.");	
		}
	}
	
        // Mostra informações do vetor
	static void exibirInformacoes (Exercicio7Vet v) {
		JOptionPane.showMessageDialog(null, v.toString());
	}
}