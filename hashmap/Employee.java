package udemy.collection.hashmap;

import java.util.HashMap;
import java.util.Map;

/**
 * To display employee details using HashMap and Entry
 */
public class Employee {

    public static void main(String[] args) {

        Map<Integer, String> employee = new HashMap<>();

        employee.put(1121, "Manoher Joshi");
        employee.put(4321, "Rahul Arrora");
        employee.put(5121, "Ashbin Jindal");
        employee.put(7121, "Sanu Priya");
        employee.put(8321, "John Ullas");
        employee.put(9321, "Mark Ullas");

        for (Map.Entry<Integer, String> entry : employee.entrySet()) {
            System.out.println(entry);
        }
    }

}
