package lista05;

import javax.swing.JOptionPane;

public class Exercicio6Main {

	public static void main(String[] args) {
		int tamanho = 15;
		Exercicio6Vet cadastro = new Exercicio6Vet (tamanho);
		char opcao;
		do{
			opcao = menu();
			switch(opcao) {
			case '1':
				cadastrarConta (cadastro);
				break;
			case '2':
				visualizarContasCliente (cadastro);
				break;
			case '3':
				excluirContaMenorSaldo (cadastro);
				break;
			case '4':
				mostrarCadastro (cadastro);
				break;
			case '5':
				JOptionPane.showMessageDialog(null, "Saindo da aplicação...");
				break;
			default:
				JOptionPane.showMessageDialog(null, "Opção inválida!");
				break;
			}
		}while (opcao != '5');
		
		
	}
	
	
	static char menu () {
		char opt;
		opt = JOptionPane.showInputDialog("Escolha uma opção do menu: \n"
				+ "1. Cadastrar uma conta. \n"
				+ "2. Visualizar todas as contas de determinado cliente. \n"
				+ "3. Excluir a conta com menor saldo. \n"
				+ "4. Mostrar todas as contas cadastradas. \n"
				+ "5. Sair da aplicação. \n").charAt(0);
		return opt;
	}
	
	static void cadastrarConta (Exercicio6Vet c) {
		int conta;
		String nome;
		double saldo;
		conta = Integer.parseInt(JOptionPane.showInputDialog("Digite um número de conta: \n"));
		nome = JOptionPane.showInputDialog("Informe o nome do cliente: \n");
		saldo = Double.parseDouble(JOptionPane.showInputDialog("Informe o saldo bancário: \n"));
		Exercicio6 cliente = new Exercicio6 (conta, nome, saldo);
		if (c.inserirElementoVetor(cliente)) {
			JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso.");
		}else{
			JOptionPane.showMessageDialog(null, "Arquivo cheio.");
		}
	}
	
	static void visualizarContasCliente(Exercicio6Vet c) {
		String pesquisa = JOptionPane.showInputDialog("Informe um nome para pesquisa: ");
		JOptionPane.showMessageDialog(null, c.consultarElementoVetor(pesquisa));
	}
	
	static void excluirContaMenorSaldo (Exercicio6Vet c) {
		if(c.excluirConta()) {
			JOptionPane.showMessageDialog(null,"Conta com menor saldo excluída com sucesso.");
		}else{
			JOptionPane.showMessageDialog(null,"Arquivo vazio.");
		}
	}
	
	static void mostrarCadastro(Exercicio6Vet c) {
		JOptionPane.showMessageDialog(null, c.toString());
	}
	
	
	
	
	
	
	
	
	

}
