package ejercicios_poo;

import java.util.Scanner;

class Libro{
    private String titulo;
    private String autor;
    private int anioPublicado;
    private boolean prestado = false;

    public Libro(String titulo, String autor, int anioPublicado){
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicado = anioPublicado;
    }

    public void prestar(String libro_prestar){
        if ((libro_prestar.equals(titulo)) && (!prestado)){
            prestado = true;
            System.out.println("ejercicios_poo.Libro "+titulo+" prestado.");
        }
    }
    public void devolver(String devolverLibro){
        if ((devolverLibro.equals(titulo)) && (prestado)) {
            prestado = false;
            System.out.println("ejercicios_poo.Libro " + titulo + " devuelvo. Vuelve a estar disponible.");
        }
    }
    public void mostrarInfo(){
        System.out.printf("- ejercicios_poo.Libro: %s, autor: %s, año de publicación: %s, disponible: %s\n", titulo, autor, anioPublicado, prestado ? "No":"Sí");
    }
}

public class Biblioteca {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Libro[] libros = new Libro[2];

        for (int i=0; i<libros.length;i++){
            System.out.print("Ingrese el titulo del libro "+(i+1)+": ");
            String titulo = sc.nextLine();
            System.out.print("Ingrese el autor: ");
            String autor = sc.nextLine();
            System.out.print("Ingres el año de publicación: ");
            int anioPublicado = sc.nextInt();
            sc.nextLine();

            libros[i] = new Libro(titulo, autor, anioPublicado);
        }
        int opcion;
        do {
            System.out.print("Bienvenido al sistema de gestión de libros. Seleccione una opción:\n1. Listar libros\n" +
                    "2. Prestar libro,\n3. Devolver un libro,\n4. Salir\n");
            opcion = sc.nextInt();
            sc.nextLine();
            switch (opcion){
                case 1:
                    for (int i=0; i< libros.length;i++){
                        libros[i].mostrarInfo();
                    }
                    break;
                case 2:
                    System.out.print("Ingrese el nombre del libro que desea prestar: ");
                    String prestarLibro = sc.nextLine();
                    for (int i = 0; i < libros.length; i++) {
                        libros[i].prestar(prestarLibro);
                    }
                    break;
                case 3:
                    System.out.print("Ingrese el título que desea devolver: ");
                    String devolverLibro = sc.nextLine();
                    for (int i=0;i<libros.length;i++){
                        libros[i].devolver(devolverLibro);
                    }
                    break;
                default:
                    System.out.println("Opción incorrecta, vuelve a intentar.");
            }
        } while (opcion != 4);
    }
}
