package uniandes.dpoo.aerolinea.modelo.tarifas;

import uniandes.dpoo.aerolinea.modelo.Ruta;
import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;
import uniandes.dpoo.aerolinea.modelo.cliente.ClienteCorporativo;

public class CalculadoraTarifasTemporadaBaja extends CalculadoraTarifas {
	//Establecemos los atributos
	protected final int COSTO_POR_KM_NATURAL = 600;
	protected final int COSTO_POR_KM_CORPORATIVO = 900;
	protected final double DESCUENTO_PEQ = 0.02;
	protected final double DESCUENTO_MEDIANAS = 0.1;
	protected final double DESCUENTO_GRANDES = 0.2;

	//Resolvemos los metodos no implementados por la clase que nos heredó
	@Override
	public int calcularCostoBase(Vuelo Vuelo, Cliente cliente) {
		// TODO Auto-generated method stub
		//Saber el tipo que es el cliente
		String tipo_cliente = cliente.getTipoCliente();
		int costo_por_km = 0;
		if(tipo_cliente.equals("Natural")) {
			costo_por_km = COSTO_POR_KM_NATURAL;
			
		}else if (tipo_cliente.equals("Corporativo")) {
			costo_por_km = COSTO_POR_KM_CORPORATIVO;
		}
		Ruta ruta = vuelo.getRuta();
		int distancia = calcularDistanciaVuelo(ruta);
		return distancia*costo_por_km;
	}

	@Override
	public double calcularPorcentajeDescuento​(Cliente cliente) {
		// TODO Auto-generated method stub
		//Solo se aplica descuento a los corporativos
		double porcentaje = 0.0;
		if(cliente.getTipoCliente().equals("Corporativo")) {
			ClienteCorporativo c1 = (ClienteCorporativo) cliente; //cast
			if(c1.getTamanoEmpresa()==1) {
				porcentaje = DESCUENTO_GRANDES;
			}else if(c1.getTamanoEmpresa() == 2) {
				porcentaje = DESCUENTO_MEDIANAS;
			}else {
				porcentaje = DESCUENTO_PEQ;
			}
		}
		return porcentaje;
	}
	

}
