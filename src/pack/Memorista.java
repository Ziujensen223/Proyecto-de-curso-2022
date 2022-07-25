package pack;

public class Memorista extends Estudiante{
    //máximo de 44 horas semanales para desempeñarse en proyectos
    //private static Integer maximoHoras = 44;
    private static Integer horasDedicadas; //dedicacion proyecto

    public Memorista(String nombre, String rol, Integer horasDedicadas) {
        super(nombre, rol);
        this.horasDedicadas = horasDedicadas;
    }

    @Override
    public void duracionEnProyecto() {

    }

    @Override
    public void dedicacionHora() {

    }

    public static Integer getHorasDedicadas() {
        return horasDedicadas;
    }

    public static void setHorasDedicadas(Integer horasDedicadas) {
        Memorista.horasDedicadas = horasDedicadas;
    }
}
