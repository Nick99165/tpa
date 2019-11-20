import java.util.*;
public class Tabuada {
	public static void main(String []args) {
		Scanner read = new Scanner(System.in);
		int num;
		System.out.println("Insira o número à ser calculado:");
		num = read.nextInt();
		Tabuada(num);
	}
	
	public static void Tabuada(int num) {
		for(int i=1;i<=10;i++) {
			System.out.println(num+"*"+i+"="+(num*i));
		}
	}
}
