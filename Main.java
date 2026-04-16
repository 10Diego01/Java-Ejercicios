public class Main {
    public static void main(String[] args) {

        // Crear instancias de cada vehículo
        Vehiculo v1 = new Carro("ABC123", "Toyota", 180.0, 4);
        Vehiculo v2 = new Moto("XYZ789", "Honda", 140.0, "Deportiva");
        Vehiculo v3 = new Camion("TRK456", "Volvo", 90.0, 20.5);

        // Arreglo de vehículos (polimorfismo, sin HashMap)
        Vehiculo[] vehiculos = { v1, v2, v3 };

        System.out.println("===== SISTEMA DE VEHÍCULOS =====\n");

        for (Vehiculo v : vehiculos) {
            System.out.println(v.toString());
            System.out.println("  → " + v.mover());
            System.out.println("  → Peaje: $" + v.calcularPeaje());
            System.out.println();
        }
    }
}
