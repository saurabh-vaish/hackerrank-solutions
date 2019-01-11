/*

Given a base-10 integer, n , convert it to binary (base-2). Then find and print the base-10 integer denoting the maximum number of consecutive 1's in n's binary representation.

Input Format

A single integer, n .


Output Format

Print a single base-10 integer denoting the maximum number of consecutive 1's in the binary representation of n.

Sample Input 1

5
Sample Output 1

1
Sample Input 2

13
Sample Output 2

2
Explanation

Sample Case 1: 
The binary representation of 5 is 101 , so the maximum number of consecutive 's is 1 .

Sample Case 2: 
The binary representation of 13 is 1101 , so the maximum number of consecutive 's is 2 .

*/

/*

@ author : saurabh vaish

*/

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
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
         int count=0;
        String s = Integer.toBinaryString(n);  //convert to binary
        //System.out.println(s);
        String binary[] = s.split("0");  //split on basis of 0 
        //System.out.println(binary.length);
        for(int i = 0; i < binary.length; i++) {
            count = binary[i].length() > count ? binary[i].length() : count;    //check length of string of binary array is greater than count store it to count 
        }
            System.out.println(count);
        scanner.close();
    }
}
