package pack;

public class Proyecto {
    private String titulo;
    private String resumen;
    private String propuesta;
    private int duracion; //max 12 meses
    private String equipo;
    private Integer presupuesto; //max 30 millones
    private String estado;

    public Proyecto(String titulo, String resumen, String propuesta, int duracion, String equipo, int presupuesto, String estado) {
        this.titulo = titulo;
        this.resumen = resumen;
        this.propuesta = propuesta;
        this.duracion = duracion;
        this.equipo = equipo;
        this.presupuesto = presupuesto;
        this.estado = estado;
    }



    public void comprobarDuracion(){
        //
    }

    public void comprobarPresupuesto(){
        //
    }

    public void comprobarEstado(){
        //
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getResumen() {
        return resumen;
    }

    public void setResumen(String resumen) {
        this.resumen = resumen;
    }

    public String getPropuesta() {
        return propuesta;
    }

    public void setPropuesta(String propuesta) {
        this.propuesta = propuesta;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    public Integer getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(Integer presupuesto) {
        this.presupuesto = presupuesto;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
