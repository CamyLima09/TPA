import java.util.Scanner;
public class Soma {
public static void main (String [] args) {
	int [][]matriz = new int [3][4];
	int soma=0;
	int [][]cont = new int [1][matriz.length];
	
	Scanner entrada = new Scanner (System.in);
	System.out.println("Matriz M{3][4]\n");
	
	for(int linha=0; linha<3; linha++) {
		for(int coluna=0; coluna<4; coluna++) {
			System.out.printf("Digite o elemento M[%d][%d]:", linha+1,coluna+1);
			matriz[linha][coluna]= entrada.nextInt();
			//soma=soma + matriz[linha][coluna];
			cont[0][coluna] += matriz[linha][coluna];
		}
		}
	System.out.println("\nA Matriz ficou: \n");
	for(int linha=0; linha<3; linha++) {
		for(int coluna=0; coluna<4; coluna++) {
			System.out.printf("\t %d \t", matriz[linha][coluna]);
			//soma = soma + coluna;
			//soma += matriz[linha][coluna];
			//soma += coluna;
			soma = cont[0][coluna];
			//System.out.printf("\t %d \t", cont[0][coluna]);
			}
		System.out.println();
	}
	System.out.println("soma-> "+soma);
	
}}