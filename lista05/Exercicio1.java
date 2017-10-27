package lista05;

public class Exercicio1 {
    private int codigo;
    private String titulo;
    private char genero;
    
    public Exercicio1 () {
        this.codigo = 0;
        this.titulo = "";
        this.genero = ' ';
    }
    
    public Exercicio1 (int c, String t, char g) {
        this.codigo = c;
        this.titulo = t;
        this.genero = g;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public String toString() {
        return "\n Código: " + codigo + "\nTítulo: " + titulo + "\nGênero: " + genero;
    }
    
}