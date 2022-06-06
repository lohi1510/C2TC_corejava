package inhpol;//Single

class Stud {
	

	
		String name="Lohith";
		public void show()
		{
			System.out.println("Student inherting properties from person");
		}

	}

	class Peepi extends Stud
	{
		String course="Java";
		public void show1()
		{
			System.out.println("I am a coder");
		}
		public static void main(String args[])
		{
			Peepi obj = new Peepi();
			obj.show();
			obj.show1();
			System.out.println("Name of student: " +obj.name);
			System.out.println("Type: " +obj.course);
			
		}
	}



