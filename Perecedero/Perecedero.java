public class Perecedero extends Producto {

    private int diasACaducar;

    public Perecedero(String cod, String desc, double precio, int dias) {
        super(cod, desc, precio);
        this.diasACaducar = dias;
    }

    /**
     * Reglas de precio según días para caducar:
     *  - <= 0  : no se vende (precio 0)
     *  - 1-3   : 40% de descuento
     *  - 4-7   : 20% de descuento
     *  - 8-15  : 10% de descuento
     *  - > 15  : precio base sin descuento
     */
    @Override
    public double calcularPrecioVenta() {
        if (diasACaducar <= 0) return 0;
        if (diasACaducar <= 1)  return precioBase /4;
        if (diasACaducar <= 2)  return precioBase /3;
        if (diasACaducar <= 3) return precioBase /2;
        return precioBase;
    }

    @Override
    public String toString() {
        String estado;
        if      (diasACaducar <= 0)  estado = "CADUCADO - no disponible";
        else if (diasACaducar <= 3)  estado = "Descuento 40%";
        else if (diasACaducar <= 7)  estado = "Descuento 20%";
        else if (diasACaducar <= 15) estado = "Descuento 10%";
        else                         estado = "Precio normal";

        return String.format(
            "[PERECEDERO] %s%n  Días para caducar: %d | Estado: %s | Precio venta: $%.2f",
            super.toString(), diasACaducar, estado, calcularPrecioVenta()
        );
    }

    public int getDiasACaducar() { return diasACaducar; }
}
