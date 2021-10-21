package problems;

/**
 * Created by mrahman on 04/22/17.
 */
public class Permutation {

    public static void main(String[] args) {

        /*
         * Permutation of String "ABC" is "ABC" "BAC" "BCA" "ACB" "CAB" "CBA".
         * Write Java program to compute all Permutation of a String
         *
         */
        permutation("OCD");
    }

    private static void permutation(String st) {
        printPermutation(st, "");
    }

    private static void printPermutation(String st1, String permutation) {

        if (st1.length() == 0) {
            System.out.print(permutation+" ");
            return;
        }

        for (int i = 0; i < st1.length(); i++) {
            char toAppendToPermutation = st1.charAt(i);
            String remaining = st1.substring(0, i) + st1.substring(i + 1);

            printPermutation(remaining, permutation + toAppendToPermutation);
        }

    }
}
