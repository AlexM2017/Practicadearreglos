
public class SumaNaturalesPares {

	public static void main(String[] args) {
		int n=0, sumapares=0, sumanaturales=0;
		Robot obj = new Robot();
		
		while(obj.pedirnuev) // Mientras sea verdadero pedirnuev
		{
			System.out.println("Por favor ingrese un valor numerico");
			n=(int) obj.leer(); // casteo de float a int
		}
		
		for (int i = 0; i < n; i++) {
			
			sumanaturales= sumanaturales + i;
			if(i % 2==0)
			{
				sumapares= sumapares + i;
			}
		}
		System.out.println("La suma de los nros naturales es: "+sumanaturales);
		System.out.println("La suma de los nros pares es: "+sumapares);
	}

}
