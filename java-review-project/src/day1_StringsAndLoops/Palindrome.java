package src.day1_StringsAndLoops;

public class Palindrome {

    public static void main(String[] args) {


        System.out.println("isPalindrome :: " + ifPalindrome(" Marge let a moody baby doom a telegram."));

    }

    public static boolean ifPalindrome(String s) {

        s = s.toLowerCase().replaceAll("[^a-z0-9]", "").replace(" ", "");
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
