package lista05;

import javax.swing.JOptionPane;

public class Exercicio3Main {
    
    public static void main (String[] args) {
        int tamanho = 1000;
        Exercicio3Vet turma = new Exercicio3Vet (tamanho);
        char opcao;
        do {
           opcao = menu();
           switch(opcao) {
                case '1':
                   inserirAluno(turma);
                   break;
                case '2':
                   consultarAluno(turma);
                   break;
                case '3':
                   JOptionPane.showMessageDialog(null,mostrarMedias(turma));
                   break;
                case '4':
                    JOptionPane.showMessageDialog(null,"Saindo da aplicação...");
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"Opção inválida!");
                    break;
           }
        } while(opcao != '4');
        
    }
    
    static char menu() {
        char opt;
        opt = JOptionPane.showInputDialog("Escolha uma opção: \n"
                + "1. Inserir aluno na turma. \n"
                + "2. Consultar alunos com notas abaixo de um valor determinado. \n"
                + "3. Mostrar médias e nomes dos alunos cadastrados na turma. \n"
                + "4. Sair da aplicação.").charAt(0);
        return opt;
    }
    
    static void inserirAluno (Exercicio3Vet t) {
        int mat;
        String nom;
        double n1;
        double n2;
        mat = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de matrícula: \n"));
        nom = JOptionPane.showInputDialog("Informe o nome do aluno: \n");
        n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o o valor da primeira nota: \n"));
        n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o o valor da segunda nota: \n"));
        Exercicio3 aluno = new Exercicio3 (mat, nom, n1, n2);
        if (t.inserirElementoVetor (aluno)) {
            JOptionPane.showMessageDialog(null,"Aluno inserido com sucesso.");
        }else{
            JOptionPane.showMessageDialog(null,"Arquivo cheio.");
        }
    }
    
    static void consultarAluno (Exercicio3Vet t) {
        double val;
        val = Double.parseDouble(JOptionPane.showInputDialog("Informe um valor como limiar: "));
        JOptionPane.showMessageDialog(null,t.consultarNomesNotas(val));
    }
    
    static String mostrarMedias (Exercicio3Vet t) {
        return t.toString();
    } 
}
