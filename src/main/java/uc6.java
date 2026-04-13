package org.example;

public class uc6 {
    public static void main(String[] args) {

        // If no names are provided
        if (args.length == 0) {
            System.out.println("Hello, World!");
            return;
        }

        // Use StringBuilder to store names
        StringBuilder nameBuilder = new StringBuilder();

        // Enhanced for loop
        for (String name : args) {
            nameBuilder.append(name).append(", ");
        }

        // Remove trailing ", "
        String result = nameBuilder.substring(0, nameBuilder.length() - 2);

        // Display output
        System.out.println("Hello, " + result + "!");
    }
}
