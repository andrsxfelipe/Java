import java.util.Scanner;

class Inscrito{
    private static final double[] PLANES = {80,120,180};
    private static final String[] PLANES_STR = {"Basico","Plus","Premium"};

    private String nombre;
    private int edad;
    private double altura;
    private double peso;
    private int plan;
    private boolean primeraVez;
    private double desc = 0;
    private double bmi;
    private String bmiCategoria;
    private double precioFinal;

    public Inscrito(String nombre,int edad,double altura,double peso,int plan,boolean primeraVez){
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
        this.peso = peso;
        this.plan = plan;
        this.primeraVez = primeraVez;
    }

    public void calcularDescuento(){
        if (primeraVez){
            desc += 10;
        }
        if (edad>=16 && edad<=25){
            desc += 10;
        }
        if (desc>20){
            desc = 20;
        }
    }

    public void aplicarDesc(){
        precioFinal = PLANES[plan] - (PLANES[plan]*(desc/100));
    }

    public void calcularBMI(){
        bmi = peso / (altura*altura);
        if (bmi<18.5){
            bmiCategoria = "Bajo peso";
        } else if (bmi>=18.5 && bmi<25) {
            bmiCategoria = "Normal";
        } else if (bmi>=25 && bmi<29){
            bmiCategoria = "Sobrepeso";
        } else {
            bmiCategoria = "Obesidad";
        }
    }

    public void mostrarInfo(){
        System.out.printf("\nNombre: %s, Plan elegido: %s, Precio base: %.1f, Descuentos: %.1f%%, Precio Final: %.1f, Categoría BMI: %s",
                nombre, PLANES_STR[plan], PLANES[plan], desc, precioFinal,bmiCategoria);
    }

}
public class fitprogym_POO {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese su nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Ingrese su edad: ");
        int edad = sc.nextInt();
        System.out.print("Ingrese su altura: ");
        double altura = sc.nextDouble();
        System.out.print("Ingrese su peso: ");
        double peso = sc.nextDouble();
        System.out.print("Elija un plan, Digite 1, 2 ó 3:\n1. Plan bàsico $80.0,\n2. Plan plus $120.0,\n3. Plan premium $180.0\n");
        int plan = sc.nextInt();
        System.out.print("¿Es un primera vez aquí? Digite 'yes' si sí: ");
        sc.nextLine();
        boolean primeraVez = (sc.nextLine().equals("yes"));

        Inscrito inscrito = new Inscrito(nombre, edad, altura, peso, plan, primeraVez);
        inscrito.calcularDescuento();
        inscrito.aplicarDesc();
        inscrito.calcularBMI();
        inscrito.mostrarInfo();
        sc.close();
    }
}
