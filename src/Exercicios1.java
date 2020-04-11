/*3. Modifique o retorno da função helloWorld para que retorne uma String com o seguinte
formato:
"A palavra possui X caracteres."
X - Deve ser a quantidade de caracteres da palavra passada por parâmetro.
*/

public class Exercicios1 {
	
	
	public static void main(String[] args) {
		
		Exercicios1 print = new Exercicios1();
		
		print.printFrase(10);
	}
	
	
	
	private int printFrase(int x) {
		
		System.out.println("A palavra possui" + " " + x + " " + "caracteres.");
		
		return 0;
	}

}
