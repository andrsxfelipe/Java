import java.util.Scanner;

class Cuenta{
    private double saldo;

    public Cuenta(double saldoInicial){
        this.saldo = saldoInicial;
    }

    public void consultarSaldo(){
        System.out.println("Saldo actual: $"+saldo);
    }

    public void depositar(double monto){
        saldo += monto;
        System.out.println("Saldo despositado, nuevo saldo: "+saldo);
    }

    public void retirar(double monto){
        if (monto<=saldo){
            saldo -= monto;
            System.out.println("Monto retirado, nuevo saldo: "+saldo);
        } else {
            System.out.println("Monto insuficiente, su saldo: "+saldo);
        }
    }
}

public class cajero {
    public static void main(String[] args){
        Cuenta cuenta = new Cuenta(1000000);
        Scanner sc = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("1. Consultar saldo");
            System.out.println("2. Depositar dinero");
            System.out.println("3. Retirar dinero");
            System.out.println("4. Salir");
            System.out.print("Ingrese una opción: ");
            opcion = sc.nextInt();
            switch (opcion){
                case 1:
                    cuenta.consultarSaldo();
                    break;
                case 2:
                    System.out.print("Monto a depositar: ");
                    double deposito = sc.nextDouble();
                    cuenta.depositar(deposito);
                    break;
                case 3:
                    System.out.print("Monto a retirar: ");
                    double retiro = sc.nextDouble();
                    cuenta.retirar(retiro);
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida, intente de nuevo");
            }
        } while (opcion != 4);
    }
}