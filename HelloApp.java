public class HelloApp {
    public static void main(String[] args) {
        StringBuilder greeting = new StringBuilder("Hello, ");

        if (args.length == 0) {
            greeting.append("World!");
        } else {
            for (String name : args) {
                greeting.append(name).append(", ");
            }
            if (greeting.length() > 0) {
                greeting.setLength(greeting.length() - 2); 
            }
            greeting.append("!");
        }

        System.out.println(greeting.toString());
    }
}