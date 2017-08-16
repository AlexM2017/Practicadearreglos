
public class Factorialmio {

	public static void main(String[] args) {
		
		int factorial=3;
		int fac;
		int fac2=1;
		
		do
		{
			fac=factorial * (factorial- 1);
			
			fac2= fac2 + fac;
			factorial --;
		}while  (factorial > 1);
		
		System.out.println("El factorial del nro ingesado es "+fac2);
	}
}
