import java.time.LocalDateTime;

public class TestaClinica {
    public static void main(String[] args) {
        Medico med = new Medico(1, "Dra. Ana", "Cardiologia");
        Paciente pac = new Paciente(10, "Laura", "123.456.789-00");

        // Registrando a consulta para 20/05/2026 às 14:30
        LocalDateTime dataConsulta = LocalDateTime.of(2026, 5, 20, 14, 30);
        Consulta minhaConsulta = new Consulta(dataConsulta, 250.00, med, pac);

        System.out.println("Consulta agendada com sucesso para " + dataConsulta);
    }
}