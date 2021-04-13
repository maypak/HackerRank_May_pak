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

class resultult {

    /*
     * Complete the 'climbingLeaderboard' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY ranked
     *  2. INTEGER_ARRAY player
     */

    public static List<Integer> climbingLeaderboard(List<Integer> ranked, List<Integer> player) {
        List<Integer> result = new ArrayList<>();
        TreeMap<Integer, Integer> rank = new TreeMap<>();
        int curr_rank = 1;
        rank.put(-Integer.MAX_VALUE, 0);
        rank.put(-ranked.get(0), curr_rank);
        for(int i=1; i < ranked.size(); i++) {
            if(ranked.get(i) < ranked.get(i-1)) {
                rank.put(-ranked.get(i), ++curr_rank);
            }
        }
        for(int i=0; i < player.size(); i++) {
            int curr = player.get(i);
            int lastGrade = rank.floorKey(-curr);
            if(lastGrade == -curr) {
                result.add(rank.get(lastGrade));
            } else if(lastGrade < -curr) {
                result.add(rank.get(lastGrade)+1);
            }
        }
        return result;   
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int rankedCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> ranked = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int playerCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> player = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> resultult = resultult.climbingLeaderboard(ranked, player);

        bufferedWriter.write(
            resultult.stream()
                .map(Object::toString)
                .collect(joining("\n"))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
