package ejercicio1;

public class Docente extends Persona{
	private String especialidad;
	private int salario;
	
	public Docente(int id, String nombre, int edad, String especialidad, int salario) {
		super(id, nombre, edad);
		this.especialidad = especialidad;
		this.salario = salario;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Docente "+super.toString()+" Especialidad "+this.especialidad+" Salario "+this.salario;
	}
	
	@Override
	public int calcularSalario() {
		// TODO Auto-generated method stub
		return 0;
	}

}
