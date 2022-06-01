package sb;

public class En2 
{
	enum Day{ SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY }
	
	public static void main(String[] args) {
		Day day=Day.MONDAY;
		
		switch(day)
		{
		case SUNDAY:
			System.out.println("Happy Day");
			break;
		case FRIDAY:
			System.out.println("weekend");
			break;
		default:
			System.out.println("other day");
		}

	}

}
