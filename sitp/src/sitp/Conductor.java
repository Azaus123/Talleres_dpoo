package sitp;

public class Conductor {
	//Atributos que definen a un conductor
	private int edad;
	private String nombre;
	private int aniosExperiencia;
	private Unbus elbusdelconductor; //Asociar un objeto de la clase Bus al conductor
	//Nota: Puedo tener un atributo de mi mismo tipo, private Conductor Aprendiz;
	
	//Esto es un metodo constructor para un conductor
	public Conductor(int edad, String nombre, int aniosExperiencia, Unbus elbusdelconductor) {
		super();
		this.edad = edad;
		this.nombre = nombre;
		this.aniosExperiencia = aniosExperiencia;
		this.elbusdelconductor = elbusdelconductor;
	}
	//Creamos un nuevo metodos envejecer
	public void envejecer() {
		this.aniosExperiencia++; //Aumentamos los anios de experiencia en 1
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getAniosExperiencia() {
		return aniosExperiencia;
	}
	public void setAniosExperiencia(int aniosExperiencia) {
		this.aniosExperiencia = aniosExperiencia;
	}
	public Unbus getElbusdelconductor() {
		return elbusdelconductor;
	}
	public void setElbusdelconductor(Unbus elbusdelconductor) {
		this.elbusdelconductor = elbusdelconductor;
	}
	
	//Modificamos un metodo de object, toString
	//Redefine el comportamiento heredado de object
	@Override //Buena etiqueta para saber cuando algo se altera
	public String toString() {
		return "Hola, me llamo " + this.nombre + " y tengo " + this.edad + "años";
	}	

}
