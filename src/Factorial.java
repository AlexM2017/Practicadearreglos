public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1=3;
		int factorial=1;
		int resultado=1;
		while (factorial < num1 && (factorial + 1) <= num1) {
		
			
			resultado = resultado * (factorial + 1);
			
		System.out.println(factorial + "x" + (factorial + 1) + "es igual a: " + resultado);
		
		System.out.println(resultado);
		
		factorial++;
		
				
		}

	}

}