package sitp;

public class Buspadron extends Unbus{

	//Me genera un constructor por defecto
	public Buspadron(int sillas, String color, String marca, int numpuertas) {
		super(sillas, color, marca, numpuertas); //Esto hereda los atributos de Bus, Super llama a los atributos de Unbus 
		// TODO Auto-generated constructor stub
		//this.color = "Rojo"; //Esto es incorrecto porque color no esta visible, color es privado. Toca cambiar a que color sea Protected
		this.color = "Rojo";
	}
	
	//Estamos modificando el recorrerlacalle, override
	@Override
	public void recorrer_la_calle() {
		super.recorrer_la_calle();
		super.recorrer_la_calle();
	}
	
}
