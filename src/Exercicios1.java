/*5. Crie uma função que receba 3 números com casas decimais e execute o seguinte
cálculo: ((x + y) * x) / z
Faça o retorno com casas decimais*/

import java.text.DecimalFormat;

public class Exercicios1 {
	
	
	public static void main(String[] args) {
		
		DecimalFormat forma = new DecimalFormat("##.##");
		
		Exercicios1 print = new Exercicios1();
		double calc;
		
		calc = print.Calculo(10.15, 5.16, 2.95);
		
		System.out.println("A soma entre os dois números é " + forma.format(calc));
	}
	
	
	
	private double Calculo(double x, double y, double z) {
		double result = (((x + y) * x) / z);
		
		return result;
	}

}
