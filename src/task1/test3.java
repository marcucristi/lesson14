package task1;

import java.util.ArrayList;
import java.util.List;

public class test3 {
    public static void main(String[] args) {
        // Creăm o listă de nume
        List<String> nume = new ArrayList<>();

        // Adăugăm elemente în listă
        nume.add("Maria");
        nume.add("Ion");
        nume.add("Elena");
        System.out.println("Lista inițială: " + nume);

        // Inserăm un element la un anumit index
        nume.add(1, "Andrei");
        System.out.println("După inserare: " + nume);

        // Accesăm un element prin index
        String numeLaIndex2 = nume.get(2);
        System.out.println("Element la index 2: " + numeLaIndex2);


        // Modificăm un element
        nume.set(2, "Cristina");
        System.out.println("După modificare: " + nume);

        // Ștergem un element după index
        nume.remove(3);
        System.out.println("După ștergere: " + nume);

        for (String numePersoana : nume) {
            System.out.println("Nume: " + numePersoana);
        }
    }
}
