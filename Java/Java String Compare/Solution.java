
//Given a string, find out the lexicographically smallest and largest substring of length .
//


//Input Format
//
//First line will consist a string containing english alphabets which has at most  characters. 2nd line will consist an integer .
//
//Output Format
//
//In the first line print the lexicographically minimum substring. 
//In the second line print the lexicographically maximum substring.


//Sample Input
//
//welcometojava
//3
//Sample Output
//
//ava
//wel
//Explanation


//Here is the list of all substrings of length 3:
//
//wel
//elc
//lco
//com
//ome
//met
//eto
//toj
//oja
//jav
//ava

import java.util.Scanner;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        String s1="";
        for(int i=0;i<=s.length()-k;i++)
        {
         s1 += s.substring(i,i+k)+" ";
        }
        String st[] = s1.trim().split(" ");
        smallest = st[0];
        largest = st[0];
        for(int i=0;i<st.length;i++)
        {
            if(st[i].compareTo(smallest)<0)
            {
                smallest =st[i];
            }
            if(st[i].compareTo(largest)>0)
            {
                largest =st[i];
            }
        }


        return smallest + "\n" + largest;
    }

		public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
 

}


//  or  using collection  // 

import java.util.*;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        SortedSet<String> set = new TreeSet<String>();
        for(int i=0;i<=s.length()-k;i++)
        {
          set.add(s.substring(i,i+k));
        }
        
        smallest = set.first();
        largest = set.last();

        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}