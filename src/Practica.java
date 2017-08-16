
public class Practica {

	public static void main(String[] args) {

		int a = 2;
		int b = 4;

		System.out.println(a + b);

		if (a > b) {

			System.out.println("la variable A es mayor a B");

		} else {

			System.out.println("la variable B es mayor que A");

		}

		int[] numdias = { 1, 2, 3, 4, 5, 6, 7 };
		String[] nombredias = { "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo" };

		System.out.println(nombredias[numdias[3] - 1]);

		int[] miarreglo = new int[9];

		for (int i = 0; i < miarreglo.length; i++) {

			miarreglo[i] = i + 2;

		}
		
			for (int i = 0; i < miarreglo.length; i++) {
				
				System.out.print(miarreglo[i] + "\n");
				
			}
	}

}
