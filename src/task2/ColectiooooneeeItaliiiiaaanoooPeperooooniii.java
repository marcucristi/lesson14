package task2;

import java.util.*;

public class ColectiooooneeeItaliiiiaaanoooPeperooooniii {
    // pasta pasta

    //daca cititi asta, baga-ti o pizza baieti, traim o viata, sanatate

    public static void main(String[] args) {
        Set<String> peperoni = new HashSet<>();

        peperoni.add("salam");
        peperoni.add("cheese");
        peperoni.add("tomate sauce");
        peperoni.add("toast");
        peperoni.add("pepper");
        peperoni.add("salam");

        for (String pep : peperoni) {
            System.out.println("Ingredientooosss - " + pep);
        }

        System.out.println();
        System.out.println("Is the peperoni with honey ? - " + peperoni.contains("Honey"));

        System.out.println();
        System.out.println("Okay my friend, but how many ingredients it is in PEPEROOOONIIIIII ? - " + peperoni.size());

        System.out.println();
        System.out.println("Spread some love on the pepeROOONIII");

        peperoni.add("love");
        System.out.println();
        System.out.println("LooVVEEE - " + peperoni.contains("love"));










    }


}
