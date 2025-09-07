package uniandes.dpoo.aerolinea.tiquetes;

import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;

public class Tiquete {
	//Creamos los atributos propios de la clase
	private String codigo;
	private int tarifa;
	private boolean usado;
	private Vuelo vuelo; //toca importarlo al estar en otro paquete
	private Cliente clienteComprador; //toca importarla
	
	//Metodos
	//Creamos el constructor
	public Tiquete(String codigo, Vuelo vuelo, Cliente clienteComprador, int tarifa) {
		super();
		this.codigo = codigo;
		this.tarifa = tarifa;
		this.usado = usado;
		this.vuelo = vuelo;
		this.clienteComprador = clienteComprador;
	}
	//getCliente
	public Cliente getCliente() {
		return clienteComprador;
	}
	//getVuelo
	public Vuelo getVuelo() {
		return vuelo;
	}
	//getCodigo
	public String getCodigo() {
		return codigo;
	}
	//getTarifa
	public int getTarifa(){
		return tarifa;
	}
	//marcarComoUsado()
	public void marcarComoUsado() {
		this.usado = true; //modificamos el atributo
	}
	//esUsado()
	public boolean esUsado() {
		return usado;
	}
	

}
