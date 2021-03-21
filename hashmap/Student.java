package udemy.collection.hashmap;

import java.util.HashMap;
import java.util.Map;

/**
 * To display details of students using Hashmap
 */
public class Student {

    public static void main(String[] args) {

        Map<Integer, String> student = new HashMap<>();

        student.put(3, "Priyanka");
        student.put(1, "Rahul");
        student.put(2, "Mia");

        for (Map.Entry<Integer, String> entry : student.entrySet()) {
            System.out.println(entry);
        }

    }

}
