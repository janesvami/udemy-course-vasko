package com.javacode.lambdas;

import com.javacode.lambdas.model.Circle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

@FunctionalInterface
interface ElementProcessor<T extends Number> {
    double process(T element);
}
@FunctionalInterface
interface Operation {
    void process();

    static void measure(Operation function) {

        long start = System.currentTimeMillis();
        function.process();
        long end = System.currentTimeMillis();
        System.out.println("Time spent " + (end - start));
    }

    default Operation combineOperation(Operation that) {
        return ()->{
            process();
            that.process();
        };
    }
}

public class LambdaExample {
    public static void main(String[] args) {
//        List<Integer> intList = new ArrayList<>();
//        intList.add(1);
//        intList.add(2);
//        intList.add(3);
//        intList.add(4);
//        intList.add(5);
//        List<Double> doubleList = new ArrayList<>();
//        doubleList.add(6.4);
//        doubleList.add(8.6);
//        doubleList.add(1.23);
//        doubleList.add(4.13);
//        doubleList.add(12.2);
//
//        processElements(intList, x -> Math.sin(x.doubleValue()));
//        processElements(doubleList, x -> Math.sin(x.doubleValue()));
//
//        TimeUtil.measure(() -> Arrays.sort(createRandomArray()));
//
//        String s = "hello ";
//        Double d = 0.123;
//
//        TransformUtils<Double> doubleUtils = new TransformUtils<>();
//        System.out.println(doubleUtils.transform(d, Math::sin));
//
//        TransformUtils<String> stringUtils = new TransformUtils<>();
//        System.out.println(stringUtils.transform(s, TransformUtils::exclaim));
//
//        String suffix = "Alex";
//        System.out.println(stringUtils.transform(suffix, s::concat));
//
//        System.out.println(stringUtils.transform(s, String::toUpperCase));
//        System.out.println(stringUtils.transform(s, String::new));

        LambdaScopeTest scope = new LambdaScopeTest();
        LambdaScopeTest.LambdaScopeInner inner = scope.new LambdaScopeInner();
        inner.testScope(9999.0000);

        Circle circle = new Circle();
        System.out.println(circle.calcSomething());

        Operation operation1 = ()-> Arrays.sort(createRandomArray());
        Operation operation2 = ()-> Arrays.sort(createRandomArray());
        Operation.measure(operation1.combineOperation(operation2));

    }





    private static <T extends Number> void processElements(List<T> intList, ElementProcessor function) {
        List<Double> doubleList = new ArrayList<>();

        for (T i : intList) {
            doubleList.add(function.process(i));
        }
        System.out.println(doubleList);
    }

    private static int[] createRandomArray() {
        int[] myArray = new int[100000];
        Random r = new Random();
        for (int i = 0; i<myArray.length; i++) {
            myArray[i] = r.nextInt(myArray.length);
        }
        return myArray;
    }

}
