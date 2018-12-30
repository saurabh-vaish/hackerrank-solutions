/*


We will call a right angled triangle perfect if

it is a primitive right angled triangle
its hypotenuse is a perfect square
We will call a right angled triangle super-perfect if

it is a perfect right angled triangle and
its area is a multiple of the perfect numbers 6 and 28 .
How many perfect right-angled triangles with c<=n exist that are not super-perfect?

Input Format

First line of each test file contains a single integer q that is the number of queries. q lines follow, each containing an integer  n- an upper bound of the largest side of the triangle.

Constraints

1<=q<=100000
25<=n<=2*10^18

Output Format

Print exactly q lines with a single integer on each: an answer to the corresponding query.

Sample Input 0

1
25
Sample Output 0

0
Explanation 0

As we can see from the problem statement, the only perfect triangle with  is super-perfect.

*/

/*

author : saurabh vaish

*/

import java.io.*;
import java.util.*;

public class Problem218 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	int q=sc.nextInt();
	while(q>0)
	{
	System.out.println("0");
	q--;
	}
    }
}