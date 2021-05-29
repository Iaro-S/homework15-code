package ro.fasttrackit.homework15;

public class Recursivitate {
    public int sumFirstInteger(int n) {
        if (n == 0 || n == 1) {
            return n;
        } else {
            return sumFirstInteger(n - 1) + n;
        }
    }

    public int sumFirstEven(int n) {
        if (n == 0) {
            return 0;
        } else {
            return (2 * n) + sumFirstEven(n - 1);
        }
    }

    public int sumNumberDigits(int n) {
        if (n < 10) {
            return n;
        } else {
            return sumNumberDigits(n / 10) + n % 10;
        }
    }

    public String reversedPalindrome(String word) {
        if (word == null || "".equals(word)) {
            return "";
        } else {
            return reversedPalindrome(word.substring(1)) + word.charAt(0);
        }
    }

    public boolean ckeckPalindrome(String word) {
        if (word.length() == 0 || word.length() == 1) {
            return true;
        } else if (word.charAt(0) == word.charAt(word.length() - 1)) {
            return ckeckPalindrome(word.substring(1, word.length() - 1));
        }
        return false;
    }
}
