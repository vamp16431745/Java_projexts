package map練習;

import java.util.HashMap;

public class Hashmap1 {
    public static void main(String[] args)
    {
        HashMap<String,String> capitalCities=new HashMap<String,String>();

        capitalCities.put("England","Londin");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");

//        System.out.println(capitalCities);
//        System.out.println(capitalCities.get("England"));
//        System.out.println(capitalCities.size());


        // Print keys
//        for (String i : capitalCities.keySet()) {
//            System.out.println(i);
//        }

        // Print values
//        for (String i : capitalCities.values()) {
//            System.out.println(i);
//        }

        // Print keys and values
        for (String i : capitalCities.keySet()) {
            System.out.println("key: " + i + " value: " + capitalCities.get(i));
        }


    }
}
