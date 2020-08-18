import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Solution {

    private static String[] queries;
    private static String[] sentences;

    public static void main(String[] args) {
        initArrays();

        Arrays.stream(queries)
          .forEach(query -> {
            String regex = "(?<=\\w)(" + query + ")(?=\\w)";
            Pattern pattern = Pattern.compile(regex);
            
            long matchCount = Arrays.stream(sentences)
                .flatMap(x -> Arrays.stream(x.split("\\W")))
                .map(pattern::matcher)
                .filter(Matcher::find)
                .map(Matcher::group)
                .count();

            System.out.println(matchCount);
        });     
    }

    private static void initArrays() {
        Scanner scanner = new Scanner(System.in);

        int setencesSize = Integer.parseInt(scanner.nextLine());
        
        sentences = new String[setencesSize];
        IntStream.range(0, setencesSize).forEach(i -> sentences[i] = scanner.nextLine());

        int queriesSize = Integer.parseInt(scanner.nextLine());

        queries = new String[queriesSize];

        IntStream.range(0, queriesSize).forEach(i -> queries[i] = scanner.nextLine());
        
        scanner.close();
    }
}