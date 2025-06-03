package com.javacode.collections.egor.test;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class NIOTest {
    public static void main(String[] args) throws IOException {

        Path path = Paths.get("data.txt");
        Files.createFile(path);
        Files.write(path,"Hello, Java NIO!".getBytes(StandardCharsets.UTF_8), StandardOpenOption.APPEND);
        List<String> list = Files.readAllLines(path);

        for (String str : list) {
            System.out.println(str);
        }

    }
}
