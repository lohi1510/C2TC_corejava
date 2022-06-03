package clsobj;

public class Company1 {

		String name;
		public static void main(String[] args) {
		Company1 c1 = new Company1();
		c1.name = " King ";
		Company1 c2 = c1;
		c1 = null;
		System.out.println(c2.name);
		new Company1();
		}
}

