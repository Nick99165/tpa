import java.util.*;
public class Ex3 {
	public static void main(String []args) {
		Scanner read = new Scanner(System.in);
		int a[] = new int[10];
		int aux[] = new int[10];
		
		for(int i=0; i<10; i++) {
			System.out.println("Insira o "+(i+1)+"º valor:");
			a[i] = read.nextInt();
		}
		for(int i=0; i<10; i++) {
			for(int y=2; y<a[i]; y++) {
				if(a[i]%y == 0) {
					aux[i]=+1;
				} 
			}
		}
		
		for(int i=0; i<10; i++) {
			if(aux[i] == 0) {
				System.out.println("O numero "+a[i]+" é primo.");
			} else {
				System.out.println("O numero "+a[i]+" não é primo.");
			}
		}
	}

}
