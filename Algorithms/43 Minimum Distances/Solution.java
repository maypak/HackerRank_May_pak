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
     * Complete the 'minimumDistances' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY a as parameter.
     */

    public static int minimumDistances(List<Integer> a) {
    // Write your code here
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
    
        int minimum_dist = Integer.MAX_VALUE;
        
        for(int i = 0; i < a.size(); i++){
            
            int num = a.get(i);
            
            if(!map.containsKey(num)){
                map.put(num,i);
            } else {
                int dist = i - map.get(num);
                map.remove(num);
                
                if(dist < minimum_dist){
                    minimum_dist = dist;
                }   
            }     
        }
        if(minimum_dist == Integer.MAX_VALUE) {
            return - 1;
        }

        return minimum_dist;
        
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int result = Result.minimumDistances(a);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
