import java.util.Scanner;
import java.util.Random; 
public class Diagonal {
	public static void main (String []args) {
		Scanner in= new Scanner (System.in);
		int N[][]= new int [3][3];
		int i,j;
		
		Random randomico = new Random ();
		
		for (i=0; i<=2; i++) {
			for(j=0; j<=2; j++) {
			
			N[i][j] = randomico.nextInt(10);
			
				
			}
			
		}
		System.out.println("Os valores da diagonal principal são:");
		
	
		for (i=0; i<=2; i++) {
			for(j=0; j<=2; j++) {
				if(i==j) {
					
					System.out.println( N[i][j]);
				}
				
			
			}
	

	
	
	
	}	
	
	
}}
