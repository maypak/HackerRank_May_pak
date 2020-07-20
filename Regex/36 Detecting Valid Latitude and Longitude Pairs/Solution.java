import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {

    public static void main(String[] args) throws IOException {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        StringBuilder sb=new StringBuilder("");
        StringBuilder ans=new StringBuilder("");
        while(n-->0){
            String str=br.readLine();
            Pattern p=Pattern.compile("\\([\\-\\+]?(\\d|[1-8]\\d|90)(\\.[\\d]+)?\\,[ ]{1}[\\+\\-]?((\\d{1,2}|1[0-7]\\d)(\\.[\\d]+)?|180(\\.[0]+)?)\\)");
            Matcher m=p.matcher(str);
            if(m.find())
                System.out.println("Valid");
            else
                System.out.println("Invalid");
        }
    }
}
