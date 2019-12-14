package src;

import src.solutions.BuildFilteredReverseString;
import src.solutions.RegexReplaceReverse;
import src.solutions.Solution;
import src.solutions.TwoPointers;

import java.util.Arrays;

public class SolutionRunner {
    public static void main(String[] args) {
        Solution[] solutions =
            new Solution[]{
                new BuildFilteredReverseString(),
                new RegexReplaceReverse(),
                new TwoPointers()
            };

        // add test cases
        var input = new String[]{
            "A man, a plan, a canal: Panama", "race a car", "a", "aa", "^ %$^*$*(%a(* )&)^", ".,"
        };

        boolean result;
        int errors = 0;
        int nTestCases = input.length;
        var output = Arrays.asList(true, false, true, true, true, true);

        assert(output.size() == nTestCases);

        for (Solution s : solutions) {
            for (int i = 0; i < nTestCases; i++) {

                result = s.isPalindrome(input[i]);

                if( !output.get(i).equals(result) ) {
                    System.out.println("Solution " + s.getClass().getCanonicalName() + " wrong for input " + input[i]);
                    System.out.println("Expected: " + output.get(i) + " but got: " + result);
                    System.out.println();
                    errors++;
                }
            }
        }
        printResults(errors, nTestCases);
    }

    private static void printResults(int errors, int nTestCases) {
        if(errors == 0) {
            System.out.println("All tests passed!");
        } else {
            System.out.println(nTestCases - errors + " tests passed.");
        }
        System.out.println(errors + " tests failed.");
        System.out.println((0.0 + nTestCases - errors) / nTestCases * 100  + "% of tests passed.");
    }
}

