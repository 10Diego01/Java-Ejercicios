package ejercicio1;

public class Estudiante extends Persona{
	private int codigo;

	public Estudiante(int id, String nombre, int edad, int codigo) {
		super(id, nombre, edad);
		this.codigo = codigo;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Estudiante " + super.toString()+" Codigo "+this.codigo;
	}

}
