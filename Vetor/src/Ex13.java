import java.util.*;
public class Ex13 {
	public static void main(String []args) {
		Scanner read = new Scanner(System.in);
		int a[] = new int[10], b[] = new int[10];
		
		for(int i=0;i<10;i++) {
			System.out.println("Insira um número positivo.");
			a[i] = read.nextInt();
			if(a[i]%2 == 0) {
				b[i]=1;
			} else {
				b[i]=0;
			}
		}
		
		for(int i=0;i<10;i++) {
			System.out.println(a[i]+" = "+b[i]);
		}
	}
}
