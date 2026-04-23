import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Persona> personas = new ArrayList<>();

        // Estudiantes
        personas.add(new Estudiante("1001", "Laura Gómez",     20, "EST-2021-001"));
        personas.add(new Estudiante("1002", "Carlos Herrera",  22, "EST-2020-047"));

        // Docentes
        personas.add(new Docente("2001", "María Rodríguez", 45, "Ingeniería de Software", 48, 85_000));
        personas.add(new Docente("2002", "Jorge Castillo",  38, "Matemáticas",            32, 75_000));

        // Administrativos
        personas.add(new Administrativo("3001", "Ana Torres",   35, "Coordinadora Académica", "Facultad de Ingeniería", 3_500_000));
        personas.add(new Administrativo("3002", "Luis Morales", 29, "Auxiliar Administrativo", "Bienestar Universitario", 1_800_000));

        // Mostrar toda la información usando polimorfismo
        System.out.println("=".repeat(120));
        System.out.println("                              REGISTRO INSTITUCIONAL");
        System.out.println("=".repeat(120));

        for (Persona p : personas) {
            p.mostrarInformacion();
        }

        System.out.println("=".repeat(120));

        // Calcular nómina usando instanceof
        double totalNomina = 0;
        for (Persona p : personas) {
            if (p instanceof Docente d)          totalNomina += d.calcularPago();
            if (p instanceof Administrativo a)   totalNomina += a.calcularPago();
        }
        System.out.printf("%nTOTAL NÓMINA A PAGAR: $%.2f%n", totalNomina);
        System.out.printf("Total personas registradas: %d%n", personas.size());
        System.out.println("=".repeat(120));
    }
}
