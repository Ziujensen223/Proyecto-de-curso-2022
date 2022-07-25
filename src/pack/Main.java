package pack;

import java.io.*;
import java.util.*;



public class Main {

    public static void main(String[] args) {

        //Lista de Proyectos(Entrada)
        List<Proyecto> proye = new ArrayList<Proyecto>();
        Proyecto p1 = new Proyecto( "Mineria ", " Mineria no contaminante ", " Utilizar algo ", 6,
                            " Academicos, Memoristas, Practicantes, Presonal adminstrativo ", 25, " Aprobado " );

        Proyecto p2 = new Proyecto( "Futbol ", " Mejores Condiciones para Jugar ", " Invertir en mejores Canchas ,etc ", 11,
                            " Academicos, Memoristas, Practicantes, Personal administrativo ", 23, " Aprobado " );

        Proyecto p3 = new Proyecto( "Tenis ", " Mayor Oportunidad para todos ", " Construir mas canchas , etc ", 8,
                            " Academicos, Memoristas, Practicantes ", 30, " Rechazado" );

        Proyecto p4 = new Proyecto( "Mas computadores ", " Mejores Computadores ", " Invertir en mejores Pc ", 12,
                            " Memoristas, Practicantes, Personal administrativo ", 30, " Aprobado " );

        Proyecto p5 = new Proyecto("Working holiday ", " Oportunidad de trabajar en el extranjero "," Invertir en viajes y opciones de trabajo ",8,
                            " Academicos, Memoristas, Practicantes, Presonal adminstrativo ",25," Rechazado ");

        //Agregar los proyectos
        proye.add( p1 );
        proye.add( p2 );
        proye.add( p3 );
        proye.add( p4 );
        proye.add( p5 );

        //Imprimir los proyectos(Salida)
        System.out.println( p1.getTitulo() + p1.getResumen() + p1.getPropuesta() + p1.getDuracion() + p1.getEquipo() + p1.getPresupuesto() + p1.getEstado() );
        System.out.println( p2.getTitulo() + p2.getResumen() + p2.getPropuesta() + p2.getDuracion() + p2.getEquipo() + p2.getPresupuesto() + p2.getEstado() );
        System.out.println( p3.getTitulo() + p3.getResumen() + p3.getPropuesta() + p3.getDuracion() + p3.getEquipo() + p3.getPresupuesto() + p3.getEstado() );
        System.out.println( p4.getTitulo() + p4.getResumen() + p4.getPropuesta() + p4.getDuracion() + p4.getEquipo() + p4.getPresupuesto() + p4.getEstado() );
        System.out.println( p5.getTitulo() + p5.getResumen() + p5.getPropuesta() + p5.getDuracion() + p5.getEquipo() + p5.getPresupuesto() + p5.getEstado() );


        //Validar Archivos Aprobados y Rechazados//
        try {
            File archivo = new File( "Archivos Aprobados.txt" );
            boolean fileCreate = archivo.createNewFile();
            FileWriter archivosAprobados = new FileWriter(archivo);
            archivosAprobados.write("---------- PROYECTOS APROBADOS ----------"+ "\n");
            archivosAprobados.write(p1.getTitulo() + p1.getResumen() + p1.getPropuesta() + p1.getDuracion() + p1.getEquipo() + p1.getPresupuesto() + p1.getEstado() + "\n");
            archivosAprobados.write(p2.getTitulo() + p2.getResumen() + p2.getPropuesta() + p2.getDuracion() + p2.getEquipo() + p2.getPresupuesto() + p2.getEstado()+ "\n");
            archivosAprobados.write(p4.getTitulo() + p4.getResumen() + p4.getPropuesta() + p4.getDuracion() + p4.getEquipo() + p4.getPresupuesto() + p4.getEstado()+ "\n");
            archivosAprobados.close();
            if (fileCreate){
                System.out.println("Archivo creado correctamente");
            }else{
                System.out.println("El archivo ya existe");
            }
        } catch (IOException e){
            System.out.println("Excepcion al crear el archivo" + e);
        }

        try {
            FileWriter archivosRechazados= new FileWriter( "Archivos Rechazados.txt" );
            archivosRechazados.write("---------- PROYECTOS RECHAZADOS ----------"+ "\n");
            archivosRechazados.write( p3.getTitulo()+ p3.getResumen() + p3.getPropuesta() + p3.getDuracion() + p3.getEquipo() + p3.getPresupuesto() + p3.getEstado() + "\n");
            archivosRechazados.write(p5.getTitulo() + p5.getResumen() + p5.getPropuesta() + p5.getDuracion() + p5.getEquipo() + p5.getPresupuesto() + p5.getEstado() + "\n");
            archivosRechazados.close();
        } catch (IOException e) {
            System.out.println("Excepcion al crear el archivo" + e);
        }





    }
}

