package task1;

import java.util.HashMap;
import java.util.Map;

public class test5 {

    public static void main(String[] args) {
        // Creăm un HashMap pentru stocarea numelor și vârstelor
        Map<String, Integer> varste = new HashMap<>();

        // Adăugăm perechi cheie-valoare
        varste.put("Maria", 25);
        varste.put("Ion", 30);
        varste.put("Elena", 22);

        // Accesăm valoarea pentru o cheie
        System.out.println("Vârsta Mariei: " + varste.get("Maria"));

        // Verificăm dacă o cheie există
        System.out.println("Map-ul conține pe Ion? " + varste.containsKey("Ion"));

        // Iterăm prin chei și valori
        for (Map.Entry<String, Integer> entry : varste.entrySet()) {
            System.out.println(entry.getKey() + " are vârsta de " + entry.getValue());
        }

        // Ștergem o pereche
        varste.remove("Ion");
        System.out.println("După ștergerea lui Ion: " + varste);
    }

}
