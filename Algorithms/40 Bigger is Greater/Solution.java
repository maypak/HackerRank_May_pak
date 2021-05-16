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
     * Complete the 'biggerIsGreater' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING w as parameter.
     */

    public static String biggerIsGreater(String w) {
    // Write your code here
         String res = "";
         int ch = 0;
         char s[] = w.toCharArray();
         for(int i = s.length - 2; i >= 0; i--){
            if(s[i] < s[i + 1]){
                ch++;
                for(int j = s.length - 1 ; j >= i + 1; j--){
                    if(s[j] > s[i]){
                        char temp = s[i];
                        s[i] = s[j];
                        s[j] = temp;
                        break;
                    }
                }
                if(i != s.length - 2) {
                    Arrays.sort(s , i+1 ,s.length);
                }
                res = new String(s);
                break;
            }
        }
        if(ch == 0) {
            return "no answer";   
        } else {
            return res;
        }
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int T = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, T).forEach(TItr -> {
            try {
                String w = bufferedReader.readLine();

                String result = Result.biggerIsGreater(w);

                bufferedWriter.write(result);
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}
