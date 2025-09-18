package ejercicios_basicos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class bucles {
    public static void bucle_for(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el tamaño de su arbol");
        int rows = sc.nextInt();
        for (int i=1; i<=rows;i++){
            for (int k=rows-i; k>0; k--){
                System.out.print(" ");
            }
            for (int j=0; j<((2*i)-1);j++){
                System.out.print("*");
            }

            System.out.print("\n");
        }
        sc.close();
    }

    public static void bucle_for2(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el tamaño de su arbol: ");
        int num = sc.nextInt();
        sc.nextLine();
        for (int i=0;i<num;i++){
            System.out.print(" ".repeat(num-(i+1)));
            System.out.print("*".repeat((2*(i+1))-1));
            System.out.print("\n");
        }
    }

    public static void bucle_while(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int num = sc.nextInt();
        int i = String.valueOf(num).length();
        String inverso = "";
        while(i>0){
            inverso+=String.valueOf(num).charAt(i-1);
            i--;
        }
        System.out.println("Inverso: "+inverso);
        if (inverso.equals(String.valueOf(num))) {
            System.out.println("Es capicua.");
        } else {
            System.out.println("No es capicua.");
        }
    }

    public static void bucles_dowhile(){
        Scanner sc = new Scanner(System.in);
        int num = (int) (Math.random()*100);
        int adivinado;
        do {
            System.out.print("Ingrese un numero: ");
            adivinado = sc.nextInt();
            if ((adivinado-num)<5 && (adivinado-num)>-5 && (adivinado!=num)){
                System.out.println("Estas muy cerca!");
            }
        } while(adivinado != num);
    }

    public static void bucles_foreach(){
        ArrayList<String> palabras = new ArrayList<>();
        HashMap<String, Integer> cantPalabras = new HashMap<>();
        palabras.add("Hola1");
        palabras.add("Hola2");
        palabras.add("Hola3");
        palabras.add("Hola2");
        palabras.add("Hola1");
        for (String i : palabras){
            int cont = 0;
            for (String j: palabras){
                if (i == j){
                    cont+=1;
                }
            }
            cantPalabras.put(i, cont);
        }
        for(var i : cantPalabras.entrySet()){
            System.out.println(i.getKey()+" se repite "+i.getValue()+" veces.");
        }
    }
    public static void main(String[] args){
        //bucle_while();
        //bucles_dowhile();
        //bucles_foreach();
        bucle_for2();
    }
}
