import java.io.*;
import java.util.*;
import java.util.regex.Pattern;

public class Solution {

    public static void main(String[] args) throws IOException{
        /* Enter your code here.  Your class should be named Solution. */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int count = 0;
        while(n --> 0){
            String str = br.readLine();
            if(str.matches(".*(?i)hackerrank.*"))
                count++;
        }
        System.out.println(count);
    }
}