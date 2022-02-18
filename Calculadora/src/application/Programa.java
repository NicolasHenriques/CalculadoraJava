/**
 * @author Nícolas Henriques
 * https://github.com/NicolasHenriques
 * @since 15/02/2022
 */

package application;

import java.util.Scanner;
import entities.Calculadora;

public class Programa {

	public static void main(String[] args) {
		
		//declarando variaveis
		String resultado;
		boolean sair = false;
		int opt = 0;
		float a, b;
		
		//instanciando objetos
		Calculadora calc = new Calculadora();
		Scanner sc = new Scanner(System.in);
		
		//loop para repetir o programa
		do {
			System.out.println("----------- CALCULADORA JAVA -----------"
					+ "\n¦ O que você deseja fazer?              ¦"
					+ "\n¦ 1 - Adição                            ¦"
					+ "\n¦ 2 - Subtração                         ¦"
					+ "\n¦ 3 - Multiplicação                     ¦"
					+ "\n¦ 4 - Divisão                           ¦"
					+ "\n¦ 5 - Sair                              ¦"
					+ "\n --------------------------------------- ");
			
			opt = sc.nextInt();
			
			switch(opt) {
				case 1:
					System.out.print("Entre com o primeiro numero: ");
					a = sc.nextFloat();
					System.out.print("Entre com o segundo numero: ");
					b = sc.nextFloat();
					System.out.print(a + " + " + b + " = " + calc.soma(a, b) + "\n\n");
					break;
					
				case 2:
					System.out.print("Entre com o primeiro numero: ");
					a = sc.nextFloat();
					System.out.print("Entre com o segundo numero: ");
					b = sc.nextFloat();
					System.out.print(a + " - " + b + " = " + calc.sub(a, b) + "\n\n");
					break;
					
				case 3:
					System.out.print("Entre com o primeiro numero: ");
					a = sc.nextFloat();
					System.out.print("Entre com o segundo numero: ");
					b = sc.nextFloat();
					System.out.print(a + " x " + b + " = " + calc.mult(a, b) + "\n\n");
					break;
					
				case 4:
					System.out.print("Entre com o primeiro numero: ");
					a = sc.nextFloat();
					System.out.print("Entre com o segundo numero: ");
					b = sc.nextFloat();
					System.out.print(a + " / " + b + " = " + calc.div(a, b) + "\n\n");
					break;
					
				case 5:
					System.out.println("Até mais :)");
					sair = true;
					break;
				
				default:
					System.out.println("Escolha uma opção válida.");
			}
			
		} while (sair == false);
		
	}
}