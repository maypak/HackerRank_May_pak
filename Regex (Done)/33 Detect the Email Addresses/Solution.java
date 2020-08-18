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

        while(n-->0){
            sb.append(br.readLine()).append("\n");
        }

        Pattern p=Pattern.compile("(\\W|\\b)+([\\w\\.]+@[^\\s]+)(\\b)+");
        TreeSet<String> set=new TreeSet<>();
        Matcher m=p.matcher(sb.toString());

        while(m.find()){
            set.add(m.group(2));
        }

        boolean f=false;
        
        for(String s:set)
            {
                if(f)
                    System.out.print(";"+s);
                else
                    System.out.print(s);
                f=true;
            }
    }
}