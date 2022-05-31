package strings1;

public class Format {
	 public static void main(String args[]){ 
		 String name = "RCB"; 
		 String sf1 = String.format("%s",name); 
		 String sf2 = String.format("%f",3.14598); 
		 String sf3 = String.format("%16.12f",100.0009);
		 System.out.println(sf1); 
		 System.out.println(sf2); 
		 System.out.println(sf3); 
		 }

}
