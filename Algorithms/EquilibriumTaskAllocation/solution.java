package EquilibriumTaskAllocation;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;



class Result {

    /*
     * Complete the 'getMinimumOperations' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts INTEGER_ARRAY duration as parameter.
     */

    public static long getMinimumOperations(List<Integer> duration) {
        Collections.sort(duration);
        long[] backwards = new long[duration.size() + 1];

        for (int i = duration.size() - 1; i >= 0; i--) {
            backwards[i] = backwards[i + 1] + duration.get(i);
        }

        //long minOperationsNeeded  = Integer.MAX_VALUE;
        long minOperationsNeeded = (long) 1e18;
        long elementsSum = 0;

        for (int i = 0; i < duration.size(); i++) {
            minOperationsNeeded = Math.min(minOperationsNeeded, elementsSum + backwards[i] - (long) (duration.size() - i) * duration.get(i));
            elementsSum += duration.get(i);
        }

        return minOperationsNeeded;
    }

}


public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int durationCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> duration = IntStream.range(0, durationCount).mapToObj(i -> {
                    try {
                        return bufferedReader.readLine().replaceAll("\\s+$", "");
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                })
                .map(String::trim)
                .map(Integer::parseInt)
                .collect(toList());

        long result = Result.getMinimumOperations(duration);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
