import java.util.Scanner;

public class code2 {
	public static boolean lastnamesame(String k1, String k2)
	{
		int c1=-1,c2=-1,i;
		String k3, k4;
		for(i=0;i<k1.length();i++)
		{
			if(Character.isWhitespace(k1.charAt(i)))
			{
				c1=i;
			}
		}
		for(i=0;i<k2.length();i++)
		{
			if(Character.isWhitespace(k2.charAt(i)))
			{
				c2=i;
			}
		}
		k3=k1.substring(c1);
		k4=k2.substring(c2);
		if(k3.equalsIgnoreCase(k4))
		{
			return true;
		}
		else
		{
		    return false;
		}
	}

	public static void main(String[] as) {
		Scanner in=new Scanner(System.in);
		String a1,a2;
		System.out.println("Enter 2 names");
		a1=in.nextLine();
		a2=in.nextLine();
		if(lastnamesame(a1,a2)== true)
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}

	}

}