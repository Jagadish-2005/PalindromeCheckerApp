public class PalindromeCheckerApp {

    public static void main(String[] args) {
        String input = "racecar";

        // Create an instance of the service class
        PalindromeService service = new PalindromeService();

        // Use the service to check the palindrome
        boolean isPalindrome = service.checkPalindrome(input);

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}

class PalindromeService {

    public boolean checkPalindrome(String input) {
        // Initialize pointers
        int start = 0;
        int end = input.length() - 1;

        // Compare characters moving inward
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