package udemy.collection.hashmap;

import java.util.HashMap;
import java.util.Map;

/**
 * Another way to print same output as of StudentDetails class
 */
public class StudentRecord {
    
    public static void main(String[] args) {
        
        Map<Integer, String> student = new HashMap<>();
        
        student.put(3, "Priyanka");
        student.put(1, "Rahul");
        student.put(8, "Arun");
        student.put(7, "Shanker");
        student.put(4, "Mathew");
        student.put(6, "Panjami");
        
        for (Integer key : student.keySet()) {
            System.out.println("StudentId: " + key + " , Student Name: " + student.get(key));
        }
    }
    
}
