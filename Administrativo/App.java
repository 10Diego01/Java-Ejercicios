package ejercicio1;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Estudiante miEstudiante =new Estudiante(1020,"Pachita",20,105030);
		System.out.println(miEstudiante);
		
		
		Administrativo miAdministrativo = new Administrativo(5089,"Maria",25,"Decano","IA",1020300);
		
		System.out.println(miAdministrativo);
		
		System.out.println("Valor a Pagar "+miAdministrativo.calcularSalario());

	}

}
