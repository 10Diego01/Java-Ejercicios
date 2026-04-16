public class Vehiculo {
    protected String placa;
    protected String marca;
    protected double velocidadMaxima;

    public Vehiculo(String placa, String marca, double velocidadMaxima) {
        this.placa = placa;
        this.marca = marca;
        this.velocidadMaxima = velocidadMaxima;
    }

    public String mover() {
        return "El vehículo con placa " + placa + " se está moviendo.";
    }

    public double calcularPeaje() {
        return 5000.0; // Peaje base
    }

    @Override
    public String toString() {
        return "Vehiculo [placa=" + placa + ", marca=" + marca + ", velocidadMaxima=" + velocidadMaxima + "]";
    }
}
