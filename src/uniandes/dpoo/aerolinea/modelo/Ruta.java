package uniandes.dpoo.aerolinea.modelo;


/**
 * Esta clase tiene la información de una ruta entre dos aeropuertos que cubre una aerolínea.
 */
public class Ruta
{
    // TODO completar
	//Atributos
	private String horaSalida;
	private String horaLlegada;
	private String codigoRuta;
	
	//Toca crear 2 nuevos atributos por los aeropuertos
	private Aeropuerto origen;
	private Aeropuerto destino;
	
	//Metodos
	//Ruta, que utiliza a dos aeropuertos, toca importar la clase
    public Ruta(Aeropuerto origen, Aeropuerto destino, String horaSalida, String horaLlegada, String codigoRuta) {
		super();
		this.horaSalida = horaSalida;
		this.horaLlegada = horaLlegada;
		this.codigoRuta = codigoRuta;
		//Son tambien atributos,los utilizamos
		this.origen = origen;
		this.destino = destino;
	}
    //getCodigoRuta
    public String getCodigoRuta() {
    	return codigoRuta;
    }
    //getOrigen - getDestino
	public Aeropuerto getOrigen() {
		return origen;
	}

	public Aeropuerto getDestino() {
		return destino;
	}
	//getHoraSalida
    public String getHoraSalida() {
		return horaSalida;
	}
    //getHoraLlegada
	public String getHoraLlegada() {
		return horaLlegada;
	}


	/**
     * Dada una cadena con una hora y minutos, retorna los minutos.
     * 
     * Por ejemplo, para la cadena '715' retorna 15.
     * @param horaCompleta Una cadena con una hora, donde los minutos siempre ocupan los dos últimos caracteres
     * @return Una cantidad de minutos entre 0 y 59
     */
    public static int getMinutos( String horaCompleta )
    {
        int minutos = Integer.parseInt( horaCompleta ) % 100;
        return minutos;
    }

	/**
     * Dada una cadena con una hora y minutos, retorna las horas.
     * 
     * Por ejemplo, para la cadena '715' retorna 7.
     * @param horaCompleta Una cadena con una hora, donde los minutos siempre ocupan los dos últimos caracteres
     * @return Una cantidad de horas entre 0 y 23
     */
    public static int getHoras( String horaCompleta )
    {
        int horas = Integer.parseInt( horaCompleta ) / 100;
        return horas;
    }
    
    //Mejor implementamos a getDuracion() por acá
    public int getDuracion() {
    	//convertimos a minutos hora salida
    	int h_horaSalida = getHoras(horaSalida);
    	int m_horaSalida = getMinutos(horaSalida);
    	int total_minutos_horaSalida = h_horaSalida*60 + m_horaSalida;
    	//convertimos a minutos horaLlegada
    	int h_horaLlegada = getHoras(horaLlegada);
    	int m_horaLlegada = getMinutos(horaLlegada);
    	int total_minutos_horaLlegada = h_horaLlegada*60 + m_horaLlegada;
    	int retorno = total_minutos_horaLlegada - total_minutos_horaSalida;
    	return retorno;
    }

    
}
