public class CharAtExample4 {
    public static void main(String[] args) {
        String str = "Hello, World!";
        int vowelCount = 0;

        // Check for vowels in the string
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                    ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                vowelCount++;
            }
        }

        System.out.println("Number of vowels in the string: " + vowelCount); // Output: 3
    }
}
