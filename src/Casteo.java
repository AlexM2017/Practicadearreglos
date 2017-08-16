
public class Casteo {
public static void main(String[] args) {
	int entero= (int)84.3;
	float flotante= (float)54;
	String miconversion="75.3";
	String miconversion2="27";
	System.out.println("Esta es mi variable de tipo entero: "+entero);
	System.out.println("Esta es mi variable de tipo flotante:"+flotante);
	System.out.println("Esta es mi variable de tipo string: "+miconversion);
	flotante= Float.parseFloat(miconversion);
	System.out.println("Nuevo valor de mi variable flotante: "+flotante);
	System.out.println("Esta es mi variable de tipo string: "+miconversion2);
	entero= Integer.parseInt(miconversion2);
	System.out.println("Nuevo valor de mi variable en entero:"+entero);
}
}
