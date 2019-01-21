import java.util.*;
public class SquareRootWithoutMethod.java
{
	public static void main(String[] args) {
	    double i,j,n;
	    Scanner sc = new Scanner(System.in);
	    n = sc.nextDouble();
	    j=n;
        for(i=1;i<=n*2;i++)
        {
             j=(j+(n/j))/2;
        }
		System.out.println(j);
	}
}
