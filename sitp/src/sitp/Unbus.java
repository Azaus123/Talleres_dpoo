package sitp;

public class Unbus {
	//atributos de un bus
	private int sillas;
	protected String color; //Cambiamos a protected para que sus hijos puedan utilizarlo
	private String marca;
	private int numpuertas;
	private Conductor choferdelbus; //Asociar un objeto de la clase Conductor al bus
	
	//Los siguientes metodos son propios de la clase, no de los objetos
	
	public static String ciudad = "Bogota"; //Creamos un metodo estatico
	//Esto significa que lo creamos sin que exista un bus
	public static final boolean tieneruedas = true; //Creamos un metodo estatico inmodificable
	//Este metodo siempre va a tener este valor

	
	
	//Metodos de un bus, se pueden hacer con Source>Generate Getters and Setters
	
	//Getter
	public String getColor() {
		return color;
	}
	//Setter+
	public void setColor(String color) {
		this.color = color;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public int getNumpuertas() {
		return numpuertas;
	}
	public void setNumpuertas(int numpuertas) {
		this.numpuertas = numpuertas;
	}
	public Conductor getChoferdelbus() {
		return choferdelbus;
	}
	public void setChoferdelbus(Conductor choferdelbus) {
		this.choferdelbus = choferdelbus;
	}
	public int getSilla() {
		return sillas;
	}
	public void setSillas(int sillas) {
		this.sillas = sillas;
	}
	//Esto es un metodo constructor de un Bus SIN conductor
	public Unbus(int sillas, String color, String marca, int numpuertas) {
		this.sillas = sillas;
		this.color = color;
		this.marca = marca;
		this.numpuertas = numpuertas;
		//this.choferdelbus = choferdelbus;
	}	
	//Esto es un metodo constructor CON conducor
	public Unbus(int sillas, String color, String marca, int numpuertas, Conductor choferdelbus ) {
		this.sillas = sillas;
		this.color = color;
		this.marca = marca;
		this.numpuertas = numpuertas;
		this.choferdelbus = choferdelbus;
	}
	
	//Creamos un nuevo metodo
	public void recorrer_la_calle() {
		//Tomamos al choferdelbus
		this.choferdelbus.envejecer(); 
		//this se encarga de seleccionar la clase actual (Unbus)
		// .choferdelbus se refiere a un atributo de la clase, que es un chofer, el cual es un objeto de la clase Conductor
		//envejecer es un metodo de la clase Conductor, el cual tiene choferdelbus ya que es un objeto de esta clase 
		
	}
	
	public void espichar_pasajero() {
		System.out.println("Me estan espichandooo");
	}
	
	
	
	//Esto es main
	public static void main(String[] args) {
		//La siguiente linea crea un bus
		Conductor c1 = new Conductor(70,"Enrrique Peñaloza", -10, null);
		Unbus busesito1 = new Unbus(68, "verde", "Volvo", 7, c1); //Le asignamos un conductor al bus 
		
		busesito1.recorrer_la_calle();
		System.out.println(c1.getAniosExperiencia());
		
		//Imprimimos un metodo estatico, se lo llamamos directamente a la clase
		//No necesitamos ningun bus
		System.out.println(Unbus.ciudad);
		
		//Puedo modoficar el de arriba, no el de abajo
		
		//Imprimimos un metodo estatico inmodificable
		System.out.println(Unbus.tieneruedas);
		
		//CLASE
		Buspadron transmilenio = new Buspadron(68, "azul", "byd", 5);
		transmilenio.setChoferdelbus(c1);
		
		
		//Object la mega clase, modificar lo que retorna pero siguiendo el contrato
		System.out.println(c1.toString());
		
		
		//Creamos un nuevo bus
		Buspadron transmi2 = new Buspadron(20, "flor", "mercedes", 5);
		Unbus parqueado = transmi2; //Donde puedo meter un Bus, puedo meter un Buspadron. Todo Buspadron es un Bus.
		System.out.println(parqueado.toString());
		
		c1.setElbusdelconductor(transmi2); //C1 recibe Unbus, pero Buspadron tambien es Unbus
		
		//Realizamos un cast de BusPadron para que se pueda realizar la accion
		//Estamos convirtiendo de BusPadron a Bus
		(( Buspadron )c1.getElbusdelconductor()).espichar_pasajero();
		
		
		//NUEVA CLASE DEL MARTES 26/08/2025
		//Crear nueva pareja --- reemepazar tipos genericos -- 
		ParejaMaravilla<Conductor,Buspadron> par = new ParejaMaravilla<Conductor,Buspadron>(c1, transmilenio);
		Unbus q = par.getDerecha();
				
		//Creamos un nuev pareja, bajo nuevas clases
		ParejaMaravilla<Conductor,Integer> par_1 = new ParejaMaravilla<Conductor,Integer>(c1, 2);
		int a = par_1.getDerecha();

		
	}
	

}
