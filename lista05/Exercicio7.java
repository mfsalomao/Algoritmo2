/* Nome: Martinho de Freitas Salomão
 * Disciplina: Algoritmo 2
 * Data: 17/10/2017
*/

package lista05;

public class Exercicio7 {
	private String nome;
	private int horas;
	private char categoria;
	private double salario;
	
        // Construtor vazio
	public Exercicio7 () {
		this.nome = "";
		this.horas = 0;
		this.categoria = ' ';
		this.salario = 0;
	}
	
        // Construtor principal
	public Exercicio7 (String n, int h, char c) {
		this.nome = n;
		this.horas = h;
		this.categoria = c;
		if (this.categoria == 'O') {
			this.salario = 112*h * 1.10;
		}else{
			if (this.categoria == 'G') {
				this.salario = 112*h * 1.15;
			}else{
				this.salario = 0;
			}
		}
	}
	
        // Gets, sets e toString
	public String getNome () {
		return this.nome;
	}
	
	public int getHoras () {
		return this.horas;
	}
	
	public char getCategoria () {
		return this.categoria;
	}
	
	public double getSalario () {
		return this.salario;
	}
	
	public void setNome (String n) {
		this.nome = n;
	}
	
	public void setHoras (int h) {
		this.horas = h;
	}
	
	public void setCategoria (char c) {
		this.categoria = c;
	}
	
        // O setSalario depende das horas trabalhadas e da categoria. É o mesmo
        // código usado no construtor principal, ou seja, os salários são
        // calculados no início (construtor principal) e quando as horas são
        // alteradas por solicitação do usuário (setSalario).
	public void setSalario (int h) {
		if (this.categoria == 'O') {
			this.salario = 112*h * 1.10;
		}else{
			if (this.categoria == 'G') {
				this.salario = 112*h * 1.15;
			}else{
				this.salario = 0;
			}
		}
	}
	
	public String toString () {
		return "\nNome: "+this.nome+"\nHoras Trabalhadas: "+this.horas+
                        "\nCategoria: "+this.categoria+"\nSalário Bruto: R$ "
                        +String.format("%1$,.2f", this.salario);
	}
}