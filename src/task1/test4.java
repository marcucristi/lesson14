package task1;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class test4 {
    public static void main(String[] args) {
        // Creăm un Set de numere întregi
        Set<Integer> numere = new HashSet<>();   //  LinkedHashSet pentru ordinea de inserare

        // Adăugăm elemente
        numere.add(10);
        numere.add(20);
        numere.add(30);
        numere.add(20); // Element duplicat, va fi ignorat

        // Afișăm elementele din Set
        System.out.println("Elementele din Set: " + numere);

        // Verificăm dacă un element există
        System.out.println("Set-ul conține 20? " + numere.contains(20));

        // Ștergem un element
        numere.remove(10);
        System.out.println("După ștergerea lui 10: " + numere);

        // Iterăm prin Set folosind for-each
        for (Integer numar : numere) {
            System.out.println("Număr: " + numar);
        }

        // Creăm un TreeSet
        Set<String> cuvinte = new TreeSet<>();

        // Adăugăm elemente
        cuvinte.add("Măr");
        cuvinte.add("Banana");
        cuvinte.add("Portocală");

        // Afișăm elementele sortate
        System.out.println("Cuvintele sortate: " + cuvinte);



    }
}
