package fileIO;


// https://medium.com/@aayushsharda/why-is-it-better-to-avoid-in-import-statements-in-java-ff9ceaca8aeb
// "Why is it better to avoid ‘*’ in import statements in Java?"
// Using '*' will affect compilation time, but not runtime

import java.io.*;
import java.util.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class fileIO_lec {
    public static void printPoem(Path filePath) throws IOException {

        System.out.println();
        List<String> fileContents = Files.readAllLines(filePath);
        for (int i = 0; i < fileContents.size(); i++) {
            System.out.printf("%d: %s\n", i + 1, fileContents.get(i));
        }

    }

    public static void main(String[] args) throws IOException {

        Path filePathToPoem = Paths.get("./src/fileIO/wcw.txt");

        Path sameDirectoryPath = Paths.get("../wcw/txt");

        System.out.println("filePathToPoem = " + filePathToPoem);

        System.out.println(Files.exists(filePathToPoem));
        System.out.println(Files.exists(sameDirectoryPath));

        printPoem(filePathToPoem);

        Path groceriesTxtPath = Paths.get("./src/fileIO/groceries.txt");

        System.out.println("groceriesTxtPath = " + groceriesTxtPath);

        List<String> groceries = Arrays.asList("coffee", "milk", "sugar");
        System.out.println("groceries = " + groceries);

        Files.write(groceriesTxtPath, groceries);

        System.out.println();

        List<String> groceryListWithEggs = Files.readAllLines(groceriesTxtPath);

        for (int i = 0; i < groceryListWithEggs.size(); i++) {
            System.out.println((i + 1) + ": " + groceryListWithEggs.get(i));
        }

        List<String> lines = Files.readAllLines(groceriesTxtPath);
        List<String> newList = new ArrayList<>();

        for (String line : lines) {
            if (line.equals("milk")) {

            }
        }

    }
}
