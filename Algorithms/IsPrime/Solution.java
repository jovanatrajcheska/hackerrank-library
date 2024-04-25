import java.io.*;

class Result {
        public static int isPrime(long n) {
        // Write your code here
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return i;
            }
        }
        return 1;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        long n = Long.parseLong(bufferedReader.readLine().trim());

        int result = Result.isPrime(n);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}