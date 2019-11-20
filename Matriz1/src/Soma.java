import java.util.*;
public class Soma {
	public static void main(String []args) {
		Scanner read = new Scanner(System.in);
		int a[][] = new int[3][4];
		
		for(int i=0;i<3; i++) {
			for(int j=0;j<3;j++) {
				System.out.println("Insira um valor: ");
				a[i][j] = read.nextInt();
			}
		}
		
		for(int i=0;i<3;i++) {
			a[i][3] = a[i][0]+a[i][1]+a[i][2];
		}
		for(int i=0;i<3;i++) {
			System.out.println("[ "+a[i][0]+" ] + [ "+a[i][1]+" ] + [ "+a[i][2]+" ] = [ "+a[i][3]+" ]\n");
		}
	}
}
