package ejercicios_poo;

import java.util.ArrayList;

class Plate {
    private String nombre;
    private double precio;

    public Plate(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return nombre + " ($" + precio + ")";
    }
}

class Table {
    private ArrayList<Plate> pedidos = new ArrayList<>();

    public void agregarPedido(Plate plato) {
        pedidos.add(plato);
        System.out.println("Se agregó a la mesa: " + plato.getNombre());
    }

    public void pedirCuenta() {
        double total = 0;
        System.out.println("\n--- ejercicios_poo.Cuenta de la mesa ---");
        for (Plate p : pedidos) {
            System.out.println(p);
            total += p.getPrecio();
        }
        System.out.println("Total a pagar: $" + total);
    }
}

public class Restaurante_ejemplo {
    public static void main(String[] args) {
        // menú predefinido
        Plate pizza = new Plate("Pizza", 25.0);
        Plate pasta = new Plate("Pasta", 18.0);
        Plate ensalada = new Plate("Ensalada", 12.0);

        Table mesa1 = new Table();
        mesa1.agregarPedido(pizza);
        mesa1.agregarPedido(pasta);
        mesa1.agregarPedido(ensalada);

        mesa1.pedirCuenta();
    }
}
