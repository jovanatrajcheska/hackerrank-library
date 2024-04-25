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
     * Complete the 'getOneBits' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER n as parameter.
     */

     public static List<Integer> getOneBits(int n) {
        // Write your code here
        StringBuilder binaryFormat = new StringBuilder();
        while(n > 0){
            int remain = n % 2;
            binaryFormat.insert(0, remain);
            n /= 2;
        }
        int counterBits = 0;
        List<Integer> positions = new ArrayList<>();
        String binaryNum =  binaryFormat.toString();
        for(int i = 0; i < binaryNum.length(); i++){
            if(binaryNum.charAt(i) == '1') {
                counterBits++;
                positions.add(i+1);
            }

        }
        positions.add(0, counterBits);
        return positions;
    }

}


public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> result = Result.getOneBits(n);

        bufferedWriter.write(
            result.stream()
                .map(Object::toString)
                .collect(joining("\n"))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}