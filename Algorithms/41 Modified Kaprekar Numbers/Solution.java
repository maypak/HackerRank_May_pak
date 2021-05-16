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
     * Complete the 'kaprekarNumbers' function below.
     *
     * The function accepts following parameters:
     *  1. INTEGER p
     *  2. INTEGER q
     */

    public static void kaprekarNumbers(int p, int q) {
    // Write your code here
        int count = 0;
        String b;
        for(int i = p ; i <= q ; i++){
            BigInteger pow = new BigInteger(String.valueOf((long)Math.pow(i, 2)));
            if(Long.parseLong(String.valueOf(pow)) < 10){ b = "0" + String.valueOf(pow); }
            else{ b = String.valueOf(pow); }
            if(String.valueOf(b).length()>1){
                if(Integer.parseInt(b.substring(0,b.length()/2)) + Integer.parseInt(b.substring(b.length()/2)) == i){
                    System.out.print(i+" ");
                    count = 1;
                }
            }
        }
        if(count == 0){ 
            System.out.println("INVALID RANGE"); 
        }
        
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int p = Integer.parseInt(bufferedReader.readLine().trim());

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        Result.kaprekarNumbers(p, q);

        bufferedReader.close();
    }
}
