public class CapitilizeEachWord {
    public static void main(String args[])
    {
       String s="i love my india";

        s=" "+s;
        String cap="";
        for(int i=0;i<s.length();i++)
        {
            char x=s.charAt(i);
            if(x==' ')
            {
                cap=cap+" ";
                char y=s.charAt(i+1);
                cap=cap+Character.toUpperCase(y);
                i++;
            }
            else
            {
                cap=cap+x;
            }
        }
        System.out.println("The new String with capital letters is: "+"\n"+cap);
    }
}
