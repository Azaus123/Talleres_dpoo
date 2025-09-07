package uniandes.dpoo.aerolinea.modelo;

public class Avion {
	//Definimos atributos
	private String nombre;
	private int capacidad;

	//Definimos metodos
	//Constructor
	public Avion(String nombre, int capacidad) {
		super();
		this.nombre = nombre;
		this.capacidad = capacidad;
	}
	//getNombre
	public String getNombre() {
		return nombre;
	}
	//getCapacidad
	public int getCapacidad() {
		return capacidad;
	}

}
