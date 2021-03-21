package udemy.collection.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

/**
 * Alternate way to display the StudentDetails using Iterator
 */
public class StudentData {

    public static void main(String[] args) {
        Map<Integer, String> student = new HashMap<>();

        student.put(3, "Priyanka");
        student.put(1, "Rahul");
        student.put(8, "Arun");
        student.put(7, "Shanker");
        student.put(4, "Mathew");
        student.put(6, "Panjami");

        Iterator<Entry<Integer, String>> entry = student.entrySet().iterator();

        while (entry.hasNext()) {
            System.out.println(entry.next());
        }
    }

}
