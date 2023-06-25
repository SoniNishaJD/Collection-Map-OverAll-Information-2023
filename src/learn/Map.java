package learn;

import java.util.HashMap;
import java.util.function.BiConsumer;

public class Map {

    public static void main(String[] args) {
        //Key String , Value Integer
        HashMap<String, Integer> companies = new HashMap<>();
        // duplicate not allow
        //Add Element
        companies.put("Aurosoft Technologies", 40000);
        companies.put("MVC", 20000);
        companies.put("Google", 1000000);
        System.out.println(companies);
        System.out.println("*****************************************");
        //For Each
        companies.forEach((key,value)->{
            System.out.println(key+"=>"+value);
            System.out.println();
        });
        //Want value of particular  key

        System.out.println(companies.get("Google"));
    }
}
