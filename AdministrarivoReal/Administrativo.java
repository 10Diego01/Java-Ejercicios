public class Administrativo extends Persona {

    private String cargo;
    private String dependencia;
    private double salarioFijo;

    public Administrativo(String id, String nom, int edad,
                          String cargo, String dep, double salario) {
        super(id, nom, edad);
        this.cargo       = cargo;
        this.dependencia = dep;
        this.salarioFijo = salario;
    }

    /**
     * Pago = salarioFijo - descuento 8% (salud + pensión)
     * + auxilio de transporte si salario <= 2 SMMLV (~2'600.000 en 2024)
     */
    public double calcularPago() {
        double descuento = salarioFijo * 0.08;
        double auxTransporte = (salarioFijo <= 2_600_000) ? 162_000 : 0;
        return salarioFijo - descuento + auxTransporte;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        double auxTransporte = (salarioFijo <= 2_600_000) ? 162_000 : 0;
        return String.format(
            "[ADMINISTRATIVO] %s | Cargo: %s | Dependencia: %s | Salario fijo: $%.2f | Descuento 8%%: $%.2f | Aux. transporte: $%.2f | Pago neto: $%.2f",
            super.toString(), cargo, dependencia,
            salarioFijo, salarioFijo * 0.08, auxTransporte, calcularPago()
        );
    }

    public String getCargo()       { return cargo; }
    public String getDependencia() { return dependencia; }
    public double getSalarioFijo() { return salarioFijo; }
}
