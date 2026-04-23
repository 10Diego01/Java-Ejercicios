public abstract class Producto {

    protected String codigo;
    protected String descripcion;
    protected double precioBase;

    public Producto(String codigo, String descripcion, double precioBase) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precioBase = precioBase;
    }

    public abstract double calcularPrecioVenta();

    @Override
    public String toString() {
        return String.format(
            "Código: %s | Descripción: %s | Precio base: $%.2f",
            codigo, descripcion, precioBase
        );
    }

    // Getters
    public String getCodigo() { return codigo; }
    public String getDescripcion() { return descripcion; }
    public double getPrecioBase() { return precioBase; }
}
