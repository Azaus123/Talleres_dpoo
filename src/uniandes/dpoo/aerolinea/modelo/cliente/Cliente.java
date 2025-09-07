package uniandes.dpoo.aerolinea.modelo.cliente;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.tiquetes.Tiquete;

public abstract class Cliente {

	//esta es una clase abstracta
	//crea metodos pero nos los define
	
	//Debemos tener atributos de las listas, ya que todos los clientes tienen listas
	//Deben ser de tipo protected para que quienes hereden a esta clase los puedan usar
	protected List<Tiquete> tiquetesSinUsar;
	protected List<Tiquete> tiquetesUsados;
	protected String tipocliente;
	protected String identificador;
	protected Tiquete tiquete;
	protected Vuelo vuelo;
	
	//Metodo constructor (solo definido, nada hecho)
	public Cliente() {
		//Debe inicializar las listas de tiquetes del cliente
		tiquetesSinUsar = new ArrayList<Tiquete>();
		tiquetesUsados = new ArrayList<Tiquete>();

	}
	//Metodo getTipoCliente
	public String getTipoCliente() {
		return tipocliente;
	}
	//Metodo getIdentificador()
	public String getIdentificador() {
		return identificador;
	}
	//Metodo agregarTiquete
	public void agregarTiquete(Tiquete tiquete) {
		tiquetesSinUsar.addLast(tiquete);
	} 
	
	//Metodo calcularValorTotalTiquete()
	public int calcularValorTotalTiquetes() {
		int valor_total = 0;
		for(Tiquete tick: tiquetesSinUsar) {
			valor_total+= tick.getTarifa();
		}
		return valor_total;
	}
	//Metodo usarTiquetes
	public void usarTiquetes(Vuelo vuelo) {
		Collection<Tiquete> ticks_vuelo = vuelo.getTiquetes();
		//Necesitamos recorrer la lista de tiquetesSinUsAR
		//Ver si coinciden con alguno de los ticks_vuelo
		//En caso que sí, marcarlos como usados
		//Y moverlos a la lista de usados
		//Para esto lo mejor es un iterador
		//Paso 1. Buscar cuales tiquetes salen
		for(Iterator<Tiquete> iterador_ticks = ticks_vuelo.iterator(); iterador_ticks.hasNext();) {
			//obtenemos el tiquete
    		Tiquete t1 = iterador_ticks.next();
    		//Buscamos si esta en la lista de sin usar
    		if(tiquetesSinUsar.contains(t1)) {
    			t1.marcarComoUsado();
    			tiquetesUsados.add(t1);
    		}
    	}
	} 
}
