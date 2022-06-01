package sb;

public class en {
	public enum Season {
		SUMMER(3),WINTER(6),SPRING(9), AUTUMN(12);
		int value;
		Season(int value)
		{
			this.value=value;
		}
		
	}

	public static void main(String[] args) {
		for (Season s : Season.values()){
			System.out.println(s + " "+ s.value);
		}
	}

}