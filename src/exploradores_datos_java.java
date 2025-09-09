import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class CofreOrdenado{
    private int[] cofre;

    public CofreOrdenado(int[] cofre){
        this.cofre = cofre;
    }

    public void accederPrimero_Ultimo(){
        System.out.println("Primer valor: "+cofre[0]);
        System.out.println("Último valor: "+cofre[cofre.length-1]);
    }
    public void CambiarValorYMostrarlo(int nuevo_valor){
        cofre[2] = nuevo_valor;
        System.out.println("Valor cambiado, nuevo valor: "+cofre[2]);
    }
}

class MochilaMagica{
    ArrayList<String> mochila;

    public MochilaMagica(ArrayList<String> mochila){
        this.mochila = mochila;
    }

    public void obtenerSegundoObjeto(){
        System.out.println("Segundo objeto: "+mochila.get(1));
    }

    public void quitarObjeto(){
        mochila.remove(2);
        System.out.println("Objeto eliminado, mochila actualizada: "+mochila);
    }
}

class Mapa{
    private HashMap<String, Integer> objetos = new HashMap<>();

    public Mapa(HashMap<String, Integer> objetos){
        this.objetos = objetos;
    }

    public void mostrarDiamantes(String objeto){
        System.out.println("Número de "+objeto+": "+objetos.get(objeto));
    }
    public void modificarOro(String clave, int valor){
        objetos.replace(clave,valor);
        System.out.println("Objeto "+clave+" modificado, nuevo mapa: "+objetos);
    }
}

class Explorador{
    private int[] codigos;
    private ArrayList<String> exploradores;
    private HashMap<String, Integer> oro_exploradores = new HashMap<>();
    private int[] cantOro;

    public Explorador(int[] codigos, ArrayList<String> exploradores, int[] cantOro){
        this.codigos = codigos;
        this. exploradores = exploradores;
        this.cantOro = cantOro;
    }

    public void asignarOro(){
        for (int i=0; i<exploradores.size(); i++){
            oro_exploradores.put(exploradores.get(i),cantOro[i]);
        }
        System.out.println("Oro de cada explorador: "+oro_exploradores);
    }

    public void obtenerExplorador(){
        int maxOro = 0;
        String explorador="";
        for (String clave: oro_exploradores.keySet()){
            if (oro_exploradores.get(clave)>maxOro){
                maxOro = oro_exploradores.get(clave);
                explorador = clave;
            }
        }
        System.out.println("Explorador con mas oro: "+explorador);
    }
}

public class exploradores_datos_java {
    public static void main(String[] args){
        System.out.println("Reto 1 --------------------------------------------\n");
        int[] numeros = {2,8,4,6,5};
        CofreOrdenado cofre = new CofreOrdenado(numeros);
        cofre.accederPrimero_Ultimo();
        cofre.CambiarValorYMostrarlo(10);

        System.out.println("\nReto 2 --------------------------------------------\n");

        ArrayList<String> objetos = new ArrayList<>();
        objetos.add("Espada");
        objetos.add("Elixir");
        objetos.add("Escudo");

        MochilaMagica mochila = new MochilaMagica(objetos);
        mochila.obtenerSegundoObjeto();
        mochila.quitarObjeto();

        System.out.println("\nReto 3 --------------------------------------------\n");

        HashMap<String, Integer> objetosMapa = new HashMap<>();
        objetosMapa.put("Oro",100);
        objetosMapa.put("Plata",50);
        objetosMapa.put("Diamantes",5);

        Mapa mapa = new Mapa(objetosMapa);
        mapa.mostrarDiamantes("Diamantes");
        mapa.modificarOro("Oro",99);

        System.out.println("\nReto final --------------------------------------------\n");

        int[] codigos = {666,420,123};

        ArrayList<String> exploradores = new ArrayList<>();
        exploradores.add("Pablo");
        exploradores.add("Ex-neider");
        exploradores.add("Andres");

        int[] oro = {15,20,50};

        Explorador explorador = new Explorador(codigos, exploradores, oro);
        explorador.asignarOro();
        explorador.obtenerExplorador();
    }
}
