
import java.util.List;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;

public class Practice {
    /**
     * Returns the difference between the largest and smallest integer in an array.
     * 
     * @param nums a non-empty, non-null array of numbers
     * @return the difference between the largest and smallest number
     */
    public static int maxDiff(int[] nums) {
        int max = nums[0];
        int min = nums[0];
        for (int num : nums) {
            if (num>max) {
                max=num;
            }
            else if (num<min) {
                min=num;
            }
        }
        return max-min;
    }


    // TODO: Implement the other methods from the study guide AND tests for each one

    // For each method you are only required to implement it for one of the data
    // structures. But use a different data structure for each method. For example,
    // do maxDiff with an array, the next question with a Set, etc.

    //Find the longest word that starts with a specific character letter in

    public static String longestWord(ArrayList<String> words, char letter) {
        String longest = "";
        for (String word : words) {
            if(word.charAt(0) == letter && word.length() > longest.length()) {
                longest = word;
            }
        }
        return longest;
    }

    //Count how many words are longer than n characters and shorter than m characters in

    public static int longerAndShorter(HashSet<String> words, int n, int m) {
        int count=0;
        for (String word : words) {
            if(word.length() > n && word.length() < m) {
                count++;
            }
        }
        return count;
    }

    //Find the difference between the how many odd and even numbers there are in:

    public static int oddEvenDif(HashMap<String, Integer> nums) {
        int evenCount = 0;
        int oddCOunt = 0;
        for (HashMap.Entry<String, Integer> num : nums.entrySet()) {
            if (num.getValue() % 2 != 0) {
                oddCOunt++;
            } else {
                evenCount++;
            }
        }
        return (Math.abs(evenCount-oddCOunt));
    }

    // Find the second-largest number in:

    public static int secondLargest(HashMap<Integer, String> nums) {
        int largest = 0;
        int secondLargest = 0;
        for (HashMap.Entry<Integer, String> num : nums.entrySet()) {
            if (num.getKey() > largest) {
                secondLargest=largest;
                largest=num.getKey();
            } else if (num.getKey() > secondLargest) {
                secondLargest=num.getKey();
            }
        }
        return secondLargest;
    }
}