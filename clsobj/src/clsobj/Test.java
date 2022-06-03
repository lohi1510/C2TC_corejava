package clsobj;

public class Test {
	
		 public static void main(String[] args) {
		 Test obj = new Test();
		 obj.start();
		 }
		 void start() {
		 String stra = "very";
		 String strb = method(stra);
		 System.out.print(": " + stra + strb);
		 }
		 String method(String stra) {
		 stra = stra + "bad";
		 System.out.print(stra);
		 return " bad";
		 }
		}

