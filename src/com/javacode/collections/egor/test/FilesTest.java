package com.javacode.collections.egor.test;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FilesTest {
    public static void main(String[] args) throws IOException {

        List<String> students = new ArrayList<>();
        students.add("Анисия, 35");
        students.add("Илья, 38");
        students.add("Феофания, 33");
        students.add("Олег, 19");
        students.add("Вениамин, 1.11");

        FileWriter fileWriter = new FileWriter("students.txt");

        for (String student : students) {
            fileWriter.write(student + "\n");
        }
        fileWriter.close();

        FileReader fileReader = new FileReader("students.txt");
        Scanner scanner = new Scanner(fileReader);
        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }

        fileReader.close();
    }
}
