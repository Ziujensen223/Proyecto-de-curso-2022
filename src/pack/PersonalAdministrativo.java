package pack;

public class PersonalAdministrativo {
    private String nombre;
    private static Integer horasSemanales = 44; //jornada completa = 44 horas
    private String rol;

    public PersonalAdministrativo(String nombre, String rol) {
        this.nombre = nombre;
        this.rol = rol;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static Integer getHorasSemanales() {
        return horasSemanales;
    }

    public static void setHorasSemanales(Integer horasSemanales) {
        PersonalAdministrativo.horasSemanales = horasSemanales;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
}
