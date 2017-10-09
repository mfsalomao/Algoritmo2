package lista04;

public class Conta {

    private int numeroConta;
    private String titular;
    private double saldo;
   
    public Conta () {
        this.numeroConta = 0;
        this.titular = "";
        this.saldo = 0;
    }
   
    public Conta (int n, String t, double s) {
        this.numeroConta = n;
        this.titular = t;
        this.saldo = s;
    }
 
    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }
 
    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

   public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String toString() {
        return "Número da Conta: " + numeroConta + "\nTitular: " + titular + "\nSaldo: " + saldo;
    }

    public boolean SacarDinheiro (double saq) {
        if (saq > this.saldo || saq > 500 ) {
            return false;
        }else{
            this.saldo -= saq;
            return true;
        }
    }

    public void depositarDinheiro (double dep) {
        this.saldo += dep;
        }
}