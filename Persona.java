public class Persona {

    protected String identificacion;
    protected String nombre;
    protected int    edad;

    public Persona(String identificacion, String nombre, int edad) {
        this.identificacion = identificacion;
        this.nombre         = nombre;
        this.edad           = edad;
    }

    public void mostrarInformacion() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return String.format("ID: %s | Nombre: %s | Edad: %d",
                identificacion, nombre, edad);
    }

    // Getters
    public String getIdentificacion() { return identificacion; }
    public String getNombre()         { return nombre; }
    public int    getEdad()           { return edad; }
}
