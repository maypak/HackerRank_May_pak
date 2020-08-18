import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {

    public static void main(String[] args) throws IOException {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int numberOfInput = Integer.parseInt(scanner.nextLine());
        String sentence = "";
        Pattern pattern = Pattern.compile("(http|https)://(www\\.|ww2\\.)?(([\\w-]+\\.)+[a-zA-Z]+)");
        TreeSet<String> domains = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        for (int i = 0; i < numberOfInput; i++) {
            sentence = scanner.nextLine();
            Matcher matcher = pattern.matcher(sentence);
            while (matcher.find()) {
                domains.add(matcher.group(3));
            }
        }
        String result = String.join(";", domains);
        System.out.print(result);
    }
}