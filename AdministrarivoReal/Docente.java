public class Docente extends Persona {

    private String especialidad;
    private int    horasCatedra;
    private double valorHora;

    public Docente(String id, String nom, int edad,
                   String esp, int horas, double valor) {
        super(id, nom, edad);
        this.especialidad = esp;
        this.horasCatedra = horas;
        this.valorHora    = valor;
    }

    /**
     * Pago bruto = horas × valorHora
     * Descuento  = 8% (salud 4% + pensión 4%)
     * Pago neto  = bruto - descuento
     */
    public double calcularPago() {
        double bruto = horasCatedra * valorHora;
        return bruto * 0.92;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        double bruto = horasCatedra * valorHora;
        return String.format(
            "[DOCENTE] %s | Especialidad: %s | Horas: %d | Valor/hora: $%.2f | Bruto: $%.2f | Descuento 8%%: $%.2f | Pago neto: $%.2f",
            super.toString(), especialidad, horasCatedra, valorHora,
            bruto, bruto * 0.08, calcularPago()
        );
    }

    public String getEspecialidad() { return especialidad; }
    public int    getHorasCatedra() { return horasCatedra; }
    public double getValorHora()    { return valorHora; }
}
