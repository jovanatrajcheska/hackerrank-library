import java.io.*;


class Result {

    /*
     * Complete the 'lastLetters' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING word as parameter.
     */

    public static String lastLetters(String word) {
        // Write your code here
        return word.charAt(word.length() - 1) + " " + word.charAt(word.length() - 2);

        // StringBuilder stringBuilder = new StringBuilder();
        // stringBuilder.append(word.charAt(word.length()-1)).append(" ").append(word.charAt(word.length()-2));
        // return stringBuilder.toString();
    }


}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        String word = bufferedReader.readLine();

        String result = Result.lastLetters(word);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
