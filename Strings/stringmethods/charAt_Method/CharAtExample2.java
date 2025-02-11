public class CharAtExample2 {
    public static void main(String[] args) {
        String str = "Java programming";
        char ch = 'a';
        boolean found = false;

        // Check if the character 'a' exists in the string
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                found = true;
                System.out.println("Character '" + ch + "' found at index " + i);
            }
        }

        if (!found) {
            System.out.println("Character '" + ch + "' not found in the string.");
        }
    }
}
