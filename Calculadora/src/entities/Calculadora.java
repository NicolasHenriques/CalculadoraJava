/**
 * @author Nícolas Henriques
 * https://github.com/NicolasHenriques
 * @since 15/02/2022
 */

package entities;

public class Calculadora {
	
	public Calculadora () {
		
	}
	
	public float soma (float a, float b) {
		float resultado = a + b;
		return resultado;
	}
	
	public float sub (float a, float b) { 
		float resultado = a - b;
		return resultado;
	}
	
	public float mult (float a, float b) {
		float resultado = a * b;
		return resultado;
	}
	
	public float div (float a, float b) { 
		float resultado = a / b;
		return resultado;
	}
}