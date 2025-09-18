package ejercicios_condicionales;/*Haz un programa que reciba un número entero e imprima:
        "Es positivo" si el número es mayor que 0.
        "Es negativo" si es menor que 0.
        "Es cero" si es exactamente 0.
 */
import java.util.Scanner;
public class condicionales_Actividad5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int num = sc.nextInt();
        if (num>0){
            System.out.println("Es positivo");
        } else if (num<0){
            System.out.println("Es negativo");
        } else {
            System.out.println("Es cero");
        }
    }
}
