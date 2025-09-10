import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
public class taller_bucles {
    public static void puntoArrays(){
        Scanner sc = new Scanner(System.in);
        int[] array = {1,3,5,7,9};
        for (int i: array){
            System.out.println("Doble: "+i*2);
        }
        int[] userArray = new int[6];
        for (int i=0; i<userArray.length; i++){
            System.out.print("Ingre el dígito #"+(i+1)+": ");
            userArray[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(userArray));
    }

    public static void puntoArrayList(){
        ArrayList<String> compas = new ArrayList<>();
        compas.add("Yoan");
        compas.add("Pablo");
        compas.add("Dawinson");
        compas.add("Duque");

        for (String i : compas){
            System.out.println("Hola, "+i);
        }
    }

    public static void puntoHashMap(){
        HashMap<Integer, String> clientes = new HashMap<>();
        clientes.put(1000291777, "Felipe");
        clientes.put(123456, "Yohan");
        clientes.put(1000542697, "Pabo");
        for (var i: clientes.entrySet()){
            System.out.println("Documento: "+i.getKey()+"->"+" Nombre: "+i.getValue());
        }
    }

    public static void bucles_factorial(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero al que le quiere calcular el factorial: ");
        int num = sc.nextInt();
        int acum = 1;
        for (int i=1; i<=num; i++){
            acum *= i;
        }
        System.out.println(acum);
    }

    public static void bucles_friocaliente(){
        Scanner sc = new Scanner(System.in);
        int num = (int) (Math.random()*100);
        int user_num;
        int intentos = 0;
        do {
            System.out.print("Adivina el número: ");
            user_num = sc.nextInt();
            if (user_num == num) {
                System.out.println("Adivinaste!");
            } else if (user_num>num) {
                System.out.println("Intenta un numero más pequeño");
            } else {
                System.out.println("Intenta un número mayor");
            }
            intentos +=1;
            System.out.println("Intentos: "+intentos);
        } while (user_num != num && intentos<10);
    }

    public static void bucles_hastacero(){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();
        int num;
        do{
            System.out.print("Ingrese un número, 0 para dejar de introducir: ");
            num = sc.nextInt();
            if (num != 0){
                numeros.add(num);
            }
        } while (num!=0);
        int suma = 0;
        for (int numero:numeros){
            suma+=numero;
        }
        System.out.println("Suma: "+suma);
        System.out.println(numeros.size());
        double media = (double) suma/numeros.size();
        System.out.println("Media: "+media);
    }
    public static void punto4(){
        Scanner sc = new Scanner(System.in);
        int ceros = 0;
        int mayores = 0;
        int menores = 0;
        for (int i=0; i<=10; i++){
            System.out.print("Ingrese un numero: ");
            int num = sc.nextInt();
            if (num>0){
                mayores+=1;
            } else if (num<0){
                menores+=1;
            } else {
                ceros+=1;
            }
        }
        System.out.printf("Numeros mayores a 0: %d, menores a 0: %d, iguales a 0: %d",mayores,menores,ceros);
    }
    public static void punto5(){
        Scanner sc = new Scanner(System.in);
        String vocales = "aeiouAEIOU";
        System.out.print("Ingrese un caracter: ");
        String caracter = sc.nextLine();
        if (vocales.contains(caracter)){
            System.out.println("VOCAL");
        } else {
            System.out.println("NO VOCAL");
        }
    }
    public static void punto6(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el numero 1: ");
        int num1 = sc.nextInt();
        System.out.print("Ingrese el numero 2: ");
        int num2 = sc.nextInt();
        if (num2<=num1){
            System.out.println("El número 2 debe ser mayor que el 1");
            return;
        }
        for (int i=num1; i<=num2; i++){
            if (i%2==0){
                System.out.println(i);
            }
        }
    }

    public static void tabla_multiplicar(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número para ver su tabla de multiplicar: ");
        int num = sc.nextInt();
        for (int i=1; i<10; i++){
            System.out.println(num+"x"+i+" = "+num*i);
        }
    }

    public static void punto8(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el limite inferior: ");
        int inf = sc.nextInt();
        System.out.print("Ingrese el límite superior: ");
        int sup = sc.nextInt();
        int sum = 0;
        int fuera = 0;
        boolean dentro = false;
        while (inf>=sup){
            System.out.println("El inferior debe ser menor que el superior");
            System.out.print("Ingrese el límite inferior: ");
            inf = sc.nextInt();
            System.out.print("Ingrese el límite superior: ");
            sup = sc.nextInt();
        }

        System.out.print("Ingrese números: ");
        int num = sc.nextInt();
        while (num != 0){
            if (num>inf && num<sup){
                sum += num;
            } else if (num==inf || num == sup){
                dentro = true;
            } else {
                fuera += 1;
            }
            System.out.print("Ingrese números: ");
            num = sc.nextInt();
        }

        System.out.printf("Suma de los numeros dentro del intervalo: %d, números insertados fuera del intervalo: %d, hubo números en los límites?: %s",
                sum, fuera, dentro ? "Sí":"No");

    }
    public static void punto9(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número base (real): ");
        double base = sc.nextDouble();
        System.out.print("Ingrese un el exponente (entero positivo): ");
        int exp = sc.nextInt();
        if (exp <=0){
            System.out.println("El exponente debe ser entero positivo.");
            return;
        }
        double result = base;
        for (int i=1; i<exp; i++){
            result *= base;
        }
        System.out.printf("Resultado: %.2f", result);
    }
    public static void punto10(){
        for (int i=1; i<=5; i++){
            for (int j=1; j<10; j++){
                System.out.printf("%d x %d = %d\n",i,j,i*j);
            }
        }
    }
    public static void bucle(){
        for (int i=10; i>=0; i--){
            System.out.println(i);
        }
    }


    public static void main(String[] args){
        //puntoArrays();
        //puntoArrayList();
        //puntoHashMap();
        //bucles_factorial();
        //bucles_friocaliente();
        //bucles_hastacero();
        //punto4();
        //punto5();
        //punto6();
        //tabla_multiplicar();
        //punto8();
        //punto9();
        //punto10();
        bucle();
    }
}
