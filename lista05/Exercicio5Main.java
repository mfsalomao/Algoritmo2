package lista05;

import javax.swing.JOptionPane;

public class Exercicio5Main {

	public static void main(String[] args) {
		int tamanho = 1500;
		Exercicio5Vet cadastro = new Exercicio5Vet (tamanho);
		char opcao;
		do {
			opcao = menu();
			switch(opcao) {
			case '1':
				cadastrarCliente(cadastro);
				break;
			case '2':
				mostrarCatalogo(cadastro);
				break;
			case '3':
				alterarJuros(cadastro);
				break;
			case '4':
				JOptionPane.showMessageDialog(null, "Saindo da aplicação...");
				break;
			default:
				JOptionPane.showMessageDialog(null, "Opção inválida!");
				break;
			}
		} while (opcao != '4');
	}
	
	static char menu() {
		char opt;
		opt = JOptionPane.showInputDialog("Escolha uma opção: \n"
				+ "1. Cadastrar cliente.\n"
				+ "2. Mostrar juros pagos pelos clientes. \n"
				+ "3. Alterar os juros do cliente que tem o maior valor de empréstimo.\n"
				+ "4. Sair.\n").charAt(0);
		return opt;
	}
	
	static void cadastrarCliente (Exercicio5Vet c) {
		String nome;
		double emprestimo, taxaJuros;
		nome = JOptionPane.showInputDialog("Informe o nome do cliente");
		emprestimo = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do empréstimo: "));
		taxaJuros = Double.parseDouble(JOptionPane.showInputDialog("Informe a taxa de juros mensal do cliente: "));
		if (c.consultarCliente(nome) != -1) {
			JOptionPane.showMessageDialog(null,"O cliente já está cadastrado.");
		}else{
			Exercicio5 cliente = new Exercicio5 (nome, emprestimo, taxaJuros);
			if (c.inserirElementoVetor(cliente)) {
				JOptionPane.showMessageDialog(null,"Cliente cadastrado com sucesso");
			}else{
				JOptionPane.showMessageDialog(null,"Arquivo cheio.");
			}
		}
	}

	
	static void mostrarCatalogo (Exercicio5Vet c) {
		JOptionPane.showMessageDialog(null, c.toString());
	}
	
	static void alterarJuros (Exercicio5Vet c) {
		int maiorValor = c.clienteMaiorEmprestimo();
		double novosJuros = Double.parseDouble(JOptionPane.showInputDialog("Informe a nova taxa de juros a ser paga pelo "
				+ "cliente "+c.getVetor(maiorValor).getNome() + ": "));
		
		c.getVetor(maiorValor).setTaxaJuros(novosJuros);
		double novaParcela = c.getVetor(maiorValor).getEmprestimo() * c.getVetor(maiorValor).getTaxaJuros();
		c.getVetor(maiorValor).setParcela(novaParcela);
	}
}
