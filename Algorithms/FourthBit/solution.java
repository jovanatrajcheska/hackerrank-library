import java.io.*;

class Result {

    /*
     * Complete the 'fourthBit' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER number as parameter.
     */

    public static int fourthBit(int number) {
        // Write your code here
        StringBuilder binaryNum = new StringBuilder();
        while(number > 0){
            int remain = number % 2;
            binaryNum.insert(0, remain);
            number /= 2;
        }
        int digit = 0;
        String binary = binaryNum.toString();
        if(binary.charAt(binary.length()-4) == '1') digit = 1;

        return digit;
    }

}


public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int number = Integer.parseInt(bufferedReader.readLine().trim());

        int result = Result.fourthBit(number);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
