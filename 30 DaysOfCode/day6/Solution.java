/*

Task 
Given a string, S, of length N  that is indexed from 0 to N-1 , print its even-indexed and odd-indexed characters as 2 space-separated strings on a single line (see the Sample below for more detail).

Note: 0 is considered to be an even index.

Input Format

The first line contains an integer,T  (the number of test cases). 
Each line i of the T subsequent lines contain a String,S .


Output Format

For each String S , print S's even-indexed characters, followed by a space, followed by 's odd-indexed characters.

Sample Input

2
Hacker
Rank
Sample Output

Hce akr
Rn ak

*/

/*

author :Saurabh vaish

*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       String s[] = new String[n];
       for(int i=0;i<n;i++)
         s[i] = sc.next();
        
      
        for(int i=0;i<s.length;i++)
        {
            String even="";String odd="";
            String s1=s[i];
            for(int j=0;j<s1.length();j++)
            {
                if(j==0||j%2==0)
                {
                    even +=s1.charAt(j);
                }
                else
                {
                    odd +=s1.charAt(j);
                }
            }
            System.out.println(even+" "+odd);
        }
    }
}

