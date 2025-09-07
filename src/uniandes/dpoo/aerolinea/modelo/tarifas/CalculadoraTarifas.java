package uniandes.dpoo.aerolinea.modelo.tarifas;

import java.util.ArrayList;
import java.util.Collection;

import uniandes.dpoo.aerolinea.modelo.Aeropuerto;
import uniandes.dpoo.aerolinea.modelo.Ruta;
import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;
import uniandes.dpoo.aerolinea.tiquetes.Tiquete;

public abstract class CalculadoraTarifas {
	//Como tiene flechas punteadas, se aprovecha de Cliente y de Vuelo
	//Atributos propios de la clase
	public static final double IMPUESTO = 0.28;
	//Atributos heredados
	Vuelo vuelo;
	Cliente cliente;
	
	public int calcularTarifa(Vuelo vuelo, Cliente cliente) {
		//calculamos el costo base
		int c_base = calcularCostoBase(vuelo, cliente);
		//calculamos el porcentaje de descuento
		double p_descuento = calcularPorcentajeDescuento​(cliente);
		//calculamos el valor del descuento
		int descuento = (int)Math.round(c_base*p_descuento);
		//calculamos el impuesto, base - descuento
		int impuesto = calcularValorImpuestos​(c_base-descuento);
		//calculamos la total
		int tarifa_total = c_base - descuento + impuesto;
		return tarifa_total;
		
	}
	//Lo definimos abstracto el metodo calcularcosto base
	protected abstract int calcularCostoBase(Vuelo Vuelo, Cliente cliente);
	//metodo porcentajedescuento
	protected abstract double calcularPorcentajeDescuento​(Cliente cliente);
	//metodo calcularidistancia
	protected int calcularDistanciaVuelo(Ruta ruta) {
		//Para esto toca calcular la distancia entre los dos aeropuertos
		//Agarramos la informacion de los dos aeropuertos que contiene la ruta
		Aeropuerto destino = ruta.getDestino();
		Aeropuerto origen = ruta.getOrigen();
		//Calculamos la distancia con la funcion ya incorporada en los aeropuertos
		int distancia = Aeropuerto.calcularDistancia(destino, origen);
		return distancia;
	}
	protected int calcularValorImpuestos​(int costoBase) {
		return (int) Math.round((costoBase)*IMPUESTO);
	}

	
	


}
