package StoringProcesses;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'getMaximumStorageEfficiency' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY num_segments
     *  2. LONG_INTEGER m
     */

    public static int getMaximumStorageEfficiency(List<Integer> num_segments, long m) {
        int lower = 1; // minimum number of segments in a storage space cannot be less than 1
        int higher = Collections.min(num_segments); // no memory space can store more segments than the smallest process
        int current = -1; // gets updated whenever a higher storage efficiency is found

        while (lower <= higher) {
            int mid = lower + (higher - lower) / 2;
            long can_fill = 0; // total num of segments

            for (int x : num_segments) {
                can_fill += x / mid;
            }

            if (can_fill >= m) {
                current = mid;
                lower = mid + 1;
            } else {
                higher = mid - 1;
            }
        }
        return current;
    }
}
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int num_segmentsCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> num_segments = IntStream.range(0, num_segmentsCount).mapToObj(i -> {
                    try {
                        return bufferedReader.readLine().replaceAll("\\s+$", "");
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                })
                .map(String::trim)
                .map(Integer::parseInt)
                .collect(toList());

        long m = Long.parseLong(bufferedReader.readLine().trim());

        int result = Result.getMaximumStorageEfficiency(num_segments, m);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
