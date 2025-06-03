package com.javacode.javaio;

import java.io.IOException;
import java.nio.file.*;

public class FileUtils {


    public void printNioFileDetails(String fileName) throws IOException {
        Path path = Paths.get(fileName);
        Path path1 = FileSystems.getDefault().getPath(fileName);
        Path path2 = Paths.get(System.getProperty("user.dir"), fileName);

        Path absolutePath = path.toAbsolutePath();
        System.out.println("" + absolutePath.getFileName());
        System.out.println("Root dir " + absolutePath.getRoot());

        System.out.println("Absolute path " + absolutePath);
        System.out.println("Parent dir " + absolutePath.getParent());
        System.out.println("Name count " + absolutePath.getNameCount());

        Path path3 = Paths.get("../../");
        System.out.println("Real path " + path3.toRealPath());

        System.out.println("File exists " + Files.exists(path));
        System.out.println("File does not exists " + Files.notExists(path));
        System.out.println("Is readable " + Files.isReadable(path));

        Path parentPath = absolutePath.getParent();
        Path filesPath = parentPath.resolve("files");
        if (Files.notExists(filesPath)) {
            Files.createDirectory(filesPath);
        }
        Files.move(filesPath.resolve(path), absolutePath, StandardCopyOption.REPLACE_EXISTING);


    }

    public void processDir() throws IOException {
        Path dir = Paths.get("temp");
        if (Files.notExists(dir)) {
            Files.createDirectory(dir);
        }
        Files.createDirectories(Paths.get("temp/a/b/c"));
        Files.createTempDirectory(dir, "tmp");
        Iterable<Path> rootDirectories = FileSystems.getDefault().getRootDirectories();

        for (Path rootDir : rootDirectories) {
            System.out.println(rootDir);
        }

        DirectoryStream.Filter<Path> filter = new DirectoryStream.Filter<Path>() {
            @Override
            public boolean accept(Path entry) throws IOException {
                return Files.isDirectory(entry);
            }
        };

        try(DirectoryStream<Path> paths = Files.newDirectoryStream(dir, filter)){
            for (Path p : paths) {
                System.out.println(p);
            }
        }

    }
}

