import java.util.ArrayList;
import java.util.List;

public class Tienda {


    public Tienda() {
        this.inventario = new ArrayList<>();
    }

    public void agregarProducto(Producto p) {
        inventario.add(p);
    }

    public void mostrarInventario() {
        System.out.println("=".repeat(65));
        System.out.println("           INVENTARIO DE LA TIENDA");
        System.out.println("=".repeat(65));
        if (inventario.isEmpty()) {
            System.out.println("No hay productos registrados.");
        } else {
            for (Producto p : inventario) {
                System.out.println(p);
                System.out.println("-".repeat(65));
            }
        }
    }

    public double calcularValorInventario() {
        double total = 0;
        for (Producto p : inventario) {
            total += p.calcularPrecioVenta();
        }
        return total;
    }

    public int contarCaducados() {
        int count = 0;
        for (Producto p : inventario) {
            if (p instanceof Perecedero perecedero) {
                if (perecedero.getDiasACaducar() <= 0) count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        private List<Producto> inventario;
        // Productos perecederos
        tienda.agregarProducto(new Perecedero("P001", "Leche entera 1L",     3200,  2));
        tienda.agregarProducto(new Perecedero("P002", "Yogur natural 200g",  1800,  6));
        tienda.agregarProducto(new Perecedero("P003", "Pan tajado integral", 4500, 12));
        tienda.agregarProducto(new Perecedero("P004", "Queso campesino 500g",9800, 20));
        tienda.agregarProducto(new Perecedero("P005", "Jamón serrano 200g",  7200,  0)); // caducado

        // Productos no perecederos
        tienda.agregarProducto(new NoPerecedero("N001", "Detergente líquido 1L", 12000, 'A'));
        tienda.agregarProducto(new NoPerecedero("N002", "Jugo de naranja 1L",     4800, 'B'));
        tienda.agregarProducto(new NoPerecedero("N003", "Atún en lata 170g",      3500, 'C'));
        tienda.agregarProducto(new NoPerecedero("N004", "Blanqueador 2L",         8900, 'X')); // tipo inválido

        // Mostrar inventario
        tienda.mostrarInventario();

        System.out.printf("%nValor total del inventario: $%.2f%n", tienda.calcularValorInventario());
        System.out.printf("Productos caducados: %d%n", tienda.contarCaducados());
        System.out.println("=".repeat(65));
    }
}
