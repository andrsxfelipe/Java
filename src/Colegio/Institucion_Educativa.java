package Colegio;

import java.util.ArrayList;
import java.util.Scanner;

class Persona{
    private String nombre;
    private int edad;
    public Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void mostrarInformacion(){
        System.out.println("Hola soy la persona "+nombre+" y tengo "+edad+" años.");
    }
}
class Alumno extends Persona{
    ArrayList<Asignatura> cursos = new ArrayList<>();
    public Alumno(String nombre, int edad){
        super(nombre, edad);
    }
    public void agregarAsignatura(Asignatura a){
        if (cursos.size()>=4){
            System.out.println("El alumno ya tiene 4 asignaturas asociadas.");
            return;
        }
        for (Asignatura curso : cursos){
            if (curso.getAsignatura().equalsIgnoreCase(a.getAsignatura())){
                System.out.println("La asignatura "+a.getAsignatura()+" ya está asignada al estudiante.");
                return;
            }
        }
        cursos.add(a);
        System.out.println("Asignatura "+a.getAsignatura()+" agregada con éxito.");
    }
    public void calcularPromedio(){
        double notas = 0;
        for (Asignatura curso : cursos){
            System.out.println(curso.getAsignatura()+": "+curso.getCalificacion());
            notas += curso.getCalificacion();
        }
        System.out.println("Promedio: "+(notas/cursos.size()));
    }
    @Override
    public void mostrarInformacion(){
        System.out.println("Nombre del alumno: "+getNombre()+" Edad: "+getEdad());
        System.out.println("--------------------------------------------------------");
        for (Asignatura curso : cursos){
            System.out.println(curso.getAsignatura()+", calificación: "+curso.getCalificacion()+
                    (curso.verificarAprobado() ? " Aprobado":" Reprobado"));
        }
    }
}

class Asignatura{
    private String asignatura;
    private double calificacion;
    public Asignatura(String asignatura, double calificacion){
        this.asignatura = asignatura;
        this.calificacion = calificacion;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public boolean verificarAprobado(){
        return (calificacion >=3.5);
    }
}

public class Institucion_Educativa {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Alumno> alumnos = new ArrayList<>();
        System.out.println("Por favor ingrese tres estudiantes: ");
        for (int i=0; i<3; i++) {
            System.out.println("Nombre del estudiante: ");
            String alumno = sc.nextLine();
            System.out.println("Edad del estudiante: ");
            int edad = sc.nextInt();
            sc.nextLine();
            alumnos.add(new Alumno(alumno,edad));
            for (int j=0; j<4; j++){
                System.out.println("Ingrese el nombre de la materia "+j+":");
                String asignatura = sc.nextLine();
                System.out.println("Ingrese la calificación del estudiante en esta materia: ");
                double calificacion = sc.nextDouble();
                sc.nextLine();
                alumnos.get(i).agregarAsignatura(new Asignatura(asignatura,calificacion));
            }
        }
        System.out.println("Info de cada alumno: ");
        for (Alumno alumno: alumnos){
            alumno.mostrarInformacion();
        }
    }
}
