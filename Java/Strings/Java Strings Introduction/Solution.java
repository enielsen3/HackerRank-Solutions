import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int length = A.length() + B.length();
        int lex = A.compareTo(B);
        String lexS = null;
        if(lex<=0) {
            lexS = "No";
        }
        if(lex>0){
            lexS = "Yes";
        }
        String combine = A.substring(0,1).toUpperCase() + A.substring(1) + " " + B.substring(0,1).toUpperCase() + B.substring(1);
        
        System.out.println(length);
        System.out.println(lexS);
        System.out.println(combine);
    }
}
