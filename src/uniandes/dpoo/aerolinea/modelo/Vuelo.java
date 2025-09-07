package uniandes.dpoo.aerolinea.modelo;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import uniandes.dpoo.aerolinea.exceptions.VueloSobrevendidoException;
import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;
import uniandes.dpoo.aerolinea.modelo.tarifas.CalculadoraTarifas;
import uniandes.dpoo.aerolinea.tiquetes.Tiquete;

public class Vuelo {
	//Esta clase utiliza a la clase Avion
	//A la clase ruta
	//Y a la clase tiquetes
	
	//Definimos el atributo propio de la clase
	private String fecha;
	//Definimos el resto de atrivutos
	private Ruta ruta;
	private Avion avion;
	private Map<String,Tiquete> tiquetes; //es un mapa de tiquetes donde las llaves son el codigo del tiquete y el valor asociado es el tiquete
	private Cliente cliente;
	private CalculadoraTarifas calculadora;
	private int Cantidad;

	
	
	//Definimos los metodos
	//Constructor
	public Vuelo(Ruta ruta,String fecha,  Avion avion) {
		super();
		this.fecha = fecha;
		this.ruta = ruta;
		this.avion = avion;
	}
	//getRuta
	public Ruta getRuta() {
		return ruta;
	}
	//getFecha
	public String getFecha() {
		return fecha;
	}
	//getAvion
	public Avion getAvion() {
		return avion;
	}	
	//getTiquetes
	//Es necesario retornar una collecion de tiquetes
	public Collection<Tiquete> getTiquetes(){
		return tiquetes.values();
	}
	//venderTiquetes
	public int venderTiquetes(Cliente cliente, CalculadoraTarifas calculadora, int cantidad) throws VueloSobrevendidoException {
		
		
		//Creamos al vuelo
		Vuelo vuelo = new Vuelo(ruta,fecha,avion);
		try {
			int precio_por_tiquete = calculadora.calcularTarifa(vuelo, cliente);
			for(int i = 0; i<cantidad;i++) {
				Tiquete tick = new Tiquete(fecha, vuelo, cliente, precio_por_tiquete);
				tiquetes.put(fecha, tick);
				cliente.agregarTiquete(tick);
				if((tiquetes.size())>avion.getCapacidad()) {
					throw VueloSobrevendidoException;
				}
				
			}
		}catch(VueloSobrevendidoException e) {
			VueloSobrevendidoException;
		}
		
	}
	//equals
	//Todos somos hijos de papá object, incluso los vuelos
	public boolean equals(Object obj) {
		//en suma, lo que queremos hacer es si un vuelo es igual a otro
		// para seleccionar al vuelo actual siempre es this
		// entonces obj.equals(this) se encarga de comparar el objeto pasado por parametros con el actual
		return obj.equals(this); 
		
	}
	

}
