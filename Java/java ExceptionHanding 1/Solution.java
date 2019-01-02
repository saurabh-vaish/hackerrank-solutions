/*
You will be given two integers  and  as input, you have to compute . If  and  are not  bit signed integers or if  is zero, exception will occur and you have to report it. Read sample Input/Output to know what to report in case of exceptions.

Sample Input 0:

10
3
Sample Output 0:

3
Sample Input 1:

10
Hello
Sample Output 1:

java.util.InputMismatchException
Sample Input 2:

10
0
Sample Output 2:

java.lang.ArithmeticException: / by zero
Sample Input 3:

23.323
0
Sample Output 3:

java.util.InputMismatchException

*/

/*

author : saurabh vaish

*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        

        try{
            int x =sc.nextInt();
             int y = sc.nextInt();
            System.out.println(x/y);
        }
        catch(ArithmeticException ea)
        {
            System.out.println("java.lang.ArithmeticException: / by zero");
        }
        catch(InputMismatchException e)
        {
            System.out.println("java.util.InputMismatchException");
        }
        
    }
}

