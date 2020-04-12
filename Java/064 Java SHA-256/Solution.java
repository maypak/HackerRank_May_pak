import java.io.*;
import java.util.*;
import java.math.BigInteger;
import java.security.MessageDigest;


public class Solution {

    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        byte[] messageDigest = md.digest(string.getBytes());
        BigInteger no = new BigInteger(1, messageDigest);
        String hashtext = no.toString(16);
        while (hashtext.length() < 64) {
            hashtext = "0" + hashtext;
        }
        System.out.println(hashtext);
   
        sc.close();
    }
}