import java.util.*;
public class Bing {
	public static void main(String []args) {
		Scanner read = new Scanner(System.in);
		Random rdm = new Random();
		int a[][] = new int[4][4];
		int v[] = new int[16];
		int cano, beise=0, rardiwer=0;
		
		for(int i=0; i<4; i++) {
			for(int j=0; j<4; j++) {
				a[i][j] = (rdm.nextInt(75))+1;
			}
		}
		
		for(int acertos=0; acertos<16;) {
			System.out.println("Cante um n�mero de 1 � 75: ");
			cano = read.nextInt();
			for(int x=0; x<16; x++) {
				if(cano==v[x]) {
					System.out.println("Voc� j� inseriu esse n�mero(Ou esse n�mero � 0/est� fora da tabela), por favor insira outro:");
					cano = read.nextInt();
					if(cano==v[x]) {
						System.err.println("Voce inseriu novamente o n�mero repetido. Se persistir, o programa ir� fechar. \nCante um n�mero!: ");
						cano = read.nextInt();
						if(cano==v[x]) {
							System.exit(0);
						}
					}
				}
			}
			for(int i=0; i<4; i++) {
				for(int j=0; j<4; j++) {
					if(a[i][j]==cano) {
						v[acertos]=cano;
						acertos++;
						
					}
				}
			}
			if(acertos!=rardiwer) {
				System.out.println("Sua cartela tem o n�mero "+cano+"! Voc� j� acertou "+acertos+" N�meros!");
				rardiwer=acertos;
			} else if(acertos==rardiwer) {
				System.out.println("Infelizmente sua cartela n�o tem o n�mero "+cano+".");
			}
			beise++;
		}
		System.out.println("BINGO! Voc� levou "+beise+" rodadas at� concluir a cartela toda.");
		
	}
}