/*
Crea un programa que pida un número del 1 al 7 y muestre el día de la semana:
    1 → Lunes
    2 → Martes
    3 → Miércoles
    …
    7 → Domingo
 */
import java.util.Scanner;
public class condicionales_Actividad7 {
    public static void main(String[] args){
        try {
            Scanner sc = new Scanner(System.in);
            String[] dias = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sabado", "Domingo"};
            System.out.print("Ingrese el número del día de la semana: ");
            int num = sc.nextInt();
            System.out.println(dias[num - 1]);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Ingrese un valor entre 1 y 7");
        }
    }
}
