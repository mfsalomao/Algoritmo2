package Lista02;

public class Exerc7 {
	
		static int numero = 5;

		static void mudarValor(int valor){
			numero = valor;
		}

		public static void main(String[] args) {
			int numero2 = 10;
			System.out.println(numero);
			mudarValor(numero2);
			System.out.println(numero);
		}
		
}

