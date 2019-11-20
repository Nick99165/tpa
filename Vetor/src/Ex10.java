import java.util.Scanner;
public class Ex10{	
	public static void main(String[] args) {	 	 
		int a[]= new int[10],b[]= new int[10],c[]= new int[10], i=0, j=0,k=0,g=0;	 
		Scanner read = new Scanner(System.in);	 	 
		while(i<10){	
			System.out.println("Digite o "+(i+1)+"° valor do vetor A");	
			a[i]=read.nextInt();	 
			i++;	 
		}	 
		i=0;	 
		while(i<10){	 
			System.out.println("Digite o "+(i+1)+"° valor do vetor B");	 
			b[i]=read.nextInt();	 
			i++;	
		}	 
		i=0;	 
		while(i<10){	
			while(j<10){	 
				if(a[i]==b[j]){	 j=10;	 
				k=k+100;	 
			}	 else if(a[i]!=b[j]){	 
				j++;	 k=k+0;	 
			}	 
		}	 
			if(k<100){	 
				c[g]=a[i];	 
				g++;	 
			}	 
			k=0;	 
			j=0;	 
			i++;	 
		}	 
		i=1;	 
		System.out.println(" Vetor C:");	
		System.out.print(c[0]+"-");	 
		while(i<9){	 
			System.out.print(c[i]+"-");	
			i++;	 
		}	 
		System.out.print(c[9]);	 	
	}
}