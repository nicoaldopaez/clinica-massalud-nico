import java.time.LocalDate;
import java.time.LocalTime;
class Cita {
    private String paciente;
    private LocalDate fecha;
    private LocalTime hora;

    public Cita(String paciente, String fecha, LocalTime hora) {
        this.paciente = paciente;
        this.fecha = LocalDate.parse(fecha);
        this.hora = hora;
    }

    public String getPaciente() {
        return paciente;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public LocalTime getHora() {
        return hora;
    }
}
