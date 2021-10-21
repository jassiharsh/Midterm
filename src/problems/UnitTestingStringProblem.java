package problems;

import org.testng.Assert;

import java.util.HashSet;
import java.util.Set;

public class UnitTestingStringProblem {
    public static void main(String[] args) {

        try {
            Assert.assertEquals(Anagram.isAnagram("rat", "tar"), true);
            System.out.println("Anagram Unit Test Passed.");
        } catch (AssertionError as) {
            System.out.println("Anagram Unit Test Failed!!!!");
        }

        try {
            String a = "Honesty Is The Best Policy";
            Assert.assertEquals(DetermineLargestWord.largestWord(a), "Honesty");
            System.out.println("Determine Largest Value Unit Test Passed.");
        } catch (AssertionError as) {
            System.out.println("Determine Largest Value Unit Test Failed!!!.");
        }

        try {
            Set<String> set = new HashSet<>();
            set.add("Java");
            set.add("is");
            String test = "Java is a programming Language. Java is also an Island of Indonesia";
            Assert.assertEquals(DuplicateWord.duplicateWords(test), set);
            System.out.println("Duplicate Word Unit Test Passed.");
        } catch (AssertionError as) {
            System.out.println("Duplicate Word Unit Test Failed!!!.");
        }

        try {
            String test = "AMERICA";
            boolean expected = false;
            Assert.assertEquals(Palindrome.isPalindrome(test), expected);
            System.out.println("Palindrome Unit Test Passed.");
        } catch (AssertionError as) {
            System.out.println("Palindrome Unit Test Failed.");
        }

    }
}
