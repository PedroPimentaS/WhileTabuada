//Apresentar os resultados de uma tabuada de multiplicar (de 1 até 10) de um número qualquer.
package exercico2;

import java.util.Scanner;

import java.util.Scanner;

public class WhileTabuada {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Qual tabuada esta querendo saber? ");
		int numero=sc.nextInt();
		int contadora= 1;
		
		while(contadora<=10) {
			System.out.println("\n"+numero+"X"+contadora+" = "+ numero*contadora);
			contadora++;
		}
		
		sc.close();
	}	
}
