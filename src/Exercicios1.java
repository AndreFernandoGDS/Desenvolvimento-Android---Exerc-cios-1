/*4. Crie uma nova fun��o capaz de receber dois n�meros e retornar a soma dos mesmos*/

public class Exercicios1 {
	
	
	public static void main(String[] args) {
		
		Exercicios1 print = new Exercicios1();
		int som;
		
		som = print.soma(10, 5);
		
		System.out.println("A soma entre os dois n�meros � " + som);
	}
	
	
	
	private int soma(int x, int y) {
		
		return x + y;
	}

}
