public class PalindromeCheckerApp {

    public static void main(String[] args) {
        String input = "madam";

        // Initial call to the recursive method
        boolean isPalindrome = check(input, 0, input.length() - 1);

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }

    private static boolean check(String s, int start, int end) {
        // Base Case 1: If pointers meet or cross, it is a palindrome
        if (start >= end) {
            return true;
        }

        // Base Case 2: If characters at current pointers don't match
        if (s.charAt(start) != s.charAt(end)) {
            return false;
        }

        // Recursive Step: Move pointers inward and check again
        return check(s, start + 1, end - 1);
    }
}