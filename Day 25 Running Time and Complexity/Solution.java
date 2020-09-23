import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    private static boolean isPrime(int num){
        double sqrt = Math.sqrt(num);
        if(num <= 1)
            return false;
        else{
            for(int i=2;i<=sqrt;i++){
                if(num % i == 0)
                    return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        /* Enter your code here. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] a = new int [n];

        for(int i=0;i<n;i++)
            a[i] = sc.nextInt();

        for(int i=0;i<n;i++){
            if(isPrime(a[i]))
                System.out.println("Prime");
            else
                System.out.println("Not prime");
        }

    }
}



