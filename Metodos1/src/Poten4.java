import java.util.*;
public class Poten4 {
	public static void main(String []args) {
		Scanner read = new Scanner(System.in);
		
		System.out.print("Insira o número à ser calculado: ");
		int num = read.nextInt();
		Potencia(num);
	}
	public static void Potencia(int a) {
		int x=a;
		for(int i=1;i<4;i++) {
			a=a*x;
		}
		System.out.println(a);
	}
}