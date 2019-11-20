import java.util.*;
public class Ex4 {
	public static void main(String []args) {
		Scanner read = new Scanner(System.in);
		int a[] = new int[10];
		
		for(int i=0; i<10; i++) { 
			System.out.println("Insira o valor "+(i+1));
			a[i] = read.nextInt();
		}
		
		for(int i=0; i<10; i++) {
			System.out.println("Os números pares em relação à 0 e "+a[i]+" são:");
			for(int y=0; y<a[i]; y+=2) {
				System.out.println(y);
			} 
		}
	}

}
