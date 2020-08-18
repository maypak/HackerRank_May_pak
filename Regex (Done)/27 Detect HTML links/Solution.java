import java.io.*;
import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String html = sc.nextLine();

        for(int i = 0; i < n; i++) {
            html = sc.nextLine();
            Pattern p = Pattern.compile("<a .*?href=\"(.*?)\".*?>(.*?)((<.*/>)?)(<b>(.*?)</b>)?</a>");
            Matcher m = p.matcher(html);
            while(m.find()) {
                System.out.println(m.group(1) + "," + m.group(2).trim() + (m.group(6) != null ? m.group(6) : ""));
            }

        }

    }
}
