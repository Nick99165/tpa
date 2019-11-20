import java.util.*;
public class Ex8 {
	public static void main(String []args) {
		Scanner read = new Scanner(System.in);
		int n=10;
		int sm;
		int[] a = new int[n], b = new int[n];
		
		for(int i=0;i<n;i++) {
			System.out.println("Insira o "+(i+1)+"º valor: ");
			a[i] = read.nextInt();
		}
		
		for(int i=0;i<n;i++) {
			sm=0;
			for(int j=i;j<n;j++) {
				sm = sm+a[j];
				
			}
			b[i] = sm;
		}
		
		for(int i=0;i<n;i++) {
			System.out.println((i+1)+" "+a[i]+" "+b[i]);
		}
	}
}
