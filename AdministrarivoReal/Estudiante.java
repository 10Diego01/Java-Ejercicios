public class Estudiante extends Persona {

    private String codigo;

    public Estudiante(String id, String nom, int edad, String codigo) {
        super(id, nom, edad);
        this.codigo = codigo;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return String.format(
            "[ESTUDIANTE] %s | Código: %s",
            super.toString(), codigo
        );
    }

    public String getCodigo() { return codigo; }
}
