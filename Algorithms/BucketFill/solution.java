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
     * Complete the 'strokesRequired' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING_ARRAY picture as parameter.
     */

    public static int strokesRequired(List<String> picture) {
        Map<String, List<String>> G = new HashMap<>();
        int rows = picture.size();
        int columns = picture.get(0).length();

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < columns; c++) {
                G.put(r + "," + c, new ArrayList<>());
            }
        }

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < columns; c++) {
                if (c + 1 < columns) {
                    if (picture.get(r).charAt(c + 1) == picture.get(r).charAt(c)) {
                        G.get(r + "," + c).add(r + "," + (c + 1));
                        G.get(r + "," + (c + 1)).add(r + "," + c);
                    }
                }
                if (r + 1 < rows) {
                    if (picture.get(r + 1).charAt(c) == picture.get(r).charAt(c)) {
                        G.get(r + "," + c).add((r + 1) + "," + c);
                        G.get((r + 1) + "," + c).add(r + "," + c);
                    }
                }
            }
        }

        Set<String> visited = new HashSet<>();
        int groups = 0;

        for (String k : G.keySet()) {
            if (visited.contains(k)) {
                continue;
            }
            Stack<String> Q = new Stack<>();
            Q.push(k);

            while (!Q.isEmpty()) {
                String node = Q.pop();
                if (visited.contains(node)) {
                    continue;
                }
                visited.add(node);
                Q.addAll(G.get(node));
            }
            groups++;
        }
        return groups;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int pictureCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> picture = IntStream.range(0, pictureCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .collect(toList());

        int result = Result.strokesRequired(picture);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
