public class Camion extends Vehiculo {
    protected double capacidadCarga;

    public Camion(String placa, String marca, double velocidadMaxima, double capacidadCarga) {
        super(placa, marca, velocidadMaxima);
        this.capacidadCarga = capacidadCarga;
    }

    @Override
    public String mover() {
        return "El camión con placa " + placa + " transporta hasta " + capacidadCarga + " toneladas a máximo " + velocidadMaxima + " km/h.";
    }

    @Override
    public double calcularPeaje() {
        return 15000.0 + (capacidadCarga * 1000); // Peaje base + carga
    }

    @Override
    public String toString() {
        return "Camion [placa=" + placa + ", marca=" + marca +
               ", velocidadMaxima=" + velocidadMaxima +
               ", capacidadCarga=" + capacidadCarga + " ton]";
    }
}
