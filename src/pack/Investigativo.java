package pack;

public class Investigativo extends Proyecto{
    //(solo la pueden presentar los academicos) y ejerseran el rol de investigador responsable de proyecto
    //(se puede designar a otro participante en el rol de director de proyecto)
    //con la autorizacion del director de escuela - los investigadores pueden descontar horas de clases (mínimo de 3 horas semanales)

    //gastos:(se puede incluir 1 conferencia, junto a pasajes ida, regreso y viaticos diarios(max 5 dias))

    public Investigativo(String titulo, String resumen, String propuesta, int duracion, String equipo, int presupuesto, String estado) {
        super(titulo, resumen, propuesta, duracion, equipo, presupuesto, estado);
    }

    public void directorEscuela(){
        //
    }

    public void descuentoHora(){
        //
    }

    public void gastosExtras(){
        //variable en dias (max 5) comprobador
    }
}
