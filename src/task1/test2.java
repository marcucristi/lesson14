package task1;

import java.util.ArrayList;
import java.util.Collection;

public class test2 {

    public static void main(String[] args) {
        // Creăm o colecție de tip ArrayList
        Collection<String> culori = new ArrayList<>();

        // Adăugăm elemente
        culori.add("Roșu");
        culori.add("Albastru");
        culori.add("Verde");

        // Afișăm dimensiunea colecției
        System.out.println("Dimensiunea colecției: " + culori.size());

        // Verificăm dacă un element există
        System.out.println("Colecția conține 'Roșu'? " + culori.contains("Roșu"));

        // Eliminăm un element
        culori.remove("Albastru");
        System.out.println("Colecția după eliminare: " + culori);

        // Iterăm prin colecție folosind for-each
        for (String culoare : culori) {
            System.out.println("Culoare: " + culoare);
        }

        // Golește colecția
        culori.clear();
        System.out.println("Colecția este goală? " + culori.isEmpty());
    }
}
