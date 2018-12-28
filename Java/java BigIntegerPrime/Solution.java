/*
Input Format

A single line containing an integer, n (the number to be checked).

Constraints

n contains at most 100 digits.
Output Format

If  is a prime number, print prime; otherwise, print not prime.

Sample Input

13
Sample Output

prime

*/

/*
@ author : saurabh vaish;

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
        String n = scanner.nextLine();
        BigInteger b1 = new BigInteger(n);
        boolean ans = b1.isProbablePrime(10);
        // here we have passed 10 bcs it gives true if probability (1-1/2^n) <=0 where n is the probability number i.e. 10
        if(ans){
            System.out.println("prime");
        }
        else
        {
            System.out.println("not Prime");
        }
        scanner.close();
    }
}
