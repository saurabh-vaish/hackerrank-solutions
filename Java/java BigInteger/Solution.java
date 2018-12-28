/*
In this problem, you have to add and multiply huge numbers! These numbers are so big that you can't contain them in any ordinary data types like a long integer.

Use the power of Java's BigInteger class and solve this problem.

Input Format

There will be two lines containing two numbers,  and .


Output Format

Output two lines. The first line should contain , and the second line should contain . Don't print any leading zeros.

Sample Input

1234
20
Sample Output

1254
24680

*/

/*
@ author : saurabh vaish;

*/


import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class Solution {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        String s1 = sc.next();
        String s2 = sc.next();
        BigInteger b1 = new BigInteger(s1);  // we can't use sc.nextInt() because the constructor accept string as arguments.
        BigInteger b2 = new BigInteger(s2);

        System.out.println(b1.add(b2));
        System.out.println(b1.multiply(b2));
    }
}

