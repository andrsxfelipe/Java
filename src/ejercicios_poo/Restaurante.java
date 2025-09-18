package ejercicios_poo;

import java.util.ArrayList;
import java.util.Scanner;

class Plato{
    private String nombre;
    private double precio;

    public Plato(String nombre, double precio){
        this.nombre = nombre;
        this.precio = precio;
    }

    public double getPrecio(){
        return precio;
    }

    public void mostrarMenu(){
        System.out.println("- "+nombre+" -> "+precio);
    }

    @Override
    public String toString(){
        return (nombre+" ($ "+precio+")");
    }
}

class Mesa{
    private ArrayList<Plato> pedidos = new ArrayList<>();

    public void agregarPedido(Plato p){
        pedidos.add(p);
        System.out.println("ejercicios_poo.Plato agregado a la mesa: "+p);
    }

    public void mostrarCuenta(){
        System.out.println("---------------------------------------------------");
        double total = 0;
        for (Plato p : pedidos){
            System.out.println(p);
            total += p.getPrecio();
        }
        System.out.println("Total: $"+total);
        System.out.println("---------------------------------------------------");

    }
}

public class Restaurante {
    public static void main(String[] args){
        // 1.Pechuga a la plancha(14000), 2. Bandeja paisa (14500), 3. Menu del dia(15500), 4. Jugo de mora(4000), 5. Guarapo(3500), 6. Claro(3000)
        Scanner sc = new Scanner(System.in);
        ArrayList<Plato> menu = new ArrayList<>();
        menu.add(new Plato("Pechuga a la plancha",14000));
        menu.add(new Plato("Bandeja paisa",14500));
        menu.add(new Plato("Menú del día",15500));
        menu.add(new Plato("Jugo de mora",4000));
        menu.add(new Plato("Guarapo",3500));
        menu.add(new Plato("Claro",3000));
        int opcion;

        ArrayList<Mesa> mesas = new ArrayList<>();
        mesas.add(new Mesa());
        mesas.add(new Mesa());
        do{
            System.out.print("¿Que quieres hacer?\n1. Mostrar menu,\n2. Agregar un plato,\n3. Agregar plato a una mesa,\n4. Mostrar cuenta de una mesa,\n5. Salir\n");
            opcion = sc.nextInt();
            sc.nextLine();
            switch (opcion){
                case 1:
                    for (int i=0; i<menu.size(); i++){
                        menu.get(i).mostrarMenu();
                    }
                    break;
                case 2:
                    System.out.print("Ingrese el nombre del plato: ");
                    String nombre = sc.nextLine();
                    System.out.print("Ingrese el precio: ");
                    double precio = sc.nextDouble();
                    sc.nextLine();
                    // Tener cuidado porque si se agrega el nombre y hay un error agregando el precio, se creara plato sin precio
                    menu.add(new Plato(nombre, precio));
                    break;
                case 3:
                    System.out.print("¿A qué mesa va el plato? ");
                    for (int i=0; i<mesas.size();i++){
                        System.out.print(i+1+" | ");
                    }
                    int mesa = (sc.nextInt())-1;
                    sc.nextLine();
                    System.out.println("¿Qué producto desea agregar? ");
                    for (int i=0; i<menu.size(); i++){
                        System.out.println((i+1) +" "+ menu.get(i));
                    }
                    int plato = (sc.nextInt())-1;
                    sc.nextLine();
                    mesas.get(mesa).agregarPedido(menu.get(plato));
                    break;
                case 4:
                    System.out.print("¿De qué mesa necesitas la cuenta? ");
                    for (int i=0;i<mesas.size();i++){
                        System.out.print(" | "+(i+1)+" |");
                    }
                    System.out.println();
                    int mesaCuenta = (sc.nextInt())-1;
                    sc.nextLine();
                    mesas.get(mesaCuenta).mostrarCuenta();
                    break;
                case 5:
                    System.out.print("Hasta luego!");
                default:
                    System.out.println("Selecciona una opción válida.");
            }
        } while (opcion != 5);
    }
}
