import java.util.Random;
import java.util.Scanner
;public class Diagonal {	
	public static void main(String[] args) {	
		int matriz[][]= new int [5][5],i=0,reset=0, linha,coluna, vetor[]=new int[75],n;
		Random random=new Random();	
		Scanner scanner=new Scanner(System.in);	 
		// 
		for (linha=0;linha<5;linha++){ 	
			for(coluna=0;coluna<5;coluna++){ 	
				matriz[linha][coluna]=random.nextInt(40) + 1; 
			} 	
			coluna=0; 	
		} 	
		linha=0;
		// 
		// 	 
		for (linha=0;linha<5;linha++){ 
			System.out.println(); 
			for(coluna=0;coluna<5;coluna++){ 	
				System.out.print(matriz[linha][coluna]+" "); 
			} 	
		} 	
		//
		// 	 
		System.out.println("\n"); 
		coluna=0; 
		linha=0;
		//
		// 	
		while(coluna<5){ 	
			System.out.println(matriz[linha][coluna]+" "); 
			coluna++; 
			linha++; 
		} 	
	}	
}