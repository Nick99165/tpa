import java.util.*;
public class Ex2 {
	public static void main(String [] args) {
		Scanner read = new Scanner(System.in);
		int a[] = new int[5];
		int show;
		
		for(int i=0; i<5; i++) {
			System.out.println("Insira o "+(i+1)+"º Valor");
			a[i] = read.nextInt();
		}
		
		for(int i=0; i<5; i++) {
			System.out.println("Tabuada do numero "+a[i]+":");
			for(int y=0; y<11; y++) {
				show = a[i]*y;
				System.out.println(show);
			}
		}
		
	}

}
