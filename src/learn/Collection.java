package learn;

import java.util.*;
import java.util.Map;

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
        names.set(2, "Rekha");
        System.out.println(names);
        //Add New Name
        names.add(2, "Manish");
        System.out.println(names);
        //Remove all elements
        //        names.clear();
        //        System.out.println(names);
        //====================Vector==================//
        Vector<String> vector = new Vector<>();
        vector.addAll(names);
        System.out.println("Vector " + vector);
        //====================For Each Loop============//
        //length of word
        for (String s : names) {
            System.out.println(s + "\t" + s.length());
        }
        System.out.println("-------------------------------------");
        //Reverse the Name
        for (String s : names) {
            System.out.print(s + "\t" + s.length() + "\t");
            StringBuffer br = new StringBuffer(s);
            System.out.println(br.reverse());
        }

        System.out.println("-------------------------------------");
        // Traversing Using Iterator ---->Forward
        Iterator<String> itr = names.iterator();
        while (itr.hasNext()) {
            String next = itr.next();
            System.out.println(next);
        }
        System.out.println("+++++++++++++++++++++++++++++++++++");
        //ListIterator ---->Backward
        ListIterator<String> litr = names.listIterator(names.size());
        while (litr.hasPrevious()) {
            String previous = litr.previous();
            System.out.println(previous);
        }
        System.out.println("///////////////////////////////////////");

        //For each Method -- java 8 feature
        System.out.println("$$$$$$$$$$$$$ For Each Method $$$$$$$$$$$$$");
        names.forEach(s -> {
            System.out.println(s);
        });
        //%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
        System.out.println("%%%%%% Sorting Of Element %%%%%%%");
        TreeSet<String> set = new TreeSet<>();
        set.addAll(names);
        set.forEach(e -> {
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

        //=========================================================================//

        System.out.println("+++++++++++++++++LinkedList+++++++++++++++++++++");
        /*
         * Declare LinkedList:
         * LinkedList l = new LinkedList(); ==> Hetogenious data
         * LinkedList<String> l = new LinkedList<String>(); ==> Homogenous
         * */
        LinkedList l = new LinkedList();

        //Add element in LinkedList
        l.add(5);
        l.add("Sonika");
        l.add(2.5);
        l.add(true);
        l.add('N');

        System.out.println(l);
        System.out.println(l.size());
        System.out.println("/////////////////Remove by Index/////////////////////////");
        //remove
        l.remove(3); // Remove by index
        System.out.println("after romoving an element by index: " + l);
        System.out.println("//////////////Remove  by object////////////////////////////");
        l.remove(true);
        System.out.println("After removing an element by object" + l);

        System.out.println("//////////////////Insert////////////////////////");
        //Insert ==> Add an element in the middle of linkedList
        l.add(3, "Java");
        System.out.println(l);
        System.out.println("/////////////////Retrive/////////////////////////");
        //retrive method
        System.out.println("Retriving the element :" + l.get(3));
        System.out.println("/////////////////Replace/////////////////////////");
        //Set method
        l.set(4, 'A');
        System.out.println("Replace the element:" + l);

        System.out.println("////////////Is Exist//////////////////////////////");
        //Check if element exist or not by contain method

        System.out.println("Is Exist " + l.contains("Sonika"));
        System.out.println("Is Exist " + l.contains("Jewellers"));

        System.out.println("/////////////////Is Empty/////////////////////////");
        //isEmpty or not by true or false
        System.out.println("Is Empty:" + l.isEmpty());

        System.out.println("/////////////////For/////////////////////////");
        //Reading element by for loop
        for (int i = 0; i < l.size(); i++) {
            System.out.println(l.get(i));
        }
        System.out.println("///////////////ForEach////////////////////////////");
        //for Each loop
        for (Object e : l) {
            System.out.println(e);
        }
        System.out.println("///////////////////////Itretor//////////////////////");
        Iterator it = l.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("////////////////All method are only Homogenous method////////////////////////////////");
        //All method are only Homogenous method
        LinkedList ll = new LinkedList<>();
        ll.add("N");
        ll.add("I");
        ll.add("S");
        ll.add("H");
        ll.add("A");

        System.out.println(ll);

        System.out.println("////////////Add all object on new linkedList//////////////////");
        LinkedList new_ll = new LinkedList();
        new_ll.addAll(ll);
        System.out.println(new_ll);

        System.out.println("/////////////////////Sort////////////////////");
        Collections.sort(ll);
        System.out.println("After Sorting an Element: " + ll);

        System.out.println("///////////////////Reverse the order//////////////////////");
        //Decending Order
        Collections.sort(ll, Collections.reverseOrder());
        System.out.println(ll);

        System.out.println("//////////////Shuffle Method/////////////////////");
        //Shuffle meaning is rendom arrange
        Collections.shuffle(ll);
        System.out.println("After Shuffle an element: " + ll);

        System.out.println("///////////////////////Methods which is only in LinkedList//////////////////////");
        LinkedList lll = new LinkedList();
        //Animals
        lll.add("Dog");
        lll.add("Dog");
        lll.add("Cat");
        lll.add("Rat");
        lll.add("Horse");
        lll.add("Cow");
        System.out.println(lll);

        System.out.println("////////////////////////Add in First in linked List/////////////////////////////");
        lll.addFirst("Got");
        System.out.println(lll);

        System.out.println("////////////////////////Add in Last in linked List/////////////////////////////");
        lll.addLast("Ship");
        System.out.println(lll);

        System.out.println("////////////////////////Get element First in linked List/////////////////////////////");
        System.out.println(lll.getFirst());

        System.out.println("////////////////////////Get element Last in linked List/////////////////////////////");
        System.out.println(lll.getLast());

        System.out.println("////////////////////////Remove  First element in linked List/////////////////////////////");
        lll.removeFirst();
        System.out.println(lll);

        System.out.println("////////////////////////Remove  Last element in linked List/////////////////////////////");
        lll.removeLast();
        System.out.println(lll);

        System.out.println("***************************HashSet*********************************");
        //Default capacity is 16
        //Default Load Factor is 0.75
        /*   HashSet hs = new HashSet();
         *   HashSet hs = new HashSet(100); // Initial capacity is 100
         *   HashSet hs = new HashSet(100,(float) 0.90); ==> Locations
         *   Hashset<Integer> hs = new HashSet<Integer>(); ==> Specific Datatype
         */
        HashSet hs = new HashSet(); // Output will be in rendom order

        hs.add('A');
        hs.add("Dream");
        hs.add(25);
        hs.add("Nishaa");
        hs.add(true);
        hs.add(null);
        System.out.println(hs);

        System.out.println("********************Remove***************************");
        hs.remove(25);
        System.out.println(hs);


        System.out.println("**************************Contain Method**********************");
        System.out.println(hs.contains("Nishaa"));
        System.out.println(hs.contains("Soni"));

        System.out.println("******************************Is Empty or not**************************");
        System.out.println(hs.isEmpty());

        System.out.println("****************************For Each Loop****************************");
        for (Object o :hs){
            System.out.println(o);
        }

        System.out.println("***********************Itrator******************************");
        Iterator it2 = hs.iterator();
        while (it2.hasNext()){
            System.out.println(it2.next());
        }

        System.out.println("****************Add**************************");
        HashSet <Integer> evenNumber = new HashSet<>();
        evenNumber.add(2);
        evenNumber.add(4);
        evenNumber.add(6);
        System.out.println(evenNumber);

        System.out.println("****************Add All**************************");
         HashSet<Integer> numbers = new HashSet<>();
         numbers.addAll(evenNumber);
         numbers.add(10);
        System.out.println(numbers);

        System.out.println("****************Remove All**************************");
        numbers.removeAll(evenNumber);
        System.out.println(numbers);

        System.out.println("****************************Union********************");
        // Union means which are unique value
         HashSet<Integer> set1 = new HashSet<Integer>();
         set1.add(1);
         set1.add(2);
         set1.add(3);
         set1.add(4);
         set1.add(5);

        System.out.println(set1);

        HashSet<Integer> set2 = new HashSet<Integer>();
        set2.add(3);
        set2.add(4);
        set2.add(5);

        System.out.println(set2);

        //Union
        set1.addAll(set2);
        System.out.println(set1);

        System.out.println("********************Intersection***************************");
        //Intersection means commons elements in two section
        set1.retainAll(set2);
        System.out.println(set1);

        System.out.println("********************Difference***************************");

        set1.removeAll(set2);
        System.out.println(set1); //[1,2] after comment retainAll method

        System.out.println("-------------------------------LinkedHashset---------------------------------");
        /*
        * Same methods as hashset
        * **************methods*******************
        *   LinkedHashSet lset = new LinkedHashSet();
        *   LinkedHashSet<Integer> lset = new LinkedHashSet<Integer>();
        */
        LinkedHashSet lset = new LinkedHashSet(); // Sequence order
        lset.add(2);
        lset.add("Java");
        lset.add("Developer");
        lset.add(2.5);
        lset.add(false);

        System.out.println(lset);

        System.out.println("++++++++++++++++++++++++++++++++++++++QUEUE+++++++++++++++++++++++++++++++++++++++++");

        System.out.println("+++++++++++++++++++++++++++++++++Priority Queue++++++++++++++++++++++++++++++++++++++");

        PriorityQueue pq = new PriorityQueue();
        //Insertation allow
        //Duplicate allow
        //Add an Element
        pq.add("A");
        pq.add("B");
        pq.add("C");
        pq.offer("D");
        pq.add("E");
        pq.add("E");

        System.out.println(pq);
        //Get Head element
        System.out.println("+++++++++++++++++++++++++++Element/peek+++++++++++++++++++++++++++++");
        System.out.println(pq.element());
        System.out.println(pq.peek());

        System.out.println("+++++++++++++++++++++++++++Remove+++++++++++++++++++++++++++++");
        System.out.println(pq.remove());
        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq);

        System.out.println("++++++++++++++++++++++++++++++++Itertor+++++++++++++++++++++++++++++++++++++");
        Iterator itr3 = pq.iterator();
        while (itr3.hasNext()){
            System.out.println(itr3.next());

            System.out.println("+++++++++++++++++++++++++++For Each+++++++++++++++++++++++++++++");

            for (Object obj:pq){
                System.out.println(obj);
            }
        }



        System.out.println("+++++++++++++++++++++++++++++++++LinkedList++++++++++++++++++++++++++++++++++++++");

        LinkedList lq = new LinkedList();
        //Insertation  allow
        //Duplicate  allow
        //Add an Element
        lq.add("A");
        lq.add("B");
        lq.add("C");
        lq.offer("D");
        lq.add("E");
        lq.add("E");
        lq.add(100);

        System.out.println(lq);
        //Get Head element
        System.out.println("+++++++++++++++++++++++++++Element/peek+++++++++++++++++++++++++++++");
        System.out.println(lq.element());
        System.out.println(lq.peek());

        System.out.println("+++++++++++++++++++++++++++Remove+++++++++++++++++++++++++++++");
        System.out.println(lq.remove());
        System.out.println(lq);
        System.out.println(lq.poll());
        System.out.println(lq);

        System.out.println("++++++++++++++++++++++++++++++++Itertor+++++++++++++++++++++++++++++++++++++");
        Iterator itr4 = lq.iterator();
        while (itr4.hasNext()){
            System.out.println(itr4.next());

            System.out.println("+++++++++++++++++++++++++++For Each+++++++++++++++++++++++++++++");

            for (Object obj:lq){
                System.out.println(obj);
            }
        }

        System.out.println("+++++++++++++++++++++++++++Hash Map+++++++++++++++++++++++++++++");
        /*
        * HashMap hm = new HashMap();
        * HashMap<Integer,String> hm = new HashMap<Integer,String> ();*/
       HashMap hm = new HashMap();  // Hetrogonous , NO Duplicate key , But Value can be dupli

        hm.put(101,"Nisha");
        hm.put(102,"Soni");
        hm.put(103,"Dream");
        hm.put(104,"Java");
        hm.put(105,"Developer");
        hm.put(106,"Soni");
        System.out.println(hm);
        System.out.println("+++++++++++++++++++++++++++Get peticular value by key+++++++++++++++++++++++++++++");
        System.out.println(hm.get(103));

        System.out.println("+++++++++++++++++++++++++++Remove Pair+++++++++++++++++++++++++++++");
        hm.remove(106);
        System.out.println(hm);

        System.out.println("+++++++++++++++++++++++++++Key OR Value Exist or not+++++++++++++++++++++++++++++");
        System.out.println(hm.containsKey(105));
        System.out.println(hm.containsValue("Developer"));

        System.out.println("+++++++++++++++++++++++++++Empty or not+++++++++++++++++++++++++++++");
        System.out.println(hm.isEmpty());

        System.out.println("+++++++++++++++++++++++++++Size number of Key and value +++++++++++++++++++++++++++++");
        System.out.println(hm.size());

        System.out.println("+++++++++++++++++++++++++++All Key as a Set+++++++++++++++++++++++++++++");
        System.out.println(hm.keySet());


//        System.out.println("+++++++++++++++++++++++++++Read perticular object+++++++++++++++++++++++++++++");
//        for (Object i :hm.keySet()){
//            System.out.println(i);    // It works when second method starts " hm = new HashMap<Integer,String> ();"

//        }

        System.out.println("+++++++++++++++++++++++++++All Values as a Collections+++++++++++++++++++++++++++++");
        System.out.println(hm.values());

//        System.out.println("+++++++++++++++++++++++++++Read perticular object+++++++++++++++++++++++++++++");
//        for (Object i :hm.values()){
//            System.out.println(i);    // It works when second method starts " hm = new HashMap<Integer,String> ();"

//        }

        //        System.out.println("+++++++++++++++++++++++++++Read perticular object+++++++++++++++++++++++++++++");
//        for (Object i :hm.keySet()){
//            System.out.println(i+"   "+hm.get(i));    // It works when second method starts " hm = new HashMap<Integer,String> ();"

//        }

        System.out.println("+++++++++++++++++++++++++++Define perticular pair as a Set object+++++++++++++++++++++++++++++");
        System.out.println(hm.entrySet());

     //   System.out.println("+++++++++++++++++++++++++++Entry Methods+++++++++++++++++++++++++++++");

//        System.out.println("+++++++++++++++++++++++++++Entry form Hashmap+++++++++++++++++++++++++++++");
//        for (Map.Entry entry :hm.entrySet()){
//            System.out.println(entry.getKey()+"  "+entry.getValue());  ====> HashMap<Integer,String> hm = new HashMap<Integer,String> ();
//        }

        System.out.println("++++++++++++++++++++++++++++++++Iterator+++++++++++++++++++++++++++++++++++");
        Set s = hm.entrySet();
        Iterator itr5 = s.iterator();
        while (itr5.hasNext()){
           Map.Entry entry2 = (Map.Entry) itr5.next();
            System.out.println(entry2.getKey()+"   " +entry2.getValue());
        }
        System.out.println("*-*-*-*-*-*-*-*-*-*-*HashTable*-*-*-*-*-*-*-*-*-*-*-*-*");
        /* Hashtable ht = new Hashtable();
        *  Hashtable ht = new(initial capacity);
        * Hashtable ht = new(initial capacity,load factor);
        * Hashtable <Integer,String> ht = new Hashtable<Integer,String>();*/


        Hashtable <Integer,String> ht = new Hashtable<Integer,String>();
        ht.put(1,"Nisha");
        ht.put(2,"Priya");
        ht.put(3,"Prit");
        ht.put(4,"Ami");
        ht.put(5,"Mani");

        System.out.println(ht);

        System.out.println("*-*-*-*-*-*-*-*-*-*-*Get by Key*-*-*-*-*-*-*-*-*-*-*-*-*");

        System.out.println(ht.get(2));
        System.out.println("*-*-*-*-*-*-*-*-*-*-*Key exist or not*-*-*-*-*-*-*-*-*-*-*-*-*");

        System.out.println(ht.containsKey(2));
        System.out.println(ht.containsKey(6));

        System.out.println("*-*-*-*-*-*-*-*-*-*-*Value exist or not*-*-*-*-*-*-*-*-*-*-*-*-*");
        System.out.println(ht.containsValue("Ami"));
        System.out.println(ht.containsValue("Pragya"));

        System.out.println("*-*-*-*-*-*-*-*-*-*-*Is Empty or not*-*-*-*-*-*-*-*-*-*-*-*-*");
        System.out.println(ht.isEmpty());

        System.out.println("*-*-*-*-*-*-*-*-*-*-*Get all Keys*-*-*-*-*-*-*-*-*-*-*-*-*");
        System.out.println(ht.keySet());

        System.out.println("*-*-*-*-*-*-*-*-*-*-*Get all Values*-*-*-*-*-*-*-*-*-*-*-*-*");
        System.out.println(ht.values());

        System.out.println("*-*-*-*-*-*-*-*-*-*-*For loop for keys and values*-*-*-*-*-*-*-*-*-*-*-*-*");
        for (int k :ht.keySet()){
            System.out.println(k+"  "+ht.get(k));
        }
        System.out.println("*-*-*-*-*-*-*-*-*-*-*Entry Specific Method...*-*-*-*-*-*-*-*-*-*-*-*-*");
        System.out.println("*-*-*-*-*-*-*-*-*-*-*Know about All Entry*-*-*-*-*-*-*-*-*-*-*-*-*");
        for (Map.Entry entry :ht.entrySet()){
            System.out.println(entry.getKey()+"  "+entry.getValue());
        }

        System.out.println("*-*-*-*-*-*-*-*-*-*-*Iterator*-*-*-*-*-*-*-*-*-*-*-*-*");
        Set s2 = ht.entrySet();
        Iterator iterator =s2.iterator();
        while (iterator.hasNext()){
            Map.Entry entry = (Map.Entry) iterator.next();
            System.out.println(entry.getKey()+"  "+entry.getValue());
        }
        System.out.println("*-*-*-*-*-*-*-*-*-*-*Remove by Key*-*-*-*-*-*-*-*-*-*-*-*-*");

        ht.remove(3);
        System.out.println(ht);












    }
}