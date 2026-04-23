public class NoPerecedero extends Producto {

    private char tipo;

    public NoPerecedero(String cod, String desc, double precio, char tipo) {
        super(cod, desc, precio);
        this.tipo = validarTipo(tipo);
    }

    /**
     * Tipos válidos:
     *  'A' - Artículo de limpieza   → IVA 19%
     *  'B' - Bebida no alcohólica   → IVA  5%
     *  'C' - Enlatado / conserva    → IVA  0% (exento)
     */
    private char validarTipo(char tipo) {
        char t = Character.toUpperCase(tipo);
        if (t == 'A' || t == 'B' || t == 'C') {
            return t;
        }
        System.out.println("Tipo inválido '" + tipo + "'. Se asigna tipo 'C' por defecto.");
        return 'C';
    }

    @Override
    public double calcularPrecioVenta() {
        double iva = switch (tipo) {
            case 'A' -> 0.19;
            case 'B' -> 0.05;
            case 'C' -> 0.00;
            default  -> 0.00;
        };
        return precioBase * (1 + iva);
    }

    @Override
    public String toString() {
        String nombreTipo = switch (tipo) {
            case 'A' -> "Limpieza (IVA 19%)";
            case 'B' -> "Bebida (IVA 5%)";
            case 'C' -> "Enlatado (exento)";
            default  -> "Desconocido";
        };
        return String.format(
            "[NO PERECEDERO] %s%n  Tipo: %c - %s | Precio venta: $%.2f",
            super.toString(), tipo, nombreTipo, calcularPrecioVenta()
        );
    }

    public char getTipo() { return tipo; }
}
