public class CharAtExample1 {
    public static void main(String[] args) {
        String str = "Hello, World!";

        // Iterate through the string and print each character
        for (int i = 0; i < str.length(); i++) {
            System.out.println("Character at index " + i + ": " + str.charAt(i));
        }
    }
}
