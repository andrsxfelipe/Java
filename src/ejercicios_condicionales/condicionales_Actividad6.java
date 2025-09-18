package ejercicios_condicionales;/*
Pide al usuario su edad y muestra:
    "Niño" si tiene menos de 12.
    "Adolescente" si tiene entre 12 y 17.
    "Adulto" si tiene 18 o más.
 */
import java.util.Scanner;
public class condicionales_Actividad6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese su edad: ");
        int edad = sc.nextInt();
        if (edad<12){
            System.out.println("Niño");
        } else if (edad>=18){
            System.out.println("Adulto");
        } else {
            System.out.println("Adolescente");
        }
    }
}
