import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String [] args){
    Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int max = 0;
            int n = in.nextInt();
            int k = in.nextInt();
            for (int a = 1; a < n-1; a++) {
                for (int b = a+1; b <= n; b++) {
                    int val = a&b;
                    if (val > max && val < k) 
                        max = val;                    
                }    
            }
            System.out.println(max);
        }

}
}
