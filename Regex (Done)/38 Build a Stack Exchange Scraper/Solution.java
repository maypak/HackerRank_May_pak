import java.io.*;
import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        StringBuilder builder = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        
        while (sc.hasNextLine()){
            builder.append(sc.nextLine() + "\n");
        }
      
        Pattern p = Pattern.compile(
                "href=\"\\/questions\\/(\\d+)\\/.+?>(.+?)<\\/a>(?:.+?)\"relativetime\">(.+?)<\\/span>", Pattern.DOTALL);
        Matcher m = p.matcher(builder.toString());

        while (m.find()) {
            System.out.println(m.group(1) + ";" + m.group(2) + ";" + m.group(3));
        }
    }
}