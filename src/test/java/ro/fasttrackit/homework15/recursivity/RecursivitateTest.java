package ro.fasttrackit.homework15.recursivity;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class RecursivitateTest {
    Recursivitate recursivitate;

    @BeforeEach
    void setup() {
        recursivitate = new Recursivitate();
    }

    @Test
    @DisplayName("sum of first n integer numbers works")
    void sumFirstInteger() {
        assertThat(recursivitate.sumFirstInteger(10)).isEqualTo(55);
        assertThat(recursivitate.sumFirstInteger(50)).isEqualTo(1275);
        assertThat(recursivitate.sumFirstInteger(100)).isEqualTo(5050);
    }

    @Test
    @DisplayName("sum of first n EVEN integers works")
    void sumFirstEven() {
        assertThat(recursivitate.sumFirstEven(10)).isEqualTo(110);
        assertThat(recursivitate.sumFirstEven(100)).isEqualTo(10100);
        assertThat(recursivitate.sumFirstEven(0)).isEqualTo(0);
    }

    @Test
    @DisplayName("sum of digits for a number works")
    void sumNumberDigits() {
        assertThat(recursivitate.sumNumberDigits(378)).isEqualTo(18);
        assertThat(recursivitate.sumNumberDigits(5)).isEqualTo(5);
        assertThat(recursivitate.sumNumberDigits(5876)).isEqualTo(26);
    }

    @Test
    @DisplayName("palindrome using  recursive string reverse works")
    void palindrome() {
        assertThat(recursivitate.reversedPalindrome("madam")).isEqualTo("madam");
        assertThat(recursivitate.reversedPalindrome("racecar")).isEqualTo("racecar");
        assertThat(recursivitate.reversedPalindrome("")).isEqualTo("");
        assertThat(recursivitate.reversedPalindrome(null)).isEqualTo("");
    }

    @Test
    @DisplayName("palindrome using  recursive check of first and last letter works")
    void palindrome2() {
        assertThat(recursivitate.ckeckPalindrome("madam")).isEqualTo(true);
        assertThat(recursivitate.ckeckPalindrome("racecar")).isEqualTo(true);
        assertThat(recursivitate.ckeckPalindrome("test")).isEqualTo(false);
        assertThat(recursivitate.ckeckPalindrome("")).isEqualTo(true);
        assertThat(recursivitate.reversedPalindrome(null)).isEqualTo("");
    }
}
