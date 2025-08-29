package sitp;

public class Bus {

	public static void main(String[] args) {
		System.out.println("Hola Mundo"); //siempre ;
		int numero = 5;
		boolean hola = true;
		char pepe = 'a';
		System.out.println(pepe + pepe);
		for(;numero<31;numero++) {
			if( numero % 2 ==0) {
				System.out.println(numero+"Este numero es par");
			} else {
				System.out.println(numero+"Este numero es impar");
			}
		}
	
	}
	
}
