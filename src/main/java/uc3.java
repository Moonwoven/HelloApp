package org.example;

public class uc3 {
    public static void main(String[] args) {

        String name = "World"; // default value

        // Check if user provided argument
        if (args.length > 0) {
            name = args[0];
        }

        System.out.println("Hello, " + name + "!");
    }
}
