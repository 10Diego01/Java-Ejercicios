package ejercicio1;

public class Persona {
	protected int id;
	protected String nombre;
	protected int edad;
	
	public Persona(int id, String nombre, int edad) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.edad = edad;
	}
	@Override
	public String toString() {
		return "Id " + this.id+ " Nombre "+this.nombre + " Edad "+this.edad;
	}
	
	public int calcularSalario() {
		return 0;
	}
	
}
