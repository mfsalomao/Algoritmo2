package lista04;

import javax.swing.JOptionPane;

public class ContaMain {
    public static void main(String[] args) {
        Conta correntista = new Conta();
        double saque, deposito, contabancaria;
        char opcao;
        do{
            opcao = JOptionPane.showInputDialog("Escolha a opção:\n"
                    + "1. Cadastrar uma conta de cliente\n"
                    + "2. Mostrar saldo da conta\n"
                    + "3. Sacar dinheiro da conta\n"
                    + "4. Depositar dinheiro na conta\n"
                    + "5. Finalizar operações\n").charAt(0);
            switch(opcao) {
                case '1':
                    contabancaria = Math.random()*1000;
                    correntista = new Conta (
                            (int)(contabancaria),
                            JOptionPane.showInputDialog("Informe o nome do correntista: "),
                            0);
                    break;
                case '2':
                    JOptionPane.showMessageDialog(null, correntista.toString());
                    break;
                case '3':
                    saque = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor que deseja sacar: "));
                    if (correntista.SacarDinheiro(saque)) {
                        JOptionPane.showMessageDialog(null,"Saque efetuado com sucesso.");
                    }else{
                        JOptionPane.showMessageDialog(null,"Saldo insuficiente ou maior do que o limite permitido (R$ 500).");
                    }
                    break;
                case '4':
                    deposito = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor que deseja depositar: "));
                    correntista.depositarDinheiro(deposito);
                    JOptionPane.showMessageDialog(null,"Depósito efetuado com sucesso.");
                    break;
                case '5':
                    JOptionPane.showMessageDialog(null,"Aplicação Finalizada.");
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"Opção inválida.");
                    break;
            }
        }while(opcao!='5');  
    }
}