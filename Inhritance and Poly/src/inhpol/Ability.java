package inhpol; //hybrid

class Abilitys {
	  public void show()
	  {
	    System.out.println("I am a person, I can talk and walk !!");
	  }
	}
	interface Moveable
	{
	  public void run();
	}

	interface Speakable
	{
	  public void speak();
	}

		class Person extends Abilitys implements Moveable, Speakable
	{
	  
	  public void run()
	  {
	    System.out.println("I can walk !!");
	  }
	  
	  public void speak()
	  {
	    System.out.println("I can talk !!");
	  }
	}

	public class Ability
	{
	  public static void main(String[] args)
	  {
	    Person obj = new Person();
	    obj.run();
	    obj.speak();
	    obj.show();
	  }
	}

