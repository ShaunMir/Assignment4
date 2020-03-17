package com.company;

import java.util.*;

import static org.hamcrest.CoreMatchers.hasItem;
import static org.hamcrest.CoreMatchers.hasItems;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.hamcrest.collection.IsIterableContainingInAnyOrder.containsInAnyOrder;
import static org.hamcrest.collection.IsIterableContainingInOrder.contains;

class MainTest {

    @org.junit.jupiter.api.Test
    void collection() {
        Collection<Integer> values = new ArrayList<Integer>();
        values.add(1);
        values.add(3);
        values.add(5);
     //   values.add("Text");
    /*
    If value types are specified adding other types will crash the program.
    Likewise Collection does not have a index so values are only added one after the other.
     */
        System.out.println("Collection Example \n----------------------");
        for (Object value : values) {
            System.out.println(value);
        }

    }

    @org.junit.jupiter.api.Test
    void map() {
        Map<String, String> map = new HashMap<String, String>();
        map.put("Name", "Shaun");
        map.put("Surname", "Donnelly");
        map.put("Name", "Deneesha");
        map.put("Surname2", "Donnelly");

        System.out.println(map.values());
        /*
            Map index will be overwritten if repeated
            Map value can repeat if index is unique
         */
    }

    @org.junit.jupiter.api.Test
    void set() {
        Set<Integer> values = new HashSet<Integer>();
        values.add(23);
        values.add(57);
        values.add(23);

        for (int i : values){
            System.out.println(i);
        }
        /*
            Set values must be unique and will not repeat
         */
    }

    @org.junit.jupiter.api.Test
    void list() {

        List<String> myList = new ArrayList<String>();
        myList.add("Cat");
        myList.add("Dog");
        myList.add("Bird");

      //  assertThat(myList, hasItems("fish"));
        assertThat(myList, hasItem("Dog"));

    }
}