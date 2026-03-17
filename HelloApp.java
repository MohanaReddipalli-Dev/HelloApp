public class HelloApp {
    public static void main(String[] args) {
        // Check if command-line arguments are provided
        if (args.length == 0) {
            // No arguments, display default greeting
            System.out.println("Hello, World!");
        } else {
            // Arguments exist, join all names with commas and spaces
            String names = String.join(", ", args);
            // Display personalized greeting with all names
            System.out.println("Hello, " + names + "!");
        }
    }
}