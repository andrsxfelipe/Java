import java.util.Scanner;

class Estudiante{
    private String nombre;
    private int edad;
    private double nota;

    public Estudiante(String nombre, int edad, double nota){
        this.nombre = nombre;
        this.edad = edad;
        this.nota = nota;
    }

    public void mostrarInfo(){
        System.out.printf("Estudiante: %s, edad: %d, nota: %.2f\n",nombre, edad, nota);
    }
    public void cambiarNota(double nuevaNota){
        nota = nuevaNota;
        System.out.println("Nota modificada, nueva nota: "+ nota);
    }
    public boolean aprobo(){
        return nota>=3.0;
    }
}

public class Estudiantes {
    public static void main(String[] args){
        Estudiante estudiante1 = new Estudiante("Andres Londono", 23, 4.0);
        Scanner sc = new Scanner(System.in);
        int opcion;
        do{
            System.out.println("Bienvenido al sistema de gestión de estudiantes, elija una de las siguientes opciones: ");
            System.out.println("1. Mostrar información del estudiante");
            System.out.println("2. Cambiar nota");
            System.out.println("3. Verificar si aprobó");
            System.out.println("4. Salir");
            opcion = sc.nextInt();
            sc.nextLine();
            switch (opcion){
                case 1:
                    estudiante1.mostrarInfo();
                    break;
                case 2:
                    System.out.println("Ingrese la nueva nota: ");
                    double nuevaNota = sc.nextDouble();
                    sc.nextLine();
                    if (nuevaNota>5 || nuevaNota<0){
                        System.out.println("Ingrese una nota válida, entre 0 y 5.");
                    } else{
                        estudiante1.cambiarNota(nuevaNota);
                    }
                    break;
                case 3:
                    boolean aprobo = estudiante1.aprobo();
                    if (aprobo){
                        System.out.println("Estudiante aprobó.");
                    } else {
                        System.out.println("Estudiante reprobó.");
                    }
                    break;
                case 4:
                    System.out.println("Cerrando...");
                    break;
                default:
                    System.out.println("Elija una opción correcta.");
                    break;
            }
        } while (opcion != 4);
    }
}
