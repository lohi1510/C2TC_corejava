package polymorphism;

public class Overload {
	 public static void main(int num1){
         System.out.println(num1);    
   }


   public static void main(int num1, int num2){
         System.out.println(num1 + num2);
   }

   public static void main(String args[]){
        
         main(20);
         main(10, 20);
   }
}
