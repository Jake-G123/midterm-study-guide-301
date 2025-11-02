import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;


import org.junit.jupiter.api.Test;

public class PracticeTest {

    // TODO: Make more tests for maxDiff
    @Test
    void testMaxDiffPositiveAndNegative() {
        // Arrange
        int[] numbers = {8, -2, 9, -5};

        // Act
        int actual = Practice.maxDiff(numbers);

        // Assert
        // Largest: 9, Smallest: -5, Difference: 9 - -5 = 14
        assertEquals(14, actual);
    }
    @Test
    void testlongestWordNoneWithStartingLetter() {
        // Arrange
        char letter = 'z';
        ArrayList<String> words = new ArrayList<>();
        words.add("apple");
        words.add("blue");
        words.add("crow");

        // Act
        String actual = Practice.longestWord(words, letter);

        // Assert
        // no word starts with z, ""
        assertEquals("", actual);
    }
    @Test
    void testlongerAndShorterNoneLongerAndShorter() {
        // Arrange
        HashSet<String> words = new HashSet<>();
        words.add("apple");
        words.add("blue");
        words.add("crow");
        int n = 10;
        int m =10;

        // Act
        int actual = Practice.longerAndShorter(words, n, m);

        // Assert
        // no word can be larger and smaller than 10, 0
        assertEquals(0, actual);
    }
    @Test
    void testoddEvenDifPositiveNegativeNumbers() {
        // Arrange
        HashMap<Character,Integer> nums = new HashMap<>();
        nums.put('a', 8);
        nums.put('b', -2);
        nums.put('c', 9);
        nums.put('d', -5);

        // Act
        int actual = Practice.oddEvenDif(nums);

        // Assert
        // even = 2 (9,-2) odd = 2 (9,-5) 2-2 = 0
        assertEquals(0, actual);
    }
    @Test
    void testsecondLargestNegativeAndPositiveKeys() {
        // Arrange
        HashMap<Integer, String> nums = new HashMap<>();
        nums.put(8, "apple");
        nums.put(-2, "blue");
        nums.put(9, "crow");
        nums.put(-5, "dog");

        // Act
        int actual = Practice.secondLargest(nums);

        // Assert
        // Largest: 9, secondLargest: 8, 8
        assertEquals(8, actual);
    }
    

    // TODO: Make tests for each problem you solve
    
}


