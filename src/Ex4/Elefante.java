package Ex4;

import java.util.Scanner;

public class Elefante {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		 System.out.println("Quantas Vezes o Elefante incomoda?");
		int incomoda = leitor.nextInt();
		
		for (int i = 0; i < incomoda; i++) {
			System.out.print("incomoda ");
		}
		System.out.print("muito mais");
	}

}
