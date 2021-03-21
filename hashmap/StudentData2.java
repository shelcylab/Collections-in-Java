package udemy.collection.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

/**
 *
 * @author shelc
 */
public class StudentData2 {

    public static void main(String[] args) {
        Map<Integer, String> student = new HashMap<>();

        student.put(3, "Priyanka");
        student.put(1, "Rahul");
        student.put(8, "Arun");
        student.put(7, "Shanker");
        student.put(4, "Mathew");
        student.put(6, "Panjami");

        Iterator<Map.Entry<Integer, String>> entry = student.entrySet().iterator();

        while (entry.hasNext()) {
            Entry<Integer, String> temp = entry.next();
            System.out.println("Student Id: " + temp.getKey() + " , Student Name: " + temp.getValue());
        }
    }

}
