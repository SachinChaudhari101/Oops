package AccessSpecifiers;

public class sample21
{
	//3. example of protected access specifier
	
		protected int num;
		
		protected sample21()
		{
			num = 10;
		}
		
		protected void name()
		{
			System.out.println(num);
		}
		
		public static void main(String[] args) 
		{
			sample21 s21=new sample21();
			s21.name();
			System.out.println(s21.num);		
		}
	}


