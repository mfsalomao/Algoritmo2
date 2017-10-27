package lista05;

import javax.swing.JOptionPane;

public class Exercicio2Main {
    
    public static void main (String[] args) {
        int tamanho = 1000;
        Exercicio2Vet registros = new Exercicio2Vet (tamanho);
        char opcao;
        do {
            opcao = menu();
            switch(opcao) {
                case '1':
                    incluirVendedor(registros);
                    break;
                case '2':
                    int totalVend = consultarVendedor(registros);
                    JOptionPane.showMessageDialog(null,"O total de vendedores deste tipo de mercadoria é: "+totalVend+".");
                    break;
                case '3':
                    excluirVendedor(registros);
                    break;
                case '4':
                    String cad = mostrarCadastro(registros);
                    JOptionPane.showMessageDialog(null,cad);
                    break;
                case '5':
                    JOptionPane.showMessageDialog(null,"Saindo da aplicação...");
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"Opção inválida!");
                    break;
            }
        } while (opcao != '5');  
    }
    
    static char menu () {
        char opt;
        opt = JOptionPane.showInputDialog("Escolha a opção: \n"
                + "1. Cadastrar vendedor. \n"
                + "2. Consultar o total de vendedores por mercadoria \n"
                + "3. Excluir um vendedor do cadastro. \n"
                + "4. Exibir cadastro. \n"
                + "5. Sair da aplicação.").charAt(0);
        return opt;
    }
    
    static void incluirVendedor (Exercicio2Vet r) {
        int cod;
        String nome;
        char tipo;
        cod = Integer.parseInt(JOptionPane.showInputDialog("Digite o código do vendedor: "));
        nome = JOptionPane.showInputDialog("Informe o nome do vendedor: ");
        tipo = JOptionPane.showInputDialog("Informe o tipo de mercadoria (P – perecível, N – não perecível): ").charAt(0);
        Exercicio2 vendedor = new Exercicio2 (cod, nome, tipo);
        if (r.incluirElementoVetor(vendedor)) {
            JOptionPane.showMessageDialog(null,"Vendedor incluído com sucesso.");
        }else{
            JOptionPane.showMessageDialog(null,"Arquivo cheio.");
        }
    }
    
    static int consultarVendedor (Exercicio2Vet r) {
        char tipoMerc;
        tipoMerc = JOptionPane.showInputDialog("Informe o tipo de mercadoria (P – perecível, N – não perecível): \n").charAt(0);
        return r.somaVendedoresTipo(tipoMerc);
    }
    
    static void excluirVendedor (Exercicio2Vet r) {
        String nom;
        int posicao;
        nom = JOptionPane.showInputDialog("Informe o nome do vendedor que deseja excluir: \n");
        posicao = r.consultarElementoVetor(nom);
        if (posicao == -1) {
            JOptionPane.showMessageDialog(null,"Vendedor não encontrado.");
        }else{
            if (r.excluirElementoVetor(posicao)) {
                JOptionPane.showMessageDialog(null,"Vendedor excluído com sucesso.");
            }else{
                JOptionPane.showMessageDialog(null,"Arquivo vazio ou nome não encontrado.");
            }
        }
    }
    
    static String mostrarCadastro(Exercicio2Vet r) {
        return r.toString();
    }
}
