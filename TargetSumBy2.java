/*

program to display 2 numbers whose sum is equal to the given number .

input 

an array of size 6 , a number n

output 

2 numbers in the form of array whose sum is equal to that number 

example 

input 
4 5 12 -2 8 4
10

output 
[12,-2]

*/

/*

@ author : saurabh vaish 

*/

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TargetSumBy2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s[] = sc.nextLine().split(" "); // a space seprated string then stored in string array
        int ar[] = new int[6];
        for(int i=0;i<s.length;i++)
        {
             ar[i] = Integer.parseInt(s[i]);  // store string elements in array
        }
        int n = sc.nextInt();
        int c=0;

        Map<Integer,Integer> map = new HashMap<Integer, Integer>();  // hashmap to remove duplicate intries 
        for (int i=0;i<ar.length;i++)
        {

	// if a number is taken then n-thatnumber should be in the array

            int num = n-ar[i];					
            for (int j=0;j<ar.length;j++)
            {
                if(j==i)     // if same index number comes it should be coounted
                    continue;
                if(num==ar[j])   
                {   c++;
                if(!(map.containsKey(num)))   // check if the other number is present in the hashmap or not if not then store in it
                   map.put(ar[i],num);
                }
            }

        }
        if(c==0)
        {
            System.out.println("no numbers found");
        }
        else
        {
            for(Map.Entry entry : map.entrySet()) {                   // for retriving hashmap entries 
                System.out.println("["+entry.getKey()+","+entry.getValue()+"]");
            }
        }
    }
}
