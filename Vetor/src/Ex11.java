import java.util.Scanner;
public class Ex11{	
	public static void main(String[] args) {	 	 
		int a[]= new int[10], i=0,j=0,k=0,n=0;	 
		Scanner read = new Scanner(System.in);	 	 
		while(i<10){	 
			System.out.println("Digite o "+(i+1)+"° valor do vetor A");	 
			a[i]=read.nextInt();	 
			i++;	 
		}	 
		i=0;	 
		System.out.println("Digite o número que deseja buscar");	 
		n=read.nextInt();	
		while(j<10){	 
			if(a[j]==n){	
				k=k+100;	 
			}	 else if(a[j]!=n){	 
				k=k+0;	 
			}	 
			j++;	 
		}	 
		if(k>=100){	
			System.out.println("O número foi encontrado");	
		}	 else{	 
			System.out.println("O número não foi encontrado");	
		}	
	}
}