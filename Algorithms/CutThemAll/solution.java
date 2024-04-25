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
     * Complete the 'cutThemAll' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. LONG_INTEGER_ARRAY lengths
     *  2. LONG_INTEGER minLength
     */

    public static String cutThemAll(List<Long> lengths, long minLength) {
        long mx = 0;
        for (int i = 0; i < lengths.size() - 1; i++) {
            mx = Math.max(mx, lengths.get(i) + lengths.get(i + 1));
        }
        if (mx >= minLength) {
            return "Possible";
        } else {
            return "Impossible";
        }
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int lengthsCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Long> lengths = IntStream.range(0, lengthsCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine().replaceAll("\\s+$", "");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .map(String::trim)
            .map(Long::parseLong)
            .collect(toList());

        long minLength = Long.parseLong(bufferedReader.readLine().trim());

        String result = Result.cutThemAll(lengths, minLength);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

