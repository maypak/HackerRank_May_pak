import java.io.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        sc.nextLine();

        String regex = "<(\\w+)([^>]*)>";
        String regexAttr = "\\s+(\\w+)=";

        Pattern p = Pattern.compile(regex);
        Pattern p2 = Pattern.compile(regexAttr);

        Map<String, Set<String>> map = new TreeMap();

        while (sc.hasNextLine()) {
            String line = sc.nextLine();

            Matcher m = p.matcher(line);

            while (m.find()) {

                String tag = m.group(1);

                Set<String> set = map.get(tag);
                if (set == null) {
                    set = new TreeSet();
                    map.put(tag, set);
                }

                String attrs = m.group(2);
                Matcher m2 = p2.matcher(attrs);
                while (m2.find()) {
                    String attr = m2.group(1);
                    set.add(attr);
                }
            }
        }

        for (String tag : map.keySet()) {

            Set<String> attrs = map.get(tag);

            String output = null;

            output = tag + ":" + 
                attrs.toString().replaceAll("\\[|\\]","").replace(" ", "");
            
            System.out.println(output);

        }

    }
}