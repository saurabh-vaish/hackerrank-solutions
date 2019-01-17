/* 
 * Enter your code here. Read input from STDIN. Print your output to STDOUT. 
 * Your class should be named CandidateCode.
*/

import java.io.*;
import java.util.*;
public class day2 {
    public static void main(String args[] ) throws Exception {

    	Scanner sc = new Scanner(System.in);
    	if(sc.hasNextInt())
         System.out.println("This input is of type Integer");
     else if(sc.hasNextFloat())
         System.out.println("This input is of type Float");
     else if(sc.hasNextLine())
		 System.out.println("This input is of type String");
	 else
         System.out.println("This is something else");
   }
}
