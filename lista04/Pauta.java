package lista04;

public class Pauta {
	
	// Cria variáveis da classe Pauta.
	private int matricula;
	private String nomeAluno;
	private int numFalta;
	private double nota1;
	private double nota2;
	
	// Cria construtor com campos vazios.
	public Pauta () {
		this.matricula = 0;
		this.nomeAluno = "";
		this.numFalta = 0;
		this.nota1 = 0;
		this.nota2 = 0;
	}
	
	// Cria construtor principal.
	public Pauta(int mat, String nom, int fal, double n1, double n2) {
		this.matricula = mat;
		this.nomeAluno = nom;
		this.numFalta = fal;
		this.nota1 = n1;
		this.nota2 = n2;
	}
	
	// Funções para os gets.
	public int getMatricula() {
		return this.matricula;
	}
	
	public String getNomeAluno() {
		return this.nomeAluno;
	}
	
	public int getNumFalta() {
		return this.numFalta;
	}
	
	public double getNota1() {
		return this.nota1;
	}
	
	public double getNota2() {
		return this.nota2;
	}
	
	public void setMatricula(int novo) {
		this.matricula = novo;
	}
	
	// Procedimentos para os sets.
	public void setNomeAluno(String novo) {
		this.nomeAluno = novo;
	}
	
	public void setNumFalta(int novo) {
		this.numFalta = novo;
	}
	
	public void setNota1(double novo) {
		this.nota1 = novo;
	}
	
	public void setNota2(double novo) {
		this.nota2 = novo;
	}
	
	// Cria a função toString.
	public String toString () {
		return "Matrícula: "+getMatricula()+"\nNome: "+getNomeAluno()+"\nFaltas: "+getNumFalta()+"\nNota 1: "+getNota1()+"\nNota 2: "+getNota2();
	}	
}
