package learn;

import java.util.*;

public class Collection {

    public static void main(String[] args) {
        System.out.println("Welcome to Collection Framework ");
        /*
        * Creating Collection
        * 1) Type Safe- Same types of Elements
        * 2) NonType Safe- Different types of elements
        */
        /*
        * <> - type safe like we can say the String, Integer,Float Also We can say Generic way of Collecting*/

        // Type Safe Collection
        ArrayList<String> names = new ArrayList<>();
        names.add("Nisha");
        names.add("Goldy");
        names.add("Amit");
        names.add("Meet");
        names.add("Star");
        /*Here we mention String then it will add only String
        * names.add(123); -- wll not allowed coz it is generic*/
        //Remove
        names.remove("Star");
        System.out.println(names);
        //Index
        System.out.println(names.get(0));
        System.out.println(names.get(1));
        //Size
        System.out.println("SIZE= " + names.size());
        //exist== output only True and False
        // call Equal method of type
        System.out.println(names.contains("Meet"));
        //Check for Empty== Output only True and False
        System.out.println(names.isEmpty());

        //Remove Amit and add Rekha
        names.set(2,"Rekha");
        System.out.println(names);
        //Add New Name
        names.add(2,"Manish");
        System.out.println(names);
        //Remove all elements
//        names.clear();
//        System.out.println(names);
        //====================Vector==================//
        Vector<String> vector= new Vector<>();
        vector.addAll(names);
        System.out.println("Vector " + vector );
        //====================For Each Loop============//
        //length of word
        for(String s:names){
            System.out.println(s + "\t" + s.length());
        }
        System.out.println("-------------------------------------");
        //Reverse the Name
        for(String s:names) {
            System.out.print(s + "\t" + s.length() + "\t");
            StringBuffer br = new StringBuffer(s);
            System.out.println(br.reverse());
        }

        System.out.println("-------------------------------------");
        // Traversing Using Iterator ---->Forward
        Iterator<String> itr = names.iterator();
        while (itr.hasNext()){
         String next = itr.next();
            System.out.println(next);
        }
        System.out.println("+++++++++++++++++++++++++++++++++++");
        //ListIterator ---->Backward
        ListIterator<String> litr =  names.listIterator(names.size());
        while (litr.hasPrevious()){
         String previous = litr.previous();
            System.out.println(previous);
        }
        System.out.println("///////////////////////////////////////");

        //For each Method -- java 8 feature
        System.out.println("$$$$$$$$$$$$$ For Each Method $$$$$$$$$$$$$");
        names.forEach(s->{
            System.out.println(s);
        });
        //%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
        System.out.println("%%%%%% Sorting Of Element %%%%%%%");
        TreeSet<String> set= new TreeSet<>();
        set.addAll(names);
        set.forEach(e->{
            System.out.println(e);
        });


        //=======================================================================//

        System.out.println("************************************");
        //NonType Safe Collection
        ArrayList list = new ArrayList();
        list.add("Soni");
        list.add(1000);
        list.add(1001.2002);
        list.add(true);
        System.out.println(list);
    }
}
