/*

A subarray of an -element array is an array composed from a contiguous block of the original array's elements. 
The sum of an array is the total sum of its elements.
An array's sum is negative if the total sum of its elements is negative.
An array's sum is positive if the total sum of its elements is positive.

Given an array of  integers, find and print its number of negative subarrays on a new line.

Input Format

The first line contains a single integer, n , denoting the length of array . 
The second line contains  space-separated integers describing each respective element,  in array .


Output Format

Print the number of subarrays of  having negative sums.

Sample Input

5
1 -2 4 -5 1
Sample Output

9

*/
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ar[] = new int[n];
        int count=0;
        sc.nextLine();
        String s[] = sc.nextLine().split(" ");

        for(int i=0;i<s.length;i++) {
            ar[i] = Integer.parseInt(s[i]);
           // System.out.println(ar[i]);
        }

        for (int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++) {
                sum = sum + ar[j];
                //System.out.print(sum+" ");
                if (sum < 0) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
