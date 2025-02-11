public class CharAtExample {
    public static void main(String[] args) {
        String str = "Hello, World!";

        // Get the character at index 0
        char charAtIndex0 = str.charAt(0);
        System.out.println("Character at index 0: " + charAtIndex0); // Output: H

        // Get the character at index 7
        char charAtIndex7 = str.charAt(7);
        System.out.println("Character at index 7: " + charAtIndex7); // Output: W

        // Get the character at index 12
        char charAtIndex12 = str.charAt(12);
        System.out.println("Character at index 12: " + charAtIndex12); // Output: !

        // Trying to access an index out of the string's range will throw an exception
        // Uncommenting the following line will cause StringIndexOutOfBoundsException
        // char charAtInvalidIndex = str.charAt(20);
        //hello.......
    }
}
