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
     * Complete the 'encryption' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String encryption(String s) {
    // Write your code here
        String s_data = s.replaceAll(" ","");
        int s_data_length = s_data.length();
        int s_floor = (int) Math.floor(Math.sqrt(s_data_length));
        int s_ceil = (int) Math.ceil(Math.sqrt(s_data_length));
        int k = 0;
        String encrypted = "";
    
        while(true){
            if( k == s_ceil ){ break; }
            for(int i = k; i < s_data_length; i += s_ceil){  
                encrypted += s_data.charAt(i); 
            }            
            encrypted += " "; 
            k++;
        }
        return encrypted;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.encryption(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
