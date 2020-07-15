import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {

    public static void main(String[] args) throws IOException{
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        StringBuilder sb=new StringBuilder("");
        
        while(n-->0){
            sb.append(br.readLine()).append(" ");
        }
        
        int k=Integer.parseInt(br.readLine());
        int count=0;
        while(k-->0){
            count=0;
            String str=br.readLine();
            Pattern p=Pattern.compile("(\\W|\\b)"+str+"(\\W|\\b)");
            Matcher m=p.matcher(sb.toString());
            while(m.find()){
                count++;
            // System.out.println("hh");
            }  
            System.out.println(count);
        }
    }
}