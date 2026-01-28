public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        System.out.println("Generating random numbers:");
        for (int i = 0; i < 5; i++) {
            int randomNum = (int)(Math.random() * 100);
            System.out.println("Random Value " + (i + 1) + ": " + randomNum);
        }
        System.out.println("Done.");
    }
}