import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        scan.close();
        
        if (s.trim().length() == 0) {
        	int n = 0;
        	System.out.println(n);
        }
        
        else {
        
           	String[] tokens = s.trim().split("[^A-Za-z]+");
        	int n = tokens.length;
        	System.out.println(n);
        	for(int i = 0; i < n; i++){
            System.out.println(tokens[i]);
        	}
        }
    }
}

