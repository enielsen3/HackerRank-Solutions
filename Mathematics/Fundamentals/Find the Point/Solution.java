import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner reader = new Scanner(System.in);
        int count = reader.nextInt();
        int[] p = new int[4];
        int[] q = new int[2];
        for (int i=1; i<count++;i++){
            for(int j=1; j<5; j++){
                p[j-1] = reader.nextInt();                               
            }
            for(int k=1; k<3; k++){
                q[k-1]= 2*p[k+1]-p[k-1];
            }
            System.out.print(q[0]+" "+q[1]);
            System.out.println();
        }
    }
}
