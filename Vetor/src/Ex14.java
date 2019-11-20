import java.util.Scanner;
public class Ex14{	
	public static void main(String[] args) {	
		int a[]= new int[10],c[]= new int[10],b[]= new int[10], i=0, j=9,k=0;	
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
			if(a[i]>b[i]){	
				c[i]=1;	
				i++;
			}	 else if (a[i]==b[i]){	
				c[i]=0;	
				i++;
			}	 else if (a[i]==b[i]){	
				c[i]=0;
				i++;	
			}	 else if (a[i]<b[i]){	
				c[i]=-1;
				i++;
			}	
		}	
		i=1;	
		System.out.println(" Vetor C:");
		System.out.print(c[0]+",");	
		while(i<9){	
			System.out.print(c[i]+",");	
			i++;	
		}	
		System.out.print(c[9]);	 
	}
}