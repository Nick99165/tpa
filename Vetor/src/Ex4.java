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
			System.out.println("Os n�meros pares em rela��o � 0 e "+a[i]+" s�o:");
			for(int y=0; y<a[i]; y+=2) {
				System.out.println(y);
			} 
		}
	}

}
