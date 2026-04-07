import java.util.ArrayList;
import java.util.List;

public class Paciente {

    private String idPaciente;
    private String nombreCompleto;
    private int edad;
    private String genero;
    private int etapaCancer;
    private TipoCancer tipoCancer;
    private EstadoPaciente estadoActual;
    private List<Examen> historialExamenes;
    private List<Tratamiento> historialTratamientos;

    public Paciente(String id, String nombre, int edad, String genero,
                    int etapa, TipoCancer cancer, EstadoPaciente estado) {
        this.idPaciente = id;
        this.nombreCompleto = nombre;
        this.edad = edad;
        this.genero = genero;
        this.etapaCancer = etapa;
        this.tipoCancer = cancer;
        this.estadoActual = estado;
        this.historialExamenes = new ArrayList<>();
        this.historialTratamientos = new ArrayList<>();
    }

    public void agregarExamen(Examen examen) {
        if (examen != null) {
            historialExamenes.add(examen);
        }
    }

    public void agregarTratamiento(Tratamiento tratamiento) {
        if (tratamiento != null) {
            historialTratamientos.add(tratamiento);
        }
    }

    // Getters
    public String getIdPaciente() {
        return idPaciente;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public int getEdad() {
        return edad;
    }

    public String getGenero() {
        return genero;
    }

    public int getEtapaCancer() {
        return etapaCancer;
    }

    public TipoCancer getTipoCancer() {
        return tipoCancer;
    }

    public EstadoPaciente getEstadoActual() {
        return estadoActual;
    }

    public List<Examen> getHistorialExamenes() {
        return historialExamenes;
    }

    public List<Tratamiento> getHistorialTratamientos() {
        return historialTratamientos;
    }

    // Setters
    public void setIdPaciente(String idPaciente) {
        this.idPaciente = idPaciente;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setEtapaCancer(int etapaCancer) {
        this.etapaCancer = etapaCancer;
    }

    public void setTipoCancer(TipoCancer tipoCancer) {
        this.tipoCancer = tipoCancer;
    }

    public void setEstadoActual(EstadoPaciente estadoActual) {
        this.estadoActual = estadoActual;
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "id='" + idPaciente + '\'' +
                ", nombre='" + nombreCompleto + '\'' +
                ", edad=" + edad +
                ", genero='" + genero + '\'' +
                ", etapa=" + etapaCancer +
                ", cancer=" + tipoCancer +
                ", estado=" + estadoActual +
                ", examenes=" + historialExamenes.size() +
                ", tratamientos=" + historialTratamientos.size() +
                '}';
    }
}
