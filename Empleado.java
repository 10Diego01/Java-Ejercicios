public abstract class Empleado {

    protected String identificacion;
    protected String nombre;
    protected int edad;
    protected int anioIngreso;
    protected double salarioBasico;

    public Empleado(String identificacion, String nombre, int edad, int anioIngreso, double salarioBasico) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.edad = edad;
        this.anioIngreso = anioIngreso;
        this.salarioBasico = salarioBasico;
    }

    public abstract double calcularPago();

    public abstract double calcularBonificacion();

    protected double calcularDescuento(double subtotal) {
        // Descuento del 8% sobre el subtotal (salud + pensión)
        return subtotal * 0.08;
    }

    @Override
    public String toString() {
        return String.format(
            "ID: %s | Nombre: %s | Edad: %d | Año Ingreso: %d | Salario Básico: $%.2f",
            identificacion, nombre, edad, anioIngreso, salarioBasico
        );
    }

    // Getters
    public String getIdentificacion() { return identificacion; }
    public String getNombre() { return nombre; }
    public int getEdad() { return edad; }
    public int getAnioIngreso() { return anioIngreso; }
    public double getSalarioBasico() { return salarioBasico; }
}
