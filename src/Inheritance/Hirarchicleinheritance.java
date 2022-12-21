package Inheritance;

public class Hirarchicleinheritance 
{
  public static void main(String[] args) 
  {
	 son1 s1=new son1();
	   s1.car();
	   s1.mobile();
	  s1.home();
	  s1.money();
	  
	  System.out.println("--------");
	  
	  son2 s2=new son2();
	  s2.laptop();
	  s2.car();
	  s2.home();
	  s2.money();
	
	  System.out.println("--------");
	  
	 son3 s3=new son3();
	  s3.bike();
	  s3.car();
	  s3.home();
	  s3.money();

}
	
}
