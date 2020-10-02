package Ex3;

import java.util.Scanner;

public class Data {

	public static void main(String[] args) {
		
		int dia = 0;
		int mes = 0;
		int ano = 0;
		
		Scanner leitura = new Scanner(System.in);
		
		dia = leitura.nextInt();
		mes = leitura.nextInt();
		ano = leitura.nextInt();
		
		if (dia > 0 && dia <= 31){
			
			if (mes > 0 && mes <= 12) {
				
				if (ano < 2018) {
					
					System.out.println("Data Válida!!!");
					
				} else {
					
					System.out.println("Ano Inválido!!!");
					
				}
				
			} else {
				System.out.println("Mês Inválido!!!");
			}
		} else {
			System.out.println("Dia Inválido!!!");
		}
		
	}

}
