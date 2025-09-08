/*
Pide dos números enteros y verifica con operadores lógicos si:
    Ambos son positivos (&&).
    Al menos uno es mayor que 100 (||).
    El primero no es igual al segundo (!).
 */
import java.util.Scanner;
public class Operadores_Actividad4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el numero 1: ");
        int num1 = sc.nextInt();
        System.out.print("Ingrese el número 2: ");
        int num2 = sc.nextInt();
        boolean sonPositivos = (num1>0 && num2>0);
        boolean mayorQueCien = (num1>100 || num2>100);
        boolean sonDiferentes = (num1 != num2);
        if (sonPositivos){
            System.out.println("Ambos son positivos");
        }
        else{
            System.out.println("Uno o ambos es negativo");
        }
        if (mayorQueCien) {
            System.out.println("Al menos uno es mayor que cien");
        }else{
            System.out.println("Ninguno de los números es mayor que cien");
        }
        if (sonDiferentes){
            System.out.println("Los números son diferentes");
        } else {
            System.out.println("Los números son iguales");
        }
    }
}