/*

Java's BigDecimal class can handle arbitrary-precision signed decimal numbers. Let's test your knowledge of them!

Given an array, , of  real number strings, sort them in descending order — but wait, there's more! Each number must be printed in the exact same format as it was read from stdin, meaning that  is printed as , and  is printed as . If two numbers represent numerically equivalent values (e.g., ), then they must be listed in the same order as they were received as input).

Complete the code in the unlocked section of the editor below. You must rearrange array 's elements according to the instructions above.

Input Format

The first line consists of a single integer, , denoting the number of integer strings. 
Each line  of the  subsequent lines contains a real number denoting the value of .

Output Format

Locked stub code in the editor will print the contents of array  to stdout. You are only responsible for reordering the array's elements.

Sample Input

9
-100
50
0
56.6
90
0.12
.12
02.34
000.000
Sample Output

90
56.6
50
02.34
0.12
.12
0
000.000
-100

*/

/*
@ author : saurabh vaish 

*/

import java.math.BigDecimal;
import java.util.*;
class Solution{
    public static void main(String []args){
        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
        sc.close();
		
		// for sorting we are using Arrays.sort() method but it sort in accending order 
		// we have to sort in decending order so we are using Collections.reverse() method
		// since String [] has size n+2 , so we are giving range to sort() method manually as 0 to n .
		// since the sorting should be as BigDecimal number  are so we first convert string to BigDecimal then 
		// write Constructor Comparator to to compare these numbers.

        Arrays.sort(s,0,n,Collections.reverseOrder(new Comparator<String>() {
            @Override
            public int compare(String t1, String t2) {
                BigDecimal b1 = new BigDecimal(t1);   // string to BigDecimal obj. foramt 
                BigDecimal b2 = new BigDecimal(t2);
                return b1.compareTo(b2);  // comapare 1st obj with 2nd then return -1 , 0 ,1 .
            }
        }));
       
        //Output
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    }
}
