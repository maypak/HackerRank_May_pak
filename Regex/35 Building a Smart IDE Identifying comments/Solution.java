import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Solution {

    public static void main(String[] args) throws IOException{
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder("");
        String s="";

        while((s=br.readLine())!=null){
            sb.append(s.trim()).append("\n");
        }

        Pattern p=Pattern.compile("(\\/\\/.*|\\/\\*[\\*]?[^(\\*\\/)]+[^\\/]+.)");
        Matcher m=p.matcher(sb.toString());

        while(m.find()){
            System.out.println(m.group(1));
        }
    }
}