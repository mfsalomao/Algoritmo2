package Lista01;

public class Exerc3 {

	public static void main(String[] args) {
		String [] vetor = {"MARIO","VALDIR","CARLOS","JORGE","BIA","ANA","ZELIA","MANOEL","CARLA"};
		int menor;
		String x = vetor[0];
		for (int i=0; i<vetor.length-1; i++) {
			menor = i;
			x = vetor[i];
			for (int j=i+1; j<vetor.length;j++) {
				if (vetor[j].compareTo(x) < 0) {
					menor = j;
					x = vetor[j];
				}
			}
			vetor[menor] = vetor[i];
			vetor[i] = x;
		}
		for (int k=0; k<vetor.length;k++) {
			System.out.print(vetor[k]+"\t");
		}
	}
}
