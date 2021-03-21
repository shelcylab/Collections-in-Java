/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udemy.collection.hashmap;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author shelc
 */
public class StudentsDetails2 {

    public static void main(String[] args) {

        Map<Integer, String> student = new HashMap<>();
//Here there are two values for same key - 2
//In such situation the first value is overridden by second value
        student.put(3, "Priyanka");
        student.put(1, "Rahul");
        student.put(2, "Mia");
        student.put(4, "Rani");
        student.put(5, "Samanta");
        student.put(3, "Akbar");

        for (Map.Entry<Integer, String> entry : student.entrySet()) {
            System.out.println("Student No: " + entry.getKey() + " , Student Name: " + entry.getValue());
        }

    }

}
