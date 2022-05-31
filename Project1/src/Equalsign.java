package strings1;

public class Equalsign {

	public class EqualsIgnoreCaseExample{
		
		public static void main(String args[]){ 
		String s1 = "Royal Challengers Bangalore"; 
		String s2 = "Royal Challengers Bangalore"; 
		String s3 = "ROYAL CHALLENGERS BANGALORE"; 
		String s4 = "R C B"; 
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1.equalsIgnoreCase(s3));
		System.out.println(s1.equalsIgnoreCase(s4));
		}
		}

}
