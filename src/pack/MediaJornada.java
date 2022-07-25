package pack;

public class MediaJornada extends Academico{
    //media jornada = 22 horas semanales (1/4 a clases)
    //private static Integer horasSemanales = 22;
    private static Integer horasClase; //min 5.5 horas a la semana

    public MediaJornada(String nombre, String rol, Integer horasClase) {
        super(nombre,
                rol);
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
        MediaJornada.horasClase = horasClases;
    }
}
