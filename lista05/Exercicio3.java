package lista05;

public class Exercicio3 {
    private int matricula;
    private String nome;
    private double nota1;
    private double nota2;
    private double media;
    
    public Exercicio3() {
        this.matricula = 0;
        this.nome = "";
        this.nota1 = 0;
        this.nota2 = 0;
        this.media = 0;
    }

    public Exercicio3(int matricula, String nome, double nota1, double nota2) {
        this.matricula = matricula;
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.media = (nota1+nota2)/2;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }
    
    public double getMedia() {
        return media;
    }

    public void setMedia(double n1, double n2) {
        this.media = (n1+n2)/2;
    }

     public String toString() {
        return "Matricula: " + matricula + "\nNome: " + nome + "\nNota1: " + nota1 + "\nNota2: " + nota2 + "\nMedia: " +media;
    }   
}