import java.util.*;
public class Ex7 {
	public static void main(String []args) {
		Scanner read = new Scanner(System.in);
		int a[] = new int[15];
		int b[] = new int[15];
		int aux=1;
		
		for(int i=0; i<15; i++ ) {
			System.out.println("Insira o "+(i+1)+"º valor:");
			a[i] = read.nextInt();
		}
		for(int i=0; i<15; i++) {
			for(int y=2; y<=a[i]; y++) {
				aux*=y;
			}
			b[i] = aux;
			aux=1;
		}
		
		for(int i=0; i<15; i++) {
			System.out.println("O fatorial de "+a[i]+" é "+b[i]);
		}
	}
}
