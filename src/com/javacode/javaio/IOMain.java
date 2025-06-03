package com.javacode.javaio;

import com.javacode.collections.map.treemap.AverageStudentGrade;
import com.javacode.collections.map.treemap.SubjectGrade;
import com.javacode.collections.map.treemap.TreeMapRunner;

import java.io.*;
import java.util.*;

public class IOMain {

    private static final String FILE_NAME = "GradeBook.txt";
    private static final String BINARY_FILE = "Students.bin";
    private static final String BUFFERED_FILE = "Buffered.bin";

    public static void main(String[] args) throws IOException {
        SortedMap<AverageStudentGrade, Set<SubjectGrade>> grades = TreeMapRunner.createGrades();
        Reader reader = new Reader();
        Writer writer = new Writer();
        writer.writeFile(grades, FILE_NAME);
//        reader.readFile(FILE_NAME);
//        writer.writeWithFormatter();
//        processGrades(grades, writer, BINARY_FILE);
//        outputObject(reader, BINARY_FILE);
        FileUtils utils = new FileUtils();
//        utils.printNioFileDetails("Таня.txt");
//        reader.readFileInFull("Питер.txt");
//        reader.nioReadFileWithBuffer("Питер.txt");
//        writer.nioWriteWithBuffer(BUFFERED_FILE);
//        reader.nioReadWithStream(BUFFERED_FILE);
//        reader.nioReadWithChannel(FILE_NAME);
//        writer.nioWriteWitChannel(BUFFERED_FILE);
//        writer.writeWithRandomAccess(FILE_NAME);
        utils.processDir();

    }

    private static void processGrades(SortedMap<AverageStudentGrade, Set<SubjectGrade>> grades,
                                      Writer writer, String fileName) {
        List<Student> students = new ArrayList<>();
        for (AverageStudentGrade gradeKey : grades.keySet()) {
            students.add(new Student(gradeKey.getName(), gradeKey.getAverageGrade(), grades.get(gradeKey)));
        }
        writer.writeObject(students, fileName);

    }

    private static void outputObject(Reader reader, String fileName) {
        List<Student> students = reader.readObject(fileName);
        for (Student student : students) {
            System.out.printf("%s %.2f %n", student.getName(), student.getAverageGrade());
            System.out.println(student.getGrades());
        }
    }
}


