import java.util.Scanner;
public class fitprogym {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su nombre: ");
        String nombre = sc.nextLine();
        System.out.println("Ingrese su edad: ");
        int edad = sc.nextInt();
        System.out.println("Ingrese su altura: ");
        double altura = sc.nextDouble();
        System.out.println("Ingrese su peso: ");
        double peso = sc.nextDouble();
        System.out.println("Elija un plan: \n 1. Basico = 80.0, 2. Plus = 120.0, 3. Premium = 180.0");
        int plan = sc.nextInt();
        while (plan>3 || plan<1){
            System.out.println("Plan inválido, elije nuevamente: \n 1. Basico = 80.0, 2. Plus = 120.0, 3. Premium = 180.0");
            plan = sc.nextInt();
        }

    }
}
