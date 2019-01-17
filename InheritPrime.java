/*

program to find prime numbers from an array in one class and print them in another class 

*/

/*
@ author : saurabh vaish
*/

import java.util.Scanner;

 class cPrime {

  static    int ar[] = new int[6];
   static   int cp[] = new int[6];
   static   int pr[] = new int[6];

     void init() {
         Scanner sc = new Scanner(System.in);

         String s[] = sc.nextLine().split(" ");

         for (int i = 0; i < s.length; i++) {
             ar[i] = Integer.parseInt(s[i]);
         }
     }

            int j=0,k=0;
        void checkPrime() {
            for (int a : ar) {
                int c = 0;
                for (int i = 2; i < a / 2; i++) {
                    if (a % i == 0) {
                        c++;
                        // break;
                    }
                }
                if (c == 0) {
                    pr[j] = a;
                    // System.out.println(pr[j]);
                    j++;
                } else {
                    cp[k] = a;
                    // System.out.println(cp[k]);
                    k++;
                }
            }
        }

 }

public  class InheritPrime extends cPrime
{
    public static void main(String[] args) {

        InheritPrime ip = new InheritPrime();
        ip.init();
        ip.checkPrime();
        for (int i:pr)
        {
            if(i!=0&&i!=1)
                System.out.println(i);
        }
    }

}

