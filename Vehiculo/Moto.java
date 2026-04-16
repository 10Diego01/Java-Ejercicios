public class Moto extends Vehiculo {
    protected String tipo;

    public Moto(String placa, String marca, double velocidadMaxima, String tipo) {
        super(placa, marca, velocidadMaxima);
        this.tipo = tipo;
    }

    @Override
    public String mover() {
        return "La moto " + tipo + " con placa " + placa + " está acelerando a máximo " + velocidadMaxima + " km/h.";
    }

    @Override
    public double calcularPeaje() {
        return 4000.0; // Peaje para motos
    }

    @Override
    public String toString() {
        return "Moto [placa=" + placa + ", marca=" + marca +
               ", velocidadMaxima=" + velocidadMaxima +
               ", tipo=" + tipo + "]";
    }
}
