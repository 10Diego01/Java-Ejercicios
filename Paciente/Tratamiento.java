import java.util.Random;

public class Tratamiento {

    private String idTratamiento;
    private int duracionDias;
    private String efectosSecundarios;
    private TipoTratamiento modalidadTratamiento;

    public Tratamiento(String id, TipoTratamiento modalidad, int duracion, String efectos) {
        this.idTratamiento = id;
        this.modalidadTratamiento = modalidad;
        this.duracionDias = duracion;
        this.efectosSecundarios = efectos;
    }

    /**
     * Calcula la eficacia del tratamiento.
     * La fórmula asigna una base por modalidad y penaliza según la duración.
     * Retorna un valor entre 0.0 y 1.0 (0% - 100% de eficacia).
     */
    public double calcularEficacia() {
        double eficaciaBase;

        switch (modalidadTratamiento) {
            case INMUNOTERAPIA:
                eficaciaBase = 0.85;
                break;
            case QUIMIOTERAPIA:
                eficaciaBase = 0.70;
                break;
            case RADIOTERAPIA:
                eficaciaBase = 0.65;
                break;
            case CIRUGIA:
                eficaciaBase = 0.75;
                break;
            default:
                eficaciaBase = 0.50;
        }

        // Penalización leve por tratamientos muy prolongados (>180 días)
        double penalizacion = duracionDias > 180 ? 0.05 : 0.0;

        double eficacia = eficaciaBase - penalizacion;
        // Asegurar rango [0.0, 1.0]
        return Math.max(0.0, Math.min(1.0, eficacia));
    }

    // Getters
    public String getIdTratamiento() {
        return idTratamiento;
    }

    public int getDuracionDias() {
        return duracionDias;
    }

    public String getEfectosSecundarios() {
        return efectosSecundarios;
    }

    public TipoTratamiento getModalidadTratamiento() {
        return modalidadTratamiento;
    }

    // Setters
    public void setIdTratamiento(String idTratamiento) {
        this.idTratamiento = idTratamiento;
    }

    public void setDuracionDias(int duracionDias) {
        this.duracionDias = duracionDias;
    }

    public void setEfectosSecundarios(String efectosSecundarios) {
        this.efectosSecundarios = efectosSecundarios;
    }

    public void setModalidadTratamiento(TipoTratamiento modalidadTratamiento) {
        this.modalidadTratamiento = modalidadTratamiento;
    }

    @Override
    public String toString() {
        return "Tratamiento{" +
                "idTratamiento='" + idTratamiento + '\'' +
                ", modalidad=" + modalidadTratamiento +
                ", duracionDias=" + duracionDias +
                ", efectosSecundarios='" + efectosSecundarios + '\'' +
                ", eficacia=" + String.format("%.2f%%", calcularEficacia() * 100) +
                '}';
    }
}
