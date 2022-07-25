package pack;

public abstract class Academico {
    private String nombre;
    private String rol;

    public Academico(String nombre, String rol) {
        this.nombre = nombre;
        this.rol = rol;
    }
    public abstract boolean verificadorHora(); //para verificar no sean ni menor ni mayor a las horas requeridas

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
