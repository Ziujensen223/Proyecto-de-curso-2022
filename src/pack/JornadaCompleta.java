package pack;

public class JornadaCompleta extends Academico{
    //jornada completa = 44 horas semanales (1/4 a clases)
    //private static Integer horasSemanales = 44;
    private static Integer horasClase; //min 11 horas a la semana


    public JornadaCompleta(String nombre, String rol, Integer horasClases) {
        super(nombre, rol);
        this.horasClase = horasClase;
    }

    @Override
    public boolean verificadorHora() {
        return false;
    }

    public static Integer getHorasClases() {
        return horasClase;
    }

    public static void setHorasClases(Integer horasClases) {
        JornadaCompleta.horasClase = horasClases;
    }
}
