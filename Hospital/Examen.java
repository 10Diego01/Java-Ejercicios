import java.time.LocalDate;

public class Examen {

    private String idExamen;
    private LocalDate fechaRealizacion;
    private String tipoExamen;
    private String resultado;

    public Examen(String id, LocalDate fecha, String tipo, String resultado) {
        this.idExamen = id;
        this.fechaRealizacion = fecha;
        this.tipoExamen = tipo;
        this.resultado = resultado;
    }

    // Getters
    public String getIdExamen() {
        return idExamen;
    }

    public LocalDate getFechaRealizacion() {
        return fechaRealizacion;
    }

    public String getTipoExamen() {
        return tipoExamen;
    }

    public String getResultado() {
        return resultado;
    }

    // Setters
    public void setIdExamen(String idExamen) {
        this.idExamen = idExamen;
    }

    public void setFechaRealizacion(LocalDate fechaRealizacion) {
        this.fechaRealizacion = fechaRealizacion;
    }

    public void setTipoExamen(String tipoExamen) {
        this.tipoExamen = tipoExamen;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    @Override
    public String toString() {
        return "Examen{" +
                "idExamen='" + idExamen + '\'' +
                ", fechaRealizacion=" + fechaRealizacion +
                ", tipoExamen='" + tipoExamen + '\'' +
                ", resultado='" + resultado + '\'' +
                '}';
    }
}
