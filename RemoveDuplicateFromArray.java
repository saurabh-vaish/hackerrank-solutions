// program to count numbers form array of numbers and parint them without printing duplicate 

/*
@author : saurabh vaish
*/

import java.util.HashMap;

public class RemoveDuplicateFromArray {
    public static void main(String[] args) {
        int ar[] = {1,1,0,3,4,5,1};
        int a[] = new int[7];
        int m[] = new int[7];

        HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();
        for (int i=0;i<ar.length;i++)
        {
          if(!(map.containsKey(ar[i])))
          {
            for(int j=0;j<ar.length;j++)
            {
                
                    if (ar[j] == ar[i]) {
                        a[i]++;
                    }
             }
           
            map.put(ar[i],a[i]);
            }
        }
        System.out.println(map.toString());

	
    }
}

