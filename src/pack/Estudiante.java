package pack;

public abstract class Estudiante{
    private String nombre;
    private String rol;

    public Estudiante(String nombre, String rol) {
        this.nombre = nombre;
        this.rol = rol;
    }

    public abstract void duracionEnProyecto(); //pueden participar cantidad de meses inferior a la del proyecto
    public abstract void dedicacionHora();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
}
