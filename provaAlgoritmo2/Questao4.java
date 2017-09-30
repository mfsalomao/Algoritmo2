package provaAlgoritmo2;

import java.util.Scanner;

// Questão 4  (6 pontos):
// Uma loja comercial deseja armazenar os dados de seus clientes para envio de
// mala direta. Você precisa desenvolver uma aplicação para esta loja. O armazenamento
// dos dados dos clientes será na memória principal do computador usando vetores e os
// campos são: código, nome, telefone, cidade. O aplicativo deverá ter as seguintes
// funcionalidades disponíveis em um menu:
// a) (1,0 ponto) Cadastrar os dados dos clientes (tamanho máximo de vetor é 1000);
// b) (1,0 ponto) Listar os clientes que moram em determinada cidade;
// c) (1,0 ponto) Listar todos os clientes que têm código entre 50 e 150;
// d) (1,0 ponto) Mostrar o telefone de um determinado cliente (procurar pelo nome).
// Outras pontuações:
// (1,0) ponto método main com uso de menu para a chamada dos métodos.
// (1,0) passagem de parâmetros corretamente.

public class Questao4 {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		int tam = 1000;
		int[] codigo = new int[tam];
		String[] nome = new String[tam];
		String[] telefone = new String[tam];
		String[] cidade = new String[tam];
		char opcao;
		do {
			System.out.println("\nDigite a opção desejada: ");
			System.out.println("1. Cadastrar os dados dos clientes \n");
			System.out.println("2. Listar os clientes que moram em determinada cidade \n");
			System.out.println("3. Listar os clientes que têm código entre 50 e 150 \n");
			System.out.println("4. Mostrar o telefone de determinado cliente \n");
			System.out.println("5. Listar dados cadastrais \n");
			System.out.println("6. Sair da aplicação \n");
			opcao = scan.next().charAt(0);
			switch(opcao) {
			case '1':
				cadastrarClientes(codigo, nome, telefone, cidade);
				break;
			case '2':
				listarClientesCidade(nome,cidade);
				break;
			case '3':
				listarClientesCodigo(codigo,nome);
				break;
			case '4':
				mostrarTel(nome,telefone);
				break;
			case '5':
				listarCadastro(codigo,nome,telefone,cidade);
				break;
			case '6':
				System.out.println("Saindo do programa...");
				break;
			default:
				System.out.println("Opção inválida");
				break;
			}
		} while(opcao != '6');
	}
	
	static void cadastrarClientes(int[] cod, String[] nom, String[] tel, String[] cid) {
		for (int i=0; i<cod.length; i++) {
			System.out.print("\nDigite o código do cliente: ");
			cod[i] = scan.nextInt();
			System.out.print("Digite o nome do cliente: ");
			nom[i] = scan.next();
			System.out.print("Digite o telefone do cliente: ");
			tel[i] = scan.next();
			System.out.print("Digite a cidade do cliente: ");
			cid[i] = scan.next();
		}
	}
	
	static void listarClientesCidade(String[] nom, String[] cid) {
		String city;
		boolean encontrou = false;
		System.out.println("Informe a cidade desejada: ");
		city = scan.next();
		for (int i=0; i<cid.length; i++) {
			if (city.equals(cid[i])) {
				System.out.println(nom[i]);
				encontrou = true;
			}
		}
		if (encontrou == false) {
			System.out.println("Cidade não encontrada!");
		}
	}
	
	static void listarClientesCodigo(int[]cod, String[] nom) {
		boolean encontrou = false;
		for (int i=0; i<cod.length; i++) {
			if (cod[i] >=50 && cod[i] <=150) {
				System.out.println(nom[i]);
				encontrou = true;
			}
		}
		if (encontrou = false) {
				System.out.println("Não existem clientes com essa codificação. ");
			}
		}
	
	static void mostrarTel(String[] nom, String[] tel) {
		String cliente;
		int i = 0;
		System.out.println("Digite o nome do cliente: ");
		cliente = scan.next();
		while ((i<nom.length) && (!cliente.equals(nom[i]))) {
			i++;
		}
		if (i==nom.length) {
			System.out.println("Cliente não encontrado.");
		}else{
			System.out.println("O telefone do cliente "+cliente+" é "+tel[i]);
		}
	}
	
	static void listarCadastro(int[] cod, String[] nom, String[] tel, String[] cid) {
		for (int i=0; i<cod.length; i++) {
			System.out.println("\nCódigo: "+cod[i]+"\nNome: "+nom[i]+ "\nTelefone: "+tel[i]+"\nCidade: "+cid[i]);
		}
	}
}
