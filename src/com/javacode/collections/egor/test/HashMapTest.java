package com.javacode.collections.egor.test;

import java.util.HashMap;

public class HashMapTest {
    public static void main(String[] args) {


        Student student1 = new Student("Анисия", 3213);
        Student student2 = new Student("Феофания", 3213);
        Student student3 = new Student("Егор", 4343);
        Student student4 = new Student("Илья", 4343);
        Student student5 = new Student("Олег", 5645);

        HashMap<Student, Integer> students = new HashMap<>();
        students.put(student1, 1);
        students.put(student2, 2);
        students.put(student3, 3);
        students.put(student4, 4);
        students.put(student5, 5);

        printHM(students);


    }

    public static void printHM(HashMap<Student, Integer> students) {
        for (HashMap.Entry<Student, Integer> entry : students.entrySet()) {
            Student student = entry.getKey();
            System.out.println(student);
        }
    }
}
