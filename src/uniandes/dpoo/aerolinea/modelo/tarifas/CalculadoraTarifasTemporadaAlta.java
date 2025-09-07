package uniandes.dpoo.aerolinea.modelo.tarifas;

import uniandes.dpoo.aerolinea.modelo.Ruta;
import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;

public class CalculadoraTarifasTemporadaAlta extends CalculadoraTarifas {

	//Atributo
	protected final int COSTO_POR_KM = 1000;
	@Override
	public int calcularCostoBase(Vuelo Vuelo, Cliente cliente) {
		// TODO Auto-generated method stub
		
		Ruta ruta = vuelo.getRuta();
		int distancia = calcularDistanciaVuelo(ruta);
		return distancia*COSTO_POR_KM; //No importa el cliente que sea
	}

	@Override
	public double calcularPorcentajeDescuento​(Cliente cliente) {
		// TODO Auto-generated method stub
		return 0; //los vuelos en temporada alta no tienen descuento
	}
	
}
