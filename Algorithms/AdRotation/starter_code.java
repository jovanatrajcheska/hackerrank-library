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
     * Complete the 'changeAds' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER base10 as parameter.
     */

    public static int changeAds(int base10) {
        // Write your code here
        StringBuilder binaryFormat = new StringBuilder();
        while (base10 > 0){
            int remain = base10 % 2;
            binaryFormat.insert(0, remain);
            base10 /= 2;
        }
        String binaryNumber = binaryFormat.toString();
        StringBuilder reversedBinary = new StringBuilder();
        for(int i = 0; i < binaryNumber.length(); i++){
            if(binaryNumber.charAt(i) == '0')
                reversedBinary.append('1');
            else reversedBinary.append('0');

        }
        String reversed = reversedBinary.toString();
        int decimalNum = 0;
        int pow = 0;
        for(int i = reversed.length()-1; i >= 0; i--){
            int digit = Character.getNumericValue(reversed.charAt(i));
            decimalNum += digit * Math.pow(2,pow);
            pow++;
        }
        return decimalNum;
    }

}


public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int base10 = Integer.parseInt(bufferedReader.readLine().trim());

        int result = Result.changeAds(base10);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}