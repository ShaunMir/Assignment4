package com.company;


import java.util.*;



public class Main {

    public void collection(){

        Collection<Object> values = new ArrayList<Object>();
        values.add("Shaun");
        values.add(3);
        values.add(5.9);

        System.out.println("Collection Example \n----------------------");
        for (Object value : values) {
            System.out.println(value);
        }
    }

    public void map(){

            Map<String, String> map = new HashMap<String, String>();
            map.put("Name", "Shaun");
            map.put("Surname", "Donnelly");
            map.put("Age", "23");
            map.put("Boss", "Shaun");

        System.out.println("\nMap Example \n----------------------");
        System.out.println("Values: " + map.values());
        System.out.println("Find Surname: " + map.get("Surname"));
    }

    public void set(){

        Set<Integer> values = new HashSet<Integer>();
         values.add(23);
         values.add(57);
         values.add(90);
         /*Does not display duplicate values*/
         System.out.println("\nSet Example \n----------------------");

         for (int i:values){
            System.out.println(i);
        }
    }

    public void list(){
        List<String> myList = new ArrayList<String>();
        myList.add("Cat");
        myList.add("Dog");
        myList.add("Bird");
        int size = myList.size();

        System.out.println("\nList Before Changes \n----------------------");
        System.out.println(myList + "\n" + "List Size: " + size);
        myList.remove("Dog");
        System.out.println("\nList After Changes \n----------------------");
        System.out.println(myList);
    }

    public static void main(String[] args) {

        Main run = new Main();
        run.collection();
        run.map();
        run.set();
        run.list();

    }
}
