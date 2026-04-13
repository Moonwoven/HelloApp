package org.example;

public class uc7 {
    public static void main(String[] args) {

        String names;

        // Check if arguments are provided
        if (args.length > 0) {
            names = String.join(", ", args); // join names with comma
            System.out.println("Hello, " + names + "!");
        } else {
            System.out.println("Hello, World!");
        }
    }
}
