package ejercicios_basicos;

import java.util.Scanner;
public class fitprogym {
    public static void main(String[] args){
        double[] planes = {80,120,180};
        String[] planesStr = {"Basico","Plus","Premium"};
        double desc = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su nombre: ");
        String nombre = sc.nextLine();
        System.out.println("Ingrese su edad: ");
        int edad = sc.nextInt();
        sc.nextLine();
        if (edad>=16 && edad<=25){
            desc += 10;
        }
        System.out.println("Ingrese su altura: ");
        double altura = sc.nextDouble();
        sc.nextLine();
        System.out.println("Ingrese su peso: ");
        double peso = sc.nextDouble();
        sc.nextLine();
        System.out.println("Elija un plan: \n 1. Basico = 80.0, 2. Plus = 120.0, 3. Premium = 180.0");
        int plan = sc.nextInt()-1;
        sc.nextLine();
        while (plan>3 || plan<1){
            System.out.println("Plan inválido, elije nuevamente: \n 1. Basico = 80.0, 2. Plus = 120.0, 3. Premium = 180.0");
            plan = sc.nextInt();
            sc.nextLine();
        }
        System.out.println("¿Es la primera vez con nostros? Escribe yes si sí: ");
        String primeraVez = sc.nextLine();
        if (primeraVez.equals("yes")) {
            desc += 10;
        }
        double bmi = peso/(altura*altura);
        double desc_aplicado = planes[plan]-(planes[plan]*(desc/100));
        if (edad<14){
            System.out.println("Usuario no elegible.");
        } else if (edad<18) {
            System.out.println("Requiere autorización del acudiente.");
        }
        System.out.printf("Nombre: %s , Plan elegido: %s , Precio base: %s , Descuento: -%.1f%% , Precio final: %.2f",
                nombre, planesStr[plan],planes[plan],desc,desc_aplicado);
    }
}
