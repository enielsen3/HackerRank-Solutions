import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s=new Scanner(System.in);
        int n = s.nextInt();
        for(int i=1; i<n+1; i++){
            int a = s.nextInt();
            int b = s.nextInt();
            int terms = s.nextInt();
            double c= a;
            for(int j=1; j<terms+1; j++){
                c = c + Math.pow(2,j-1)*b;
                System.out.printf("%.0f ", c);
            }
            System.out.printf("%n");
        }   
    }
}
