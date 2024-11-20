package task1;

import java.util.ArrayList;
import java.util.List;

public class test {
    public static void main(String[] args) {
        // Creăm o listă care stochează numere întregi
        List<Integer> numere = new ArrayList<>();

        // Adăugăm elemente în listă
        numere.add(10);
        numere.add(20);
        numere.add(30);

        System.out.println("Lista inițială: " + numere);

        numere.add(2,56);

        // Iterăm prin listă și afișăm elementele
        for (Integer numar : numere) {
            System.out.println("Număr: " + numar);
        }
    }
}
