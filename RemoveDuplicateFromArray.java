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
            for(int j=0;j<ar.length;j++)
            {
                if(!(map.containsKey(ar[i]))){
                    if (ar[j] == ar[i]) {
                        a[ar[i]]++;
                    }
                }
            }
            map.put(ar[i],a[ar[i]]);
        }
        System.out.println(map.toString());


        /* or without using collections
        int c=0,d=0;
        for (int i=0;i<ar.length-1;i++)
        {
            if(ar[i]!=ar[i+1])
            {
                for (int j = 0; j < ar.length; j++) {
                    if (ar[j] == ar[i]) {
                        a[ar[i]]++;

                    }
                }
                m[ar[i]]=ar[i];
            }

        }
        for (int i=0;i<a.length;i++)
        {

             if(a[i]!=0)
            System.out.println(m[i]+"="+a[i]);
        }

        */
    }
}

