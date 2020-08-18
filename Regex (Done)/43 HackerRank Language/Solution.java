import java.io.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String g;
        int k;
        for(int i=0;i<n;i++)
        {
            k=scan.nextInt();
            g=scan.next();
            g=":"+g+":";
            Pattern p=Pattern.compile(g);
            Matcher m=p.matcher(":C:CPP:JAVA:PYTHON:PERL:PHP:RUBY:CSHARP:HASKELL:CLOJURE:BASH:SCALA:ERLANG:CLISP:LUA:BRAINFUCK:JAVASCRIPT:GO:D:OCAML:R:PASCAL:SBCL:DART:GROOVY:OBJECTIVEC:");
            if(m.find()){
                System.out.println("VALID");
            } else {
            System.out.println("INVALID");
            }
        }
    }
}