package Dati;

import java.time.LocalDateTime; 
import java.time.format.DateTimeFormatter;

public class dat7 {

	public static void main(String[] args) { 
	LocalDateTime myDateObj = LocalDateTime.now(); 
	System.out.println("Before Formatting: " + myDateObj); 
	 DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern
	 ("dd-MMM-yyyy HH:mm:ss"); 
	String formattedDate = myDateObj.format(myFormatObj); 
	System.out.println("After Formatting: " + formattedDate); 
	} 
	}

