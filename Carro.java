public class Carro extends Vehiculo {
    protected int numeroPuertas;

    public Carro(String placa, String marca, double velocidadMaxima, int numeroPuertas) {
        super(placa, marca, velocidadMaxima);
        this.numeroPuertas = numeroPuertas;
    }

    @Override
    public String mover() {
        return "El carro con placa " + placa + " está conduciendo a máximo " + velocidadMaxima + " km/h.";
    }

    @Override
    public double calcularPeaje() {
        return 8000.0; // Peaje para carros
    }

    @Override
    public String toString() {
        return "Carro [placa=" + placa + ", marca=" + marca +
               ", velocidadMaxima=" + velocidadMaxima +
               ", numeroPuertas=" + numeroPuertas + "]";
    }
}
