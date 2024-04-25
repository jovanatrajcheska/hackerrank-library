import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;


class Result {

    /*
     * Complete the 'getMinDeletions' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING s as parameter.
     */

    // add every possible substring to a set, if substring in the set --> duplicate --> require deletion
    public static int getMinDeletionsDiffApproach(String s) {
        // Write your code here

        HashSet<String> substrings = new HashSet<>();
        int del = 0;

        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                String substring = s.substring(i, j);
                if (!substrings.add(substring)) {
                    del++;
                    break;
                }
            }
        }
        return del;
    }

    public static int getMinDeletions(String s) {
        // Write your code here

        HashSet<Character> characterIn = new HashSet<>();
        int del = 0;

        for (char c : s.toCharArray()) {
            if (!characterIn.add(c)) {
                del++;
            }
        }
        return del;
    }

}


public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        int result = Result.getMinDeletions(s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}