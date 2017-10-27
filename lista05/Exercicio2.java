package lista05;

public class Exercicio2 {
    private int codigo;
    private String nome;
    private char tipo;
    
    public Exercicio2 () {
        this.codigo = 0;
        this.nome = "";
        this.tipo = ' ';
    }
    
    public Exercicio2 (int c, String n, char t) {
        this.codigo = c;
        this.nome = n;
        this.tipo = t;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getTipo() {
        return tipo;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }

     public String toString() {
        return "Código: " + codigo + "\nNome: " + nome + "\nTipo de mercadoria: " + tipo + "\n";
    }
}
