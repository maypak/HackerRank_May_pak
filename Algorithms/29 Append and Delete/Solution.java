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
     * Complete the 'appendAndDelete' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. STRING s
     *  2. STRING t
     *  3. INTEGER k
     */

    public static String appendAndDelete(String s, String t, int k) {
    // Write your code here
        if(s.equals(t) && s.length() > k) {
            return k % 2 == 0 ? "Yes" : "No";
        }

        int actions = t.length();
        int length = s.length() > t.length() ? s.length() : t.length();

        int i = 0;
        for(; i < length; i++) {


            if(i == t.length()) {
                actions = s.length() -(i);
                break;
            }
            else if(i == s.length()) {
                actions = t.length() -(i);
                break;
            }
            else if(s.charAt(i) != t.charAt(i)) {
                actions = s.length() + t.length() - 2 * (i);
                break;
            }

        }


        return (k == actions) || (k > actions &&  (k >= (i+1) + t.length() || ((k - actions) % 2 == 0))) ? "Yes" : "No";
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String t = bufferedReader.readLine();

        int k = Integer.parseInt(bufferedReader.readLine().trim());

        String result = Result.appendAndDelete(s, t, k);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
