import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Hospital {

    private String nombreHospital;
    private List<Paciente> listaPacientes;

    public Hospital(String nombreHospital) {
        this.nombreHospital = nombreHospital;
        this.listaPacientes = new ArrayList<>();
    }

    public void registrarPaciente(Paciente paciente) {
        if (paciente != null) {
            listaPacientes.add(paciente);
            System.out.println("Paciente registrado: " + paciente.getNombreCompleto());
        }
    }

    /**
     * Muestra cuántos pacientes hay por cada tipo de cáncer.
     */
    public void mostrarEstadisticasCancer() {
        System.out.println("\n========================================");
        System.out.println("  ESTADÍSTICAS POR TIPO DE CÁNCER");
        System.out.println("  Hospital: " + nombreHospital);
        System.out.println("========================================");

        int sarcoma  = 0;
        int leucemia = 0;
        int linfoma  = 0;

        for (Paciente p : listaPacientes) {
            if (p.getTipoCancer() == TipoCancer.SARCOMA)   sarcoma++;
            if (p.getTipoCancer() == TipoCancer.LEUCEMIA)  leucemia++;
            if (p.getTipoCancer() == TipoCancer.LINFOMA)   linfoma++;
        }

        System.out.printf("  %-15s : %d paciente(s)%n", "SARCOMA",  sarcoma);
        System.out.printf("  %-15s : %d paciente(s)%n", "LEUCEMIA", leucemia);
        System.out.printf("  %-15s : %d paciente(s)%n", "LINFOMA",  linfoma);
        System.out.println("  ----------------------------------------");
        System.out.println("  Total de pacientes: " + listaPacientes.size());
        System.out.println("========================================\n");
    }

    /**
     * Muestra cuántos pacientes hay en cada estado clínico.
     */
    public void mostrarEstadisticasEstado() {
        System.out.println("\n========================================");
        System.out.println("  ESTADÍSTICAS POR ESTADO DEL PACIENTE");
        System.out.println("  Hospital: " + nombreHospital);
        System.out.println("========================================");

        int enTratamiento = 0;
        int enRemision    = 0;
        int fallecido     = 0;

        for (Paciente p : listaPacientes) {
            if (p.getEstadoActual() == EstadoPaciente.EN_TRATAMIENTO) enTratamiento++;
            if (p.getEstadoActual() == EstadoPaciente.EN_REMISION)    enRemision++;
            if (p.getEstadoActual() == EstadoPaciente.FALLECIDO)      fallecido++;
        }

        System.out.printf("  %-20s : %d paciente(s)%n", "EN_TRATAMIENTO", enTratamiento);
        System.out.printf("  %-20s : %d paciente(s)%n", "EN_REMISION",    enRemision);
        System.out.printf("  %-20s : %d paciente(s)%n", "FALLECIDO",      fallecido);
        System.out.println("  ----------------------------------------");
        System.out.println("  Total de pacientes: " + listaPacientes.size());
        System.out.println("========================================\n");
    }

    // Getters
    public String getNombreHospital() {
        return nombreHospital;
    }

    public List<Paciente> getListaPacientes() {
        return listaPacientes;
    }

    // Setters
    public void setNombreHospital(String nombreHospital) {
        this.nombreHospital = nombreHospital;
    }

    // =====================================================================
    // MÉTODO MAIN — Demostración del sistema
    // =====================================================================
    public static void main(String[] args) {

        // Crear hospital
        Hospital hospital = new Hospital("Hospital Nacional Oncológico");

        // ── Paciente 1 ──────────────────────────────────────────────────
        Paciente p1 = new Paciente(
                "P001", "Ana María López", 45, "Femenino",
                2, TipoCancer.LEUCEMIA, EstadoPaciente.EN_TRATAMIENTO
        );
        p1.agregarExamen(new Examen(
                "E001", LocalDate.of(2024, 3, 10),
                "Hemograma", "Leucocitos elevados"
        ));
        p1.agregarExamen(new Examen(
                "E002", LocalDate.of(2024, 4, 5),
                "Biopsia de médula", "Confirmación leucemia tipo B"
        ));
        p1.agregarTratamiento(new Tratamiento(
                "T001", TipoTratamiento.QUIMIOTERAPIA,
                120, "Náuseas, fatiga, pérdida de cabello"
        ));

        // ── Paciente 2 ──────────────────────────────────────────────────
        Paciente p2 = new Paciente(
                "P002", "Carlos Rodríguez", 60, "Masculino",
                3, TipoCancer.SARCOMA, EstadoPaciente.EN_TRATAMIENTO
        );
        p2.agregarExamen(new Examen(
                "E003", LocalDate.of(2024, 1, 20),
                "Resonancia magnética", "Tumor en tejido blando 4 cm"
        ));
        p2.agregarTratamiento(new Tratamiento(
                "T002", TipoTratamiento.CIRUGIA,
                30, "Dolor postoperatorio, inflamación"
        ));
        p2.agregarTratamiento(new Tratamiento(
                "T003", TipoTratamiento.RADIOTERAPIA,
                60, "Quemaduras leves en piel, cansancio"
        ));

        // ── Paciente 3 ──────────────────────────────────────────────────
        Paciente p3 = new Paciente(
                "P003", "Sofía Herrera", 38, "Femenino",
                1, TipoCancer.LINFOMA, EstadoPaciente.EN_REMISION
        );
        p3.agregarExamen(new Examen(
                "E004", LocalDate.of(2023, 11, 5),
                "PET-CT", "Sin actividad tumoral detectable"
        ));
        p3.agregarTratamiento(new Tratamiento(
                "T004", TipoTratamiento.INMUNOTERAPIA,
                90, "Fiebre leve, erupciones cutáneas"
        ));

        // ── Paciente 4 ──────────────────────────────────────────────────
        Paciente p4 = new Paciente(
                "P004", "Jorge Martínez", 72, "Masculino",
                4, TipoCancer.SARCOMA, EstadoPaciente.FALLECIDO
        );
        p4.agregarExamen(new Examen(
                "E005", LocalDate.of(2023, 6, 15),
                "Tomografía", "Metástasis pulmonar extensa"
        ));
        p4.agregarTratamiento(new Tratamiento(
                "T005", TipoTratamiento.QUIMIOTERAPIA,
                200, "Severa supresión de médula ósea"
        ));

        // ── Registrar pacientes ─────────────────────────────────────────
        hospital.registrarPaciente(p1);
        hospital.registrarPaciente(p2);
        hospital.registrarPaciente(p3);
        hospital.registrarPaciente(p4);

        // ── Detalle de cada paciente ────────────────────────────────────
        System.out.println("\n========================================");
        System.out.println("       DETALLE DE PACIENTES");
        System.out.println("========================================");

        for (Paciente p : hospital.getListaPacientes()) {
            System.out.println("\n  " + p);

            System.out.println("  Exámenes realizados:");
            for (Examen e : p.getHistorialExamenes()) {
                System.out.println("    → " + e);
            }

            System.out.println("  Tratamientos:");
            for (Tratamiento t : p.getHistorialTratamientos()) {
                System.out.printf("    → %s | Eficacia estimada: %.1f%%%n",
                        t, t.calcularEficacia() * 100);
            }
        }

        // ── Estadísticas generales ──────────────────────────────────────
        hospital.mostrarEstadisticasCancer();
        hospital.mostrarEstadisticasEstado();
    }
}
