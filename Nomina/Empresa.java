import java.util.ArrayList;
import java.util.List;

public class Empresa {

    public Empresa() {
        this.listaEmpleados = new ArrayList<>();
    }

    public void agregarEmpleado(Empleado e) {
        listaEmpleados.add(e);
    }

    public void mostrarEmpleados() {
        System.out.println("=".repeat(65));
        System.out.println("           NÓMINA DE EMPLEADOS");
        System.out.println("=".repeat(65));
        if (listaEmpleados.isEmpty()) {
            System.out.println("No hay empleados registrados.");
        } else {
            for (Empleado emp : listaEmpleados) {
                System.out.println(emp);
                System.out.println("-".repeat(65));
            }
        }
    }

    public double calcularNominaTotal() {
        double total = 0;
        for (Empleado emp : listaEmpleados) {
            total += emp.calcularPago();
        }
        return total;
    }

    public static void main(String[] args) {

        private List<Empleado> listaEmpleados;
        // Crear vendedores
        Vendedor v1 = new Vendedor("V001", "Ana García",    30, 2020, 2000000, 8000000);
        Vendedor v2 = new Vendedor("V002", "Carlos López",  45, 2015, 2500000, 12000000);

        // Crear repartidores
        Repartidor r1 = new Repartidor("R001", "Luis Martínez", 28, 2022, 1800000, 25, 'A');
        Repartidor r2 = new Repartidor("R002", "Sofía Ruiz",    35, 2018, 1900000, 18, 'B');
        Repartidor r3 = new Repartidor("R003", "Pedro Díaz",    40, 2019, 1750000, 30, 'Z'); // zona inválida

        // Agregar a la empresa
        empresa.agregarEmpleado(v1);
        empresa.agregarEmpleado(v2);
        empresa.agregarEmpleado(r1);
        empresa.agregarEmpleado(r2);
        empresa.agregarEmpleado(r3);

        // Mostrar nómina
        empresa.mostrarEmpleados();

        System.out.printf("%nTOTAL NÓMINA A PAGAR: $%.2f%n", empresa.calcularNominaTotal());
        System.out.println("=".repeat(65));
    }
}
