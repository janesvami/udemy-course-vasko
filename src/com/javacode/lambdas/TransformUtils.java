package com.javacode.lambdas;

import java.util.Locale;

public class TransformUtils<T> {
    T transform(T t, Transformable<T> function){
        return function.transform(t);
    }

    static String exclaim(String s) {
        return s.toUpperCase(Locale.ROOT)+"!!!";
    }
}
