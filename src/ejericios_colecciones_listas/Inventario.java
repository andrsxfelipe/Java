package ejericios_colecciones_listas;

import javax.swing.*;
import java.util.ArrayList;
import java.util.HashMap;

public class Inventario {
    public static void main(String[] args){
        ArrayList<String> pductos = new ArrayList<>();
        ArrayList<Double> preciosPductos = new ArrayList<>();
        HashMap<String, Integer> inventario = new HashMap<>();

        boolean salir = false;
        JOptionPane.showMessageDialog(null,"Bienvenido al Sistema de Gestión de colecciones_listas.Inventario.");
        while(!salir){
            String[] opciones = {"Agregar Producto", "Listar colecciones_listas.Inventario","Comprar Producto","Estadísticas","Buscar Producto","Salir"};
            int opcion = JOptionPane.showOptionDialog(
                    null,
                    "Seleccione una opción",
                    "Menu Principal",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.INFORMATION_MESSAGE,
                    null,
                    opciones,
                    opciones[0]
            );
            switch (opcion){
                case 0:
                    String newProduct = JOptionPane.showInputDialog("Ingrese el nombre del producto");
                    String newProductPrice = JOptionPane.showInputDialog("Ingrese el precio del producto");
                    String newProductStock = JOptionPane.showInputDialog("Ingrese la cantidad del producto");

                    try{
                        double productPrice = Double.parseDouble(newProductPrice);
                        int productStock = Integer.parseInt(newProductStock);
                        if (productPrice>0 && productStock>0){
                            pductos.add(newProduct);
                            preciosPductos.add(productPrice);
                            inventario.put(newProduct,productStock);
                        }
                        else {
                            JOptionPane.showMessageDialog(null,"El stock y el precio deben ser enteros positivos.");
                        }
                    } catch (NumberFormatException e){
                        JOptionPane.showMessageDialog(null,"El precio y el stock deben ser números enteros positivos");
                    }
                    break;
                case 1:
                    String listaPductos = "";
                    for(int i=0; i<pductos.size();i++){
                        listaPductos += "- "+pductos.get(i)+" ($"+preciosPductos.get(i)+")"+" Disponible: "+inventario.get(pductos.get(i))+"\n";
                    }
                    JOptionPane.showMessageDialog(null,listaPductos);
                    break;
                case 2:
                    Object[] pductosComprar = pductos.toArray();

                    int comprar = JOptionPane.showOptionDialog(
                      null,
                      "¿Qué producto desea comprar?",
                      "Comprar producto",
                      JOptionPane.DEFAULT_OPTION,
                      JOptionPane.INFORMATION_MESSAGE,
                      null,
                      pductosComprar,
                      pductosComprar[0]
                    );
                    String cantStr = JOptionPane.showInputDialog("¿Cuántos desea comprar? El stock actual es de "+pductos.get(comprar));
                    try {
                        int cant = Integer.parseInt(cantStr);
                        String pductoAComprar = pductos.get(comprar);
                        int cantActual = inventario.get(pductoAComprar);

                        if (cant>cantActual){
                            JOptionPane.showMessageDialog(null,"La cantidad debe ser un valor menor o igual que el stock.");
                        } else {
                            inventario.put(pductoAComprar,cantActual-cant);
                            JOptionPane.showMessageDialog(null,"Producto comprado.");
                        }
                    } catch (NumberFormatException e){
                        JOptionPane.showMessageDialog(null,"La cantidad debe ser un número válido");
                    }
                    break;
                case 3:
                    double menorPrice = preciosPductos.getFirst();
                    double maxPrice = 0;
                    for (int i=0;i<preciosPductos.size();i++){
                        double precio = preciosPductos.get(i);
                        if (precio>maxPrice){
                            maxPrice = precio;
                        }
                        if (precio < menorPrice){
                            menorPrice = precio;
                        }
                    }
                    int minPriceIndex = preciosPductos.indexOf(menorPrice);
                    int maxPriceIndex = preciosPductos.indexOf(maxPrice);
                    JOptionPane.showMessageDialog(null, "Producto con menor precio: "+
                            pductos.get(minPriceIndex)+" ($ "+preciosPductos.get(minPriceIndex)+")"+
                            "\nProducto con mayor precio: "+pductos.get(maxPriceIndex)+" $( "+preciosPductos.get(maxPriceIndex));
                    break;
                case 4:
                    String buscarPducto = JOptionPane.showInputDialog("Ingrese el nombre del producto.");
                    int pos = pductos.indexOf(buscarPducto);
                    if (pos != -1){
                        JOptionPane.showMessageDialog(null,pductos.get(pos)+" → $"+preciosPductos.get(pos));
                    }
                    break;
                case 5:
                    int confirmar = JOptionPane.showConfirmDialog(
                            null,
                            "¿Desea salir?",
                            "Confirmar salida",
                            JOptionPane.YES_NO_OPTION
                    );
                    if (confirmar == JOptionPane.YES_OPTION){
                        salir = true;
                        JOptionPane.showMessageDialog(null,"Gracias por utilizar el sistema de gestión de inventario.");
                        break;
                    }
            }
        }
    }
}
