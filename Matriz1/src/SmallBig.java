import java.util.*;
public class SmallBig {
    
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        Random rdm = new Random();
        int a[][] = new int [3][3];
        int men1=0, men2=0, mai1=0, mai2=0, maior, menor;
        
        for(int i = 0;i<3;i++) {
            for(int j = 0;j<3;j++) {
                a[i][j] = (rdm.nextInt(10))+1;
            }
        }
        
        maior=a[0][0];
        menor=a[0][0];
        
        
        for(int i=0;i<3;i++) {
            for(int j=0;j<3;j++) {
                if(a[i][j] >= maior) {
                    maior = a[i][j];
                    mai1 = i;
                    mai2 = j;
                } else if(a[i][j] <= menor) {
                    menor = a[i][j];
                    men1 = i;
                    men2 = j;
                }
            }
        }
        System.out.println("O maior número é: "+maior+", cujo ocupa ["+mai1+"],["+mai2+"]");
        System.out.println("O menor número é: "+menor+", cujo ocupa ["+men1+"],["+men2+"]");
    }
    
}
