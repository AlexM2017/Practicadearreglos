
public class Fecha {

	public static void main(String[] args) {
		int dia=0, mes=0, anio=0;
		String nombremes="";
		
		Robot objeto = new Robot();
		
		while(objeto.pedirnuev)
		{
			
			System.out.println("ingresar dia");
			dia=(int)objeto.leer();
			System.out.println("ingresar mes");
			mes=(int)objeto.leer();
			System.out.println("ingresar año");
			anio=(int)objeto.leer();
		}
	
		
		if(dia>0 && dia<=31)
		{
			if(mes>0 && mes <13)
			{
				if(anio>0)
				{
					System.out.println("fecha valida");
				} else
				{
					System.out.println("año invalido");
				}
				
			}else 
			{
				System.out.println("mes invalido");
			}
		} else
		{
			System.out.println("dia invalido");
		}
		
		switch(mes){
		
		case 1:
			nombremes="Enero";
			break;
		
		case 2:
			nombremes="Febrero";
			break;
			
		case 3:
			nombremes="Marzo";
			break;
			
		case 4:
			nombremes="Abril";
			break;
		
		case 5:
			nombremes="Mayo";
			break;
			
		case 6:
			nombremes="Junio";
			break;
			
		case 7:
			nombremes="Julio";
			break;
		
		case 8:
			nombremes="Agosto";
			break;
			
		case 9:
			nombremes="Septiembre";
			break;
			
		case 10:
			nombremes="Octubre";
			break;
		
		case 11:
			nombremes="Noviembre";
			break;
			
		case 12:
			nombremes="Diciembre";
			break;
			
		}
		System.out.println(dia +" "+ nombremes +" "+anio);
	
		}
	}

