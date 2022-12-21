package Generalization;

public class TestGeneralization
{
 public static void main(String[] args) 
 {
	System.out.println("--features of Jio SimCard--");
	 
	 Jio j=new Jio();
	  j.sms();
	  j.audiocalling();
	  j.data();
	  j.newfeatureA();
	  
  System.out.println("--features of VI SimCard--");
	
	VI v=new VI();
	v.sms();
	v.audiocalling();
	v.data();
	v.newfeatureB();
	
  System.out.println("--features of Airtel SimCard--");
  
    Airtel a=new Airtel();
    a.sms();
    a.audiocalling();
    a.data();
    a.newfeatureC();	
 }	
}

