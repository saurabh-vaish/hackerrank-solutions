//Problem: https://www.hackerrank.com/challenges/java-end-of-file
//Java 7


import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count=1;
        while(sc.hasNext())   // Scanner.hasNext() checks if there is new input is or not ,returns boolean and we can also check pattern with it.
        {
            System.out.println(count++ +" "+sc.nextLine());
        }
    }
}

