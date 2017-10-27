package lista05;

import javax.swing.JOptionPane;

public class Exercicio4Main {

	public static void main(String[] args) {
		int tamanho = 40;
		Exercicio4Vet cadastro = new Exercicio4Vet (tamanho);
		char opcao;
		do {
			opcao = menu();
			switch (opcao) {
				case '1':
					incluirProduto(cadastro);
					break;
				case '2':
					pesquisarLucro(cadastro);
					break;
				case '3':
					mostrarProdutos(cadastro);
					break;
				case '4':
					mostrarCadastro(cadastro);
					break;
				case '5':
					JOptionPane.showMessageDialog(null, "Saindo da aplicação...");
					break;
				default:
					JOptionPane.showMessageDialog(null, "Opção inválida!");
					break;
			}
		} while(opcao != '5');
	}
	
	static char menu() {
		char opt;
		opt = JOptionPane.showInputDialog("Escolha uma opção: \n"
				+ "1. Cadastrar produto. \n"
				+ "2. Mostrar lucro de determinado produto. \n"
				+ "3. Exibir produtos em quantidade menor que o mínimo permitido. \n"
				+ "4. Mostrar todos os produtos cadastrados. \n"
				+ "5. Sair. ").charAt(0);
		return opt;
	}
	
	static void incluirProduto (Exercicio4Vet c) {
		int cod;
		String desc;
		double compra, venda;
		int est, estMin;
		cod = Integer.parseInt(JOptionPane.showInputDialog("Digite o código do produto: \n"));
		desc = JOptionPane.showInputDialog("Informe o nome do produto: \n");
		compra = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço de compra: \n"));
		venda = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço de venda: \n"));
		est = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade em estoque: \n"));
		estMin = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade mínima em estoque para este produto: \n"));
		Exercicio4 produto = new Exercicio4 (cod, desc, compra, venda, est, estMin);
		if (c.incluirElementoVetor(produto)) {
			JOptionPane.showMessageDialog(null,"Produto incluído com sucesso.");
		}else{
			JOptionPane.showMessageDialog(null,"Arquivo cheio.");
		}
	}
	
	static void pesquisarLucro (Exercicio4Vet c) {
		int cod, posicao;
		String descricao;
		double lucro;
		cod = Integer.parseInt(JOptionPane.showInputDialog("Digite o código do produto: \n"));
		posicao = c.consultarLucroProduto(cod);
		if (posicao == -1) {
			JOptionPane.showMessageDialog(null, "Produto não encontrado ou lucro zero.");
		}else{
			descricao = c.getVetor(posicao).getDescricao();
			lucro = c.getVetor(posicao).getPrecoVenda() - c.getVetor(posicao).getPrecoCompra();
			if (lucro >= 0) {
				JOptionPane.showMessageDialog(null, "O lucro do produto " + descricao + " é R$ " + String.format("%.2f", lucro));
			}else{
				JOptionPane.showMessageDialog(null, "O prejuízo do produto " + descricao + " é R$ " + String.format("%.2f", lucro*(-1)));
			}
		}
	}
	
	static void mostrarProdutos (Exercicio4Vet c) {
		JOptionPane.showMessageDialog(null, c.mostrarProdutosMin());
	}
	
	static void mostrarCadastro (Exercicio4Vet c) {
		JOptionPane.showMessageDialog(null, c.toString());
	}
}
