package org.example;

public class uc2 {
    public static void main(String[] args) {

        // Check if user provided a name
        if (args.length > 0) {
            String name = args[0];
            System.out.println("Hello, " + name + "!");
        } else {
            System.out.println("Please provide a name as argument");
        }
    }
}
