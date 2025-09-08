/*
Crea un programa que:
- Declare dos números enteros (a y b).
- Calcule y muestre: Suma, Resta, Multiplicación, División, Módulo.
*/
public class Operadores_Actividad2 {
    public static void main(String[] args){
        int num1 = 5;
        int num2 = 10;
        int suma = num1 + num2;
        int resta = num1 - num2;
        int multiplicacion = num1 * num2;
        //double division = num2/num1; // ESto está mal, hace la división como entero y luego lo convierte en doble
        double division = (double) num2/num1;
        int residuo = num2 % num1;
        int residuo2 = num1%num2;

        System.out.println("Suma: "+suma);
        System.out.println("Resta: "+resta);
        System.out.println("Multiplicación: "+multiplicacion);
        System.out.println("División: "+ division);
        System.out.println("Residuo: "+residuo);
        System.out.println("Segundo residuo: "+residuo2);
    }
}
