package edu.eci.cvds.patterns.archetype;

/**
 * The App class is the entry point for the Maven application.
 */
public class App {

    /**
     * Main method that processes input arguments and prints a greeting.
     * @param args command-line arguments (first name, last name).
     */
    public static void main(String[] args) {
        if (args.length == 1) {
            System.out.println("Hello, " + args[0] + "! Welcome to the Maven application.");
        } else if (args.length == 2) {
            System.out.println("Hello, " + args[0] + " " + args[1] + "! Welcome to the Maven application.");
        } else {
            System.out.println("Hello World!");
        }
    }
}
