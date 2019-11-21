import java.util.*;
public class investimento {
	public static void main (String [] args) {
		Scanner s = new Scanner (System.in);
		double vi ;
		int mes;
		 //Menu                                                    
		
			int resposta=1;
		 System.out.println("Digite 1 - para saber o valor investido ao seu rendimento");
		 System.out.println("Digite 2 - para saber o total a se pagar:");
		 resposta = s.nextInt();
		
		 if(resposta == 1){
		//Valor investido
		System.out.println("Entre com o valor investido: ");
		vi = s.nextDouble();
		System.out.println("Entre com número de meses que o dinheiro ficou investido:");
		 mes = s.nextInt();
		 System.out.println("O resultado é:"+ investimento(vi,mes));
		 }else{
		 // Total a pagar
		
		 System.out.println("Entre com o tatal gasto");
		 double total = s.nextDouble();
		 System.out.println("Opção 1 - a vista  + 10% de desconto");
		 System.out.println("Opção 2- Em 2x (preço de etiqueta");
		 System.out.println("Opcão 3- De 3 até 10x + 3% de juros ao mês (somente p/ compras acima de R$:100,00");
		 int r = s.nextInt();
		 int parcela;
		 double valor = 0;
		 
		 r=s.nextInt();
		 
			if (r==3) {
				System.out.println("Em quantas vezes deseja pagar?");
				parcela=s.nextInt();
				parc10(valor ,parcela);
			}
			else if(r==2) {
				parc2(valor);
			}
			else if(r==1) {
				avista(valor);
			}
		 }
		}
	
		 
		 
	
		
	
	
	public static double investimento (double vi,  int m) {
		double result=0;
		for (int i = 0; i<m; i++) {
			result = (vi + vi*0.01);
			vi = result;
		}
			
		

		return  result;
		
	}
	
	
	public static void avista ( double valor){
		double desc = valor;
		desc = desc * 10/100;
		valor = valor-desc;
		System.out.println("O total é" + valor);
		
		}
	public static void parc2 (double valor){
		double result = valor/2;
		
	}
	public static void parc10(double valor , int parcela){
		valor = valor/parcela;
		double  juros = 0;
		for (int i = 0 ; i <parcela ; i++){
			juros = parcela*0.03;
		}
		juros = juros*parcela;
		valor=valor+juros;
		System.out.printf("O total a se pagar é" + valor);
		
		
		
	}
	}


