import java.util.*;
public class Menu {
	public static void main(String []args) {
		Scanner read = new Scanner(System.in);
		boolean again=true;
		
		while(again==true) {
			System.out.println("Selecione qual dessas fun��es deseja utilizar:\n1-Fatorial \n2-Tabuada \n3-Aposentadoria \n4-Pot�ncia");
			int num = read.nextInt();
			if(num == 1) {
				Fatorial();
			} else if(num == 2) {
				Tabuada();
			} else if(num == 3) {
				Aposentadoria();
			} else if(num == 4) {
				Potencia();
			}
			System.out.println("Deseja continuar?\nTRUE = sim \nFALSE = n�o");
			again = read.nextBoolean();
		}
	}
	//Fatorial
	public static void Fatorial() {
		Scanner read = new Scanner(System.in);
		int x;
		System.out.println("Insira o valor � ser fatorado: ");
		int valor = read.nextInt();
		x=valor;
		valor-=1;
		for(int i=valor;i>1;i--) {
			x=x*i;
		}
		System.out.println("O valor fatorado �: "+x);
	}
	//Tabuada
	public static void Tabuada() {
		Scanner read = new Scanner(System.in);
		System.out.println("Insira o valor � ser calculado: ");
		int valor = read.nextInt();
		for(int i=1;i<=10;i++) {
			int x = valor*i;
			System.out.println(valor+"*"+i+"="+x);
		}
	}
	
	//Aposentadoria
	public static void Aposentadoria() {
		Scanner read = new Scanner(System.in);
		System.out.println("Insira a sua idade: ");
		int idade = read.nextInt();
		System.out.println("Insira o seu sexo: \nM para HOMEM \nF para MULHER");
		String sexo = read.next();
		if(idade<65 && sexo.equalsIgnoreCase("M")) {
			System.out.println("Voc� ainda n�o pode se aposentar.");
			int hope = 65-idade;
			System.out.println("Voc� poder� se aposentar em "+hope+" anos.");
		} else if(idade<60 && sexo.equalsIgnoreCase("F")) {
			System.out.println("Voc� ainda n�o pode se aposentar.");
			int hope = 60-idade;
			System.out.println("Voc� poder� se aposentar em "+hope+" anos.");
		} else {
			System.out.println("Voc� j� pode se aposentar.");
		}
	}
	
	//Pot�ncia
	public static void Potencia() {
		Scanner read = new Scanner(System.in);
		System.out.println("Insira a base: ");
		int base = read.nextInt();
		System.out.println("Insira o expoente: ");
		int expoente = read.nextInt();
		int resultado = base;
		for(int i=expoente;i>1;i--) {
			resultado=resultado*base;
		}
		System.out.println("O resultado �: "+resultado);
	}
}
