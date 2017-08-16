import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LeerXteclado {

	public static void main(String[] args) {
		
		
		
		InputStreamReader io = new InputStreamReader(System.in);
		BufferedReader leer = new BufferedReader(io);
		
		boolean terminarPrograma=false;
		do
		{
		try {
			System.out.println("Por favor ingrese un nro");
			String valorleido= leer.readLine();
			float valor;
			valor= Float.parseFloat(valorleido);
			System.out.println(valor);
			terminarPrograma=false;
		} catch (NumberFormatException nf) {
			System.out.println("Erorr boludin");
			terminarPrograma=true;
			
		} catch (IOException e) {
			
			e.printStackTrace();
			terminarPrograma=true;
		}
		
		}while(terminarPrograma);
		
			
	}
}
