package uniandes.dpoo.aerolinea.persistencia;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;

import org.json.JSONObject;

import uniandes.dpoo.aerolinea.modelo.Aerolinea;

public class PersistenciaAerolineaJson implements IPersistenciaAerolinea {
	private String archivo;
	private Aerolinea aerolinea;

	@Override
    public void cargarAerolinea( String archivo, Aerolinea aerolinea )
    {
        String jsonCompleto = new String( Files.readAllBytes( new File( archivo ).toPath( ) ) );
        JSONObject raiz = new JSONObject( jsonCompleto );

        cargarVuelos( aerolinea, raiz.getJSONArray( "vuelos" ) );
        cargarAeropuertos( aerolinea, raiz.getJSONArray( "aeropuertos" ) );
        cargarRutas( aerolinea, raiz.getJSONArray( "rutas" ) );
        cargarAviones( aerolinea, raiz.getJSONArray( "aviones" ) );
    }

    /**
     * Salva en un archivo toda la información sobre los clientes y los tiquetes vendidos por la aerolínea
     * @param archivo La ruta al archivo donde debe quedar almacenada la información
     * @param aerolinea La aerolínea que tiene la información que se quiere almacenar
     * @throws IOException Se lanza esta excepción si hay problemas escribiendo el archivo
     */
	
	
    @Override
    public void salvarAerolinea(String archivo, Aerolinea aerolinea) 
		// TODO Auto-generated method stub
    {
        JSONObject jobject = new JSONObject( );

        salvarVuelos( aerolinea, jobject );

        salvarAeropuertos( aerolinea, jobject );
        
        salvarRutas( aerolinea, jobject );

        salvarAviones( aerolinea, jobject );


        // Escribir la estructura JSON en un archivo
        PrintWriter pw = new PrintWriter( archivo );
        jobject.write( pw, 2, 0 );
        pw.close( );
    }
    
	
	

}
