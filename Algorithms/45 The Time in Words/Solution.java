import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.HashMap;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'timeInWords' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER h
     *  2. INTEGER m
     */


    static Map<Integer, String> hours = new HashMap<>();
    static {        
        hours.put(1, "one");
        hours.put(2, "two");
        hours.put(3, "three");
        hours.put(4, "four");
        hours.put(5, "five");
        hours.put(6, "six");
        hours.put(7, "seven");
        hours.put(8, "eight");
        hours.put(9, "nine");
        hours.put(10, "teen");
        hours.put(11, "eleven");
        hours.put(12, "twelve");
    }

    static Map<Integer, String> minutes = new HashMap<>();
    static {        
        minutes.put(1, "one minute");
        minutes.put(2, "two minutes");
        minutes.put(3, "three minutes");
        minutes.put(4, "four minutes");
        minutes.put(5, "five minutes");
        minutes.put(6, "six minutes");
        minutes.put(7, "seven minutes");
        minutes.put(8, "eight minutes");
        minutes.put(9, "nine minutes");
        minutes.put(10, "teen minutes");
        minutes.put(11, "eleven minutes");
        minutes.put(12, "twelve minutes");
        minutes.put(13, "thirteen minutes");
        minutes.put(14, "fourteen minutes");
        minutes.put(15, "quarter");
        minutes.put(16, "sixteen minutes");
        minutes.put(17, "seventeen minutes");
        minutes.put(18, "eighteen minutes");
        minutes.put(19, "nineteen minutes");
        minutes.put(20, "twenty minutes");
        minutes.put(21, "twenty one");
        minutes.put(22, "twenty two minutes");
        minutes.put(23, "twenty three minutes");
        minutes.put(24, "twenty four minutes");
        minutes.put(25, "twenty five minutes");
        minutes.put(26, "twenty six minutes");
        minutes.put(27, "twenty seven minutes");
        minutes.put(28, "twenty eight minutes");
        minutes.put(29, "twenty nine minutes");
        minutes.put(30, "half");
    }
    public static String timeInWords(int h, int m) {
    // Write your code here
        if (m == 0) {
            return hours.get(h) + " o' clock";
        }

        if (m <= 30) {
            return minutes.get(m) + " past " + hours.get(h);
        }

        String hour = hours.get(h + 1);
        return minutes.get(60-m) + " to " + hour;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int h = Integer.parseInt(bufferedReader.readLine().trim());

        int m = Integer.parseInt(bufferedReader.readLine().trim());

        String result = Result.timeInWords(h, m);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
