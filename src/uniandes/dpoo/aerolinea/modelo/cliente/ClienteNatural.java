package uniandes.dpoo.aerolinea.modelo.cliente;

import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.tiquetes.Tiquete;

public class ClienteNatural extends Cliente {
	
	//Creamos los metodos que recibe
	public static final String NATURAL = "Natural"; //en el javadoc dice que es static
	private String nombre;
	
	//Metodo propio
	//Metodo constructor
	public ClienteNatural(String nombre) {
		super(); //lo utilizamos para llamar al constructor de la abstracta, el inicializara las listas
		this.nombre = nombre;
		
	}
	//Metodos heredados

	@Override
	public String getTipoCliente() {
		// TODO Auto-generated method stub
		return NATURAL; //el cliente es de tipo NATURAL
	}

	@Override
	public String getIdentificador() {
		// TODO Auto-generated method stub
		return null;
	}


}
