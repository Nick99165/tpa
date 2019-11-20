import java.util.*;
public class Ex15 {
	public static void main(String []args) {
		Scanner leia = new Scanner(System.in);
		int a[],b[],c[],aux, i=0;
		a = new int[10];
		b = new int[10];
		c = new int[10];
		
		while(i<10) {
			System.out.println("Insira o "+(i+1)+" Valor");
			a[i] = leia.nextInt();
			i++;
		}
		
		for(i=0; i<10; i++) {
			for(int y=0; y<9; y++) {
				if (a[y] > a[y+1]) {
					aux = a[y];
					a[y] = a[y+1];
					a[y+1] = aux;
				} 
				
			}
		}
		System.out.println("A ordem é: ");
		for(i=0; i<10; i++) {
			System.out.println(a[i]);
		}
	}
	
}
