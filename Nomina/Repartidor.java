public class Repartidor extends Empleado {

    private char zona;
    private int numRepartos;
    private static final double VALOR_REPARTO = 10000;

    public Repartidor(String id, String nom, int edad, int anio, double salario, int numRep, char zona) {
        super(id, nom, edad, anio, salario);
        this.numRepartos = numRep;
        this.zona = validarZona(zona);
    }

    private char validarZona(char zona) {
        char z = Character.toUpperCase(zona);
        if (z == 'A' || z == 'B' || z == 'C') {
            return z;
        }
        System.out.println("Zona inválida '" + zona + "'. Se asigna zona 'A' por defecto.");
        return 'A';
    }

    @Override
    public double calcularBonificacion() {
        // Bonificación según zona
        double porcentaje = switch (zona) {
            case 'A' -> 0.10;
            case 'B' -> 0.07;
            case 'C' -> 0.05;
            default  -> 0.05;
        };
        return salarioBasico * porcentaje;
    }

    @Override
    public double calcularPago() {
        double gananciasReparto = numRepartos * VALOR_REPARTO;
        double subtotal = salarioBasico + gananciasReparto + calcularBonificacion();
        double descuento = calcularDescuento(subtotal);
        return subtotal - descuento;
    }

    @Override
    public String toString() {
        double gananciasReparto = numRepartos * VALOR_REPARTO;
        return String.format(
            "[REPARTIDOR] %s%n" +
            "  Zona: %c | Repartos: %d | Ganancia repartos: $%.2f%n" +
            "  Bonificación: $%.2f | Descuento: $%.2f | Pago neto: $%.2f",
            super.toString(),
            zona, numRepartos, gananciasReparto,
            calcularBonificacion(),
            calcularDescuento(salarioBasico + gananciasReparto + calcularBonificacion()),
            calcularPago()
        );
    }

    // Getters
    public char getZona() { return zona; }
    public int getNumRepartos() { return numRepartos; }
}
