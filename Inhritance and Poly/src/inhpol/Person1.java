package inhpol; //multilevel

class Person123 {
	
	  public void show()
	  {
	    System.out.println("Student inheriting properties from Person");
	  }
	}
	class Student123 extends Person123
	{
	  public void show1()
	  {
	      System.out.println("I am a Student who belongs to Person class");
	  }
	}
	
	class EngineeringStudent extends Student123
	{

	  public void show2()
	  {
	    System.out.println("Engineering Student inheriting properties from Student");
	  }
	}
	public class Person1
	{
	  public static void main(String args[])
	  {
	    EngineeringStudent obj = new EngineeringStudent();
	    obj.show();
	    obj.show1();
	    obj.show2();
	  }
	}

