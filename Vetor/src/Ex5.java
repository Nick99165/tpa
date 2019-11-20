import java.util.*;
public class Ex5 {
	public static void main(String []args) {
		Scanner read = new Scanner(System.in);
		int a[] = new int[10];
		
		for(int i=0; i<10; i++) {
			System.out.println("Insira o valor "+(i+1));
			a[i] = read.nextInt();
		}
		for(int i=0; i<10; i++) {
			System.out.println("Os divisores de "+a[i]+" até 0 são:");
			for(int y=1; y<=a[i]; y++) {
				if(a[i]%y == 0) {
					System.out.println(y);
				}
			}
		}
	}

}
