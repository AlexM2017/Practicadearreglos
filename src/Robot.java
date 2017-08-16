import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Robot {

	boolean pedirnuev = true;
	
	public float leer()
	{
		String valorleido="";
		float valorconvert=0;
		try
		{
			InputStreamReader io= new InputStreamReader(System.in);
			BufferedReader leer = new BufferedReader(io);
			valorleido = leer.readLine();
			valorconvert = Float.parseFloat(valorleido); //conversion de string a float
			pedirnuev = false;	
		}
		catch (NumberFormatException nf) 
		{
			System.out.println("Disculpe usted ha colocado un valor incorrecto");
			pedirnuev= true;
		}
		  catch (Exception e)
		{
			System.out.println("Ha ocurrido un error general");
			pedirnuev = true;
		}
		return valorconvert;
	}
	
}
