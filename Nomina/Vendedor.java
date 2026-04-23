public class Vendedor extends Empleado {

    private double ventasMes;
    private static final double COMISION_VENTAS = 0.15;

    public Vendedor(String id, String nom, int edad, int anio, double salario, double ventas) {
        super(id, nom, edad, anio, salario);
        this.ventasMes = ventas;
    }

    @Override
    public double calcularBonificacion() {
        // Bonificación: comisión sobre ventas del mes
        return ventasMes * COMISION_VENTAS;
    }

    @Override
    public double calcularPago() {
        double subtotal = salarioBasico + calcularBonificacion();
        double descuento = calcularDescuento(subtotal);
        return subtotal - descuento;
    }

    @Override
    public String toString() {
        return String.format(
            "[VENDEDOR] %s%n" +
            "  Ventas del mes: $%.2f | Comisión (%.0f%%): $%.2f%n" +
            "  Bonificación: $%.2f | Descuento: $%.2f | Pago neto: $%.2f",
            super.toString(),
            ventasMes, COMISION_VENTAS * 100, ventasMes * COMISION_VENTAS,
            calcularBonificacion(),
            calcularDescuento(salarioBasico + calcularBonificacion()),
            calcularPago()
        );
    }

    // Getter
    public double getVentasMes() { return ventasMes; }
}
