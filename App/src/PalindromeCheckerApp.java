public class PalindromeCheckerApp {

    public static void main(String[] args) {
        String input = "radar";
        String reversed = "";

        // Iterate from the last character to the first
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }

        boolean isPalindrome = input.equals(reversed);

        System.out.println("Original String: " + input);
        System.out.println("Reversed String: " + reversed);
        System.out.println("Is Palindrome: " + isPalindrome);
    }
}