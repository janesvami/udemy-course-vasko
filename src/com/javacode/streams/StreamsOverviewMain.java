package com.javacode.streams;

import com.javacode.lambdas.model.Employee;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsOverviewMain {
    private static List<Employee> employeeList = new ArrayList<>();
    private static List<Employee> secondList = new ArrayList<>();
    private static Map<Integer, Employee> employeeMap = null;

    public static void main(String[] args) throws IOException {

        employeeList.add(new Employee(1, "Alex", "Green", 50000));
        employeeList.add(new Employee(2, "John", "Green", 75000));
        employeeList.add(new Employee(6, "Sam", "Brown", 80000));
        employeeList.add(new Employee(9, "Tony", "Grey", 90000));
        employeeList.add(new Employee(10, "Mike", "Yellow", 60000));
        employeeList.add(new Employee(11, "Victoria", "Pink", 75000));
        employeeList.add(new Employee(16, "Sean", "Magenta", 80000));
        employeeList.add(new Employee(19, "Kate", "Black", 88000));
        employeeList.add(new Employee(9, "Tony", "Grey", 90000));
        employeeList.add(new Employee(10, "Mike", "Yellow", 60000));
        employeeList.add(new Employee(11, "Victoria", "Pink", 75000));


    }
//            testStreamIterate(10, supplier);

//        secondList.add(new Employee(1, "Alex", "Green", 50000));
//        secondList.add(new Employee(2, "John", "Green", 75000));
//        secondList.add(new Employee(6, "Sam", "Brown", 80000));
//        secondList.add(new Employee(9, "Tony", "Grey", 90000));
//        secondList.add(new Employee(10, "Mike", "Yellow", 60000));
//        secondList.add(new Employee(11, "Victoria", "Pink", 75000));
//        secondList.add(new Employee(16, "Sean", "Magenta", 80000));
//        secondList.add(new Employee(19, "Kate", "Black", 88000));
//        secondList.add(new Employee(9, "Tony", "Grey", 90000));
//        secondList.add(new Employee(10, "Mike", "Yellow", 60000));
//        secondList.add(new Employee(11, "Victoria", "Pink", 75000));

//        testStreamFormList();
//        testStreamFromFile();
//        testSortAndReduce();


//    private static void testSortAndReduce(){
//        Employee employee = employeeList.stream()
//                .max((e1,e2)->e1.getId()-e2.getId()).get();
//        System.out.println(employee);
//
//        employeeList.stream()
//                .sorted((s1,s2)->s1.getFirstName().compareTo(s2.getFirstName()))
//                .collect(Collectors.toList()).forEach(System.out::println);
//
//        Employee identity = new Employee(0, "", "", 0);
//
//        Employee redusedEmp = employeeList.stream()
//                .reduce(identity, (e1, e2)->{
//                    e1.setId(e1.getId()+ e2.getId());
//                    e1.setSalary(e1.getSalary()+ e2.getSalary());
//                    return e1;
//                });
//        System.out.println(redusedEmp);
//
//    }

//    private static void testStreamFormList() {

//        employeeList.stream()
//                .filter(e -> e.getSalary() > 60000)
//                .filter(e -> e.getId() < 10)
//                .collect(Collectors.toList())
//                .forEach(System.out::println);

//        Integer[] ids = {1, 2, 3, 4, 5, 6, 7, 8, 9, 12, 13, 14, 15, 16, 17, 18, 19, 20};


//        Optional<Employee> first = Stream.of(ids)
//                .map(StreamsOverviewMain::findById)
//                .filter(Objects::nonNull)
//                .findFirst();
//
//        Stream.of(ids)
//                .map(StreamsOverviewMain::findById)
//                .filter(Objects::nonNull)
//                .mapToInt(Employee::getSalary)
//                .max();
//
//        List<List<Employee>> departments = new ArrayList<>();
//        departments.add(employeeList);
//        departments.add(secondList);

//        departments.stream()
//                .flatMap(Collection::stream)
//                        .map(Employee::getFirstName)
//                .forEach(System.out::println);
//
//        Integer integer = Stream.of(ids)
//                .filter(id->id%2==0)
//                .filter(id->id%3==0)
//                .filter(id->id%5==0)
//                .findFirst()
//                .orElse(0);
//        System.out.println(integer);
//
//


//    private static void testStreamFromFile() throws IOException {
//        Files.lines(Paths.get("Sequence.txt"))
//                .filter(e -> e.length() > 4)
//                .map(String::toUpperCase)
//                .distinct()
//                .sorted()
//                .forEach(System.out::println);
//
//    }

//    private static Employee findById(int id) {
//        if (employeeMap == null) {
//            employeeMap = employeeList.stream().distinct().collect(Collectors.toMap(Employee::getId, e -> e));
//        }
//        return employeeMap.get(id);
//    }
//
//        private static void testStreamGenerate ( int limit){
//            Stream.generate(Math::random).limit(limit).forEach(System.out::println);
//        }
//
//        private static void testStreamIterate ( int limit, Supplier<T > supplier){
//            Stream.iterate(1, e -> e * 3).limit(limit).forEach(System.out::println);
//        }
//
//        private static void testParallelStream () throws IOException {
//            employeeList
//                    .parallelStream()
//                    .map(Employee::getId)
//                    .sorted()
//                    .toList()
//                    .forEach(System.out::println);
//
//            Files.lines(Paths.get("words.txt"))
//                    .parallel()
//                    .sorted();
//        }
//    }
}
