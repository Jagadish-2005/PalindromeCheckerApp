public class PalindromeCheckerApp {

    public static void main(String[] args) {
        String input = "level";

        // Capture start time
        long startTime = System.nanoTime();

        // Execution of the palindrome logic
        boolean isPalindrome = checkPalindrome(input);

        // Capture end time
        long endTime = System.nanoTime();

        // Calculate total duration
        long duration = endTime - startTime;

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
        System.out.println("Execution Time : " + duration + " ns");
    }

    private static boolean checkPalindrome(String input) {
        int start = 0;
        int end = input.length() - 1;

        while (start < end) {
            if (input.charAt(start) != input.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}