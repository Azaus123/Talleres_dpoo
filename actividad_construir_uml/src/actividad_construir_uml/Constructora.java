package actividad_construir_uml;

import java.awt.Color;
import java.awt.Graphics2D;
import java.io.BufferedReader;
import java.io.PrintWriter;

public class Constructora { 
	
	//Atributo archivo privado
	private String archivo;
	
	//Constructor de Constructora
	public Constructora() {
	}
	
	//Metodo abrir
	void abrir(String pNombreArchivo) {
		
	}
	
	//Metodo crear parte
	private void crearParte(String pTipoParte, BufferedReader pLector) {
		
	}
	
	//Metodo darTipos
	public <List> String darTipos() {
		return null;//Siempre debo retornar algo pues es mi contrato hacerlo, en particular algo de tipo list
	}
	
	//Metodo darPartes, que retorna una lista de objetos cuya clase es Parte
	public <List> Parte darPartes() {
		return null; //Siempre debo retornar algo pues es mi contrato hacerlo, en particular algo de tipo list
	}
	//Metodo agregarParte
	public void agregarParte(IParte pF) { //pF de tipo IParte
		
	}
	//Metodo reiniciar
	public void reiniciar() {
		
	}
	
	//Metodo darNombreArchivo
	public String darNombreArchivo() {
		return null;
	}
	
	//Metodo salvar
	public void salvar() {
		
	}
	//Metodo salvar con otros parametros
	public void salvar(String pNombreArchivo) {
		
	}
	//Metodo pintarPartes
	public void pintarPartes(Graphics2D pGraphics) {
		
	}
	//Metodo eliminarParte
	public void eliminarParte(int pX, int pY, String pTipo) {
		
	}
	//Metodo cambiarPosicionParte
	public void cambiarPosicionParte(int pX, int pY, String pTipo, int pNuevox, int pNuevoY) {
		
	}
	//Metodo buscarParte
	public IParte buscarParte(int pX, int pY) {
		return null; //estoy obligado a retornar algo de IParte, en particular, null
	}
	//Metodo verificarInvariante
	private void verificarInvariante() {
		
	}
	//Metodo metodo1
	public String metodo1(){
		return null; //estoy obligado a retornar algo de tipo String, en particular, null
	}	
	public String metodo2(){
		return null; //estoy obligado a retornar algo de tipo String, en particular, null
	}
}
