package AccessSpecifiers;

public class Sample1 
{
	//example of private Access specifier
	
		private int num1;
		
		private	Sample1()
		{
			num1=10;
		}
		
		private void m1()
		{
			System.out.println(num1);
		}
		
		public static void main(String[] args)
		{
			Sample1 s1=new Sample1();
			s1.m1();
			System.out.println(s1.num1);		
		}

}
