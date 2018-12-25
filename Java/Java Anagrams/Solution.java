
//Two strings  and  are called anagrams if they consist same characters, but may be in different orders. So the list of anagrams of  is .
//
//Given two strings, print Anagrams if they are anagrams, print Not Anagrams if they are not. The strings may consist at most  English characters; the comparison should NOT be case sensitive.
//
//This exercise will verify that you can sort the characters of a string, or compare frequencies of characters.
//
//
//
//Sample Input 0
//
//anagram
//margana

//Sample Output 0
//
//Anagrams



//Sample Input 1
//
//anagramm
//marganaa

//Sample Output 1:
//
//Not Anagrams



import java.util.Scanner;

public class Solution {

    static  boolean isAnagram(String a,String b) {
                a = a.toLowerCase();
                b = b.toLowerCase();

                boolean r=false;

                if ((a == null || b == null) || (a.length() != b.length())) {
                    r = false;
                } else {
                    char a1[] = a.toCharArray();
                    java.util.Arrays.sort(a1);
                    char b1[] = b.toCharArray();
                    java.util.Arrays.sort(b1);

                    String s1 = new String(a1);
                    String s2 = new String(b1);

                    if (s1.compareTo(s2) == 0)
                        r = true;
                }
                return  r;
            }

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
