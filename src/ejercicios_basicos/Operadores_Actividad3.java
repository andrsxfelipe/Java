package ejercicios_basicos;/*
Pide al usuario su edad e imprime:
    true si es mayor o igual a 18.
    false si es menor.
 */
import java.util.Scanner;
public class Operadores_Actividad3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese su edad: ");
        int edad = sc.nextInt();
        boolean mayor = edad>=18;
        System.out.print(mayor);
    }
}
