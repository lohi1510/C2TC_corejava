package inhpol;  //hierarchial
 class Person231 {
	
	  public void show()
	  {
	  System.out.println("I am a King");
	  }
	}

	class Student322 extends Person231
	{
	  public void show1()
	  {
	  System.out.println("I am a Student who is King ");
	  }
	}

	class Teacher extends Person231
	{

	  public void show2()
	  {
	    System.out.println("I am a Teacher who is a King");
	  }
	}
	
	class Doctor extends Person231
	{


	  public void show3()
	  {
	    System.out.println("I am a Doctor who is a King");
	  }
	}

	public class Person2
	{
	  public static void main(String args[])
	  {
	    Teacher teacher = new Teacher();
	    Student322 student322 = new Student322();
	    Doctor doctor = new Doctor();
	    student322.show();
	    student322.show1();
	    teacher.show2();
	    doctor.show3();
	  }
	}

