package main;

public class ABC {

	public static void main(String[] args) {
		String a="lalit bhokare is java developer";
		int b=0;
		for(int i=0;i<a.length();i++)
		{
			if(a.charAt(i)==' ')
			{
				b++;
			}
		}b++;
		System.out.println(b);
	}

}
