package Dati;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class dat8 {
	
	public class MyClass {
	 public static void main(String[] args) { 
	 LocalDateTime myDateObj = LocalDateTime.now(); 
	 System.out.println("Before Formatting: " + myDateObj); 
	 DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern
	 ("E,MMM dd yyyy HH:mm:ss"); 
	 String formattedDate = myDateObj.format(myFormatObj); 
	 System.out.println("After Formatting: " + formattedDate); 
	 } 
	}
}
