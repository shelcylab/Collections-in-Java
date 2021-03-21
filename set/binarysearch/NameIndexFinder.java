package udemy.collection.set.binarysearch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Program to find the index of a value in set We can only perform sort and
 * binary search on list. So we have to store the elements on set into a list..
 * list.addAll(set);
 */
public class NameIndexFinder {

    public static void main(String[] args) {

        Set<String> set = new HashSet<>();

        set.add("Chaand");
        set.add("John");
        set.add("Aafiya");
        set.add("Arman");
        set.add("Mia");
        set.add("Chaand");

        System.out.println("Before sorting values : ");

        for (String s : set) {
            System.out.println(s);
        }

        System.out.println("\n");

        List<String> list = new ArrayList<>();

        //To add all set elements to a list
        list.addAll(set);

        //To sort the list
        Collections.sort(list);

        System.out.println("After sorting values : ");

        for (String s : list) {
            System.out.println(s);
        }
        //Performing binarysearch
        System.out.println("");
        System.out.println("The index of value[Chaand] is :  " + Collections.binarySearch(list, "Chaand"));

    }

}
