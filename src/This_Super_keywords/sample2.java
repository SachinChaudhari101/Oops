package This_Super_keywords;
  
         // sub class
public class sample2 extends sample1
{
	//int a=10;    //global variable from super class
	
		int a=20;            //global variable
		
		public void m1() 
		{
			int a=30;     //local variable
			System.out.println(a);         //30
			System.out.println(this.a);     //20
			System.out.println(super.a);   //10
		}

	
	
	
}
