import java.util.*;
public class Ex6 {
	public static void main(String []args) {
		double a[] = new double[11];
		int b;
		
		for(int i=0; i<11; i++) {
			a[i] = Math.pow(2, i);
		}
		for(int i=0; i<11; i++) {
			System.out.println(a[i]);
		}
	}
}
