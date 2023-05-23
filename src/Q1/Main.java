package Q1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            List<String> fromFile = new ArrayList<>();

            // Read file
            List<String> lines = Files.readAllLines(Paths.get("./src/Q1/call_of_the_wild.txt"));

            lines.forEach(line -> {
                if (line.length() != 0) fromFile.addAll(Arrays.asList(line.trim().split("\\s+")));
            });

            // Sort
            fromFile.sort(Comparator.comparingInt(String::length).reversed());

            System.out.println("The first occurrence of the longest word is: " + fromFile.get(0));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}