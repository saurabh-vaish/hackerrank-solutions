//  Task 
//Given an integer, , perform the following conditional actions:
//
//If  is odd, print Weird
//If  is even and in the inclusive range of  to , print Not Weird
//If  is even and in the inclusive range of  to , print Weird
//If  is even and greater than , print Not Weird


//
//Input Format
//
//A single line containing a positive integer, .
//


//Output Format
//
//Print Weird if the number is weird; otherwise, print Not Weird.


//Sample Input 0
//
//3
//Sample Output 0
//
//Weird


//Sample Input 1
//
//24
//Sample Output 1
//
//Not Weird

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        if(N>=1&&N<=100)
        if(N%2==0)
        {
           if(N>=2&&N<=5)
           {
               System.out.println("Not Weird");
           }
           else if(N>=6&&N<=20)
           {
               System.out.println("Weird");
           }
           else if(N>20)
           {
               System.out.println("Not Weird");
           }
        }
        else
        {
             System.out.println("Weird");
        }

        scanner.close();
    }
}
