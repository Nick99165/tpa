import java.util.*;
public class Ex1 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int a[] = new int[20];
		int b[] = new int[20];
		int aux = 0, antiaux = 19;
		
		for(int i=0; i<20; i++) {
			System.out.println("Insira o "+(i+1)+"º Valor.");
			a[i] = read.nextInt();
			if(a[i]%2 == 0) {
				b[aux] = a[i];
				aux++;
			} else {
				b[antiaux] = a[i];
				antiaux--;
			}
		}
		System.out.println("Em ordem, começando dos pares:");
		for(int i=0; i<20; i++) {
			System.out.println(b[i]);
		}

	}

}
