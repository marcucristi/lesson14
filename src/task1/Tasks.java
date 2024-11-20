package task1;

import java.util.ArrayList;
import java.util.List;

public class Tasks {
    public static void main(String[] args) {

        List<String> things = new ArrayList<>();

        things.add("Fac breakfast");
        things.add("Merg la sala");
        things.add("Take a shower");
        things.add("Fac cursuri Java, obviously :DD ");
        things.add("Sa plec la serviciu");

        System.out.println("Taskurile pentru astazi " + things);

        System.out.println();

        for (String thin : things) {
            System.out.println(" - " + thin);
        }
    }


}
