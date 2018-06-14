import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();
        int m = in.nextInt();
        long max = 0;
        long sum = 0;
        
        long[] temp = new long[n+1];
        while(m-- > 0){
            int a = in.nextInt();
            int b = in.nextInt();
            long k = in.nextLong();
            temp[a-1] += k;
            temp[b] -= k;
        }
        
        for(long i : temp){
            sum += i;
            max = Math.max(max, sum);
        }
        in.close();
        System.out.println(max);
    }
}
