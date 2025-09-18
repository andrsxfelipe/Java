package ejercicios_basicos;

import java.util.ArrayList;

public class dia2 {
    public static void main(String[] args){
        ArrayList<String> nombres = new ArrayList<>();
        nombres.add("Felipe");
        nombres.add("Michael");
        nombres.add("Maicol");
        nombres.add("Pablo");
        nombres.add("Jose");
        for (int i=0; i<nombres.size();i++){
            System.out.printf("\nHola, %s",nombres.get(i));
        }
    }
}
