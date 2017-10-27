package lista05;

import javax.swing.JOptionPane;

public class Exercicio1Main {
    
    public static void main (String[] args) {
        int tamanho = 1000;
        Exercicio1Vet catalogo = new Exercicio1Vet (tamanho);
        char opcao;
        do {
           opcao = menu(); 
           switch(opcao) {
                case '1':
                   incluirFilme(catalogo);
                   break;
                case '2':
                    int totalFilmesGenero = consultarFilmeGenero(catalogo);
                    JOptionPane.showMessageDialog(null,"O total de filmes desse gênero é "+totalFilmesGenero+".");
                    break;
                case '3':
                    excluirFilme(catalogo);
                    break;
                case '4':
                    exibirCatalogo(catalogo);
                    break;
                case '5':
                    JOptionPane.showMessageDialog(null,"Saindo da aplicação...");
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"Opção inválida.");
                    break;
           }      
        } while(opcao != '5'); 
    } 
    
    static char menu() {
        char opt;
        opt = (JOptionPane.showInputDialog("Escolha uma opção: \n"
                + "1. Incluir filmes no catálogo. \n"
                + "2. Consultar o total de filmes de determinado gênero. \n"
                + "3. Excluir um filme do catálogo. \n"
                + "4. Mostrar o catálogo. \n"
                + "5. Sair da aplicação.")).charAt(0);
        return opt;
    }
    
    static void incluirFilme (Exercicio1Vet c) {
        int codigoFilme;
        String tituloFilme;
        char generoFilme;
        codigoFilme = Integer.parseInt(JOptionPane.showInputDialog("Digite o código do filme: "));
        tituloFilme = JOptionPane.showInputDialog("Digite o nome do filme: ");
        generoFilme = JOptionPane.showInputDialog("Informe o gênero do filme (A – ação, T – terror, D – drama): ").charAt(0);
        Exercicio1 filme = new Exercicio1 (codigoFilme, tituloFilme, generoFilme);
        if (c.incluirElementoVetor (filme)) {
            JOptionPane.showMessageDialog(null,"Filme incluído com sucesso.");
        }else{
            JOptionPane.showMessageDialog(null,"Arquivo cheio.");
        }
    }
    
    static int consultarFilmeGenero(Exercicio1Vet c) {
        char gen;
        gen = JOptionPane.showInputDialog("Informe o gênero desejado: (A – ação, T – terror, D – drama)").charAt(0);
        return c.somarGenero(gen);        
    }
    
    static void excluirFilme (Exercicio1Vet c) {
        String tituloFilme;
        int pos;
        tituloFilme = JOptionPane.showInputDialog("Informe o título do filme: ");
        if (c.consultarElementoVetor(tituloFilme) == -1) {
            JOptionPane.showMessageDialog(null, "Arquivo vazio ou título não encontrado.");
        }else{
            pos = c.consultarElementoVetor(tituloFilme);
            c.excluirElementoVetor(pos);
            JOptionPane.showMessageDialog(null,"Filme excluído com sucesso.");
        }
    }
    
    static void exibirCatalogo (Exercicio1Vet c) {
        JOptionPane.showMessageDialog(null, c.toString());
    }
}