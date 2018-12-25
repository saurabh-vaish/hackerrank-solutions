
//A palindrome is a word, phrase, number, or other sequence of characters which reads the same backward or forward.(Wikipedia)
//Given a string , print Yes if it is a palindrome, print No otherwise.
//
//Constraints
// will consist at most  lower case english letters.


//Sample Input
//
//madam
//Sample Output
//
//Yes

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        StringBuffer sb = new StringBuffer(A);
        String B = sb.reverse().toString();

        if(A.compareTo(B)==0)
        {
            System.out.println("Yes");
        }
        else
        System.out.println("No");
    }
}



