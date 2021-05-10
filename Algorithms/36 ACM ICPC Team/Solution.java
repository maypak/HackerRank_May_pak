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
     * Complete the 'acmTeam' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts STRING_ARRAY topic as parameter.
     */

    public static List<Integer> acmTeam(List<String> topic) {
    // Write your code here
        char[] c1 = null;
        char[] c2 = null;
        int teamCount = 0;
        int finalTopicCount = 0;
        Map<Integer,Integer> map = new HashMap();
        
        for(int i = 0; i<topic.size(); i++)
        {
            for(int j = i+1 ; j<topic.size(); j++)
            {
                int topicCount = 0;
                c1 = topic.get(i).toCharArray();
                c2 = topic.get(j).toCharArray();
                
                for(int k = 0; k<c1.length; k++)
                {
                    if((c1[k] == '1' && c2[k] == '1') ||(c1[k] == '0' && c2[k] == '1')
                            || (c1[k] == '1' && c2[k] == '0'))
                    {
                        topicCount++;
                    }
                }
                if(topicCount >= finalTopicCount)
                {
                    finalTopicCount = topicCount;
                    teamCount++;
                    map.put(teamCount, finalTopicCount);
                }
            }
        }
        
        int finalCount = 0;
        for(Map.Entry<Integer,Integer> entry : map.entrySet())
        {
            if(entry.getValue() == finalTopicCount)
            {
                finalCount++;
            }
        }
        
        java.util.List<Integer> resultList = new ArrayList<Integer>();
        resultList.add(finalTopicCount);
        resultList.add(finalCount);
    
        return resultList;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int m = Integer.parseInt(firstMultipleInput[1]);

        List<String> topic = IntStream.range(0, n).mapToObj(i -> {
            try {
                return bufferedReader.readLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .collect(toList());

        List<Integer> result = Result.acmTeam(topic);

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
