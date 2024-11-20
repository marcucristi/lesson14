package task3;

import java.util.HashMap;
import java.util.Map;

public class Dictionarooo {

    public static void main(String[] args) {

        Map<String, String> dict = new HashMap<>();

        dict.put("good", "bun");
        dict.put("chesse", "cascaval");
        dict.put("well", "bine");
        dict.put("consequences", "consecinte");
        dict.put("send", "trimite");
        dict.put("sun", "soare");
        dict.put("tools", "instrumente");
        dict.put("beatiful", "frumos");
        dict.put("better", "mai bun");
        dict.put("watermelon", "pepene verder");

        System.out.println(dict);
        System.out.println();


        System.out.println("Cum se zice sa chestia aia ce se intinde " +
                "pe PEPEROOOONIIIII ? " + dict.get("cheesse"));



    }

}
