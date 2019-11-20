import java.util.*;
public class Bits {
    
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int a[][] = new int [4][4];
        int x=1;
        
        for(int i=0;i<4;i++) {
            for(int j=0;j<4;j++) {
                a[i][j] = x;
                a[i][j] = a[i][j]*2;
                x = a[i][j];
            }
        }
        
        for(int i=0;i<4;i++) {
            for(int j=0;j<4;j++) {
                System.out.print("["+a[i][j]+"] ");
            }
            System.out.println(" ");
        }
    }
    
}
