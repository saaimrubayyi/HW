package hw15Polymorphism;

public class TestFamily {
	public static void main(String[] args) {
		Sister sister = new Sister();
		sister.sister();
		sister.sister(5);
		sister.sister(5, 13);
		Sister.sister(4, 5, 6);
		sister.sister(4, 5.9, 14, 61);
		sister.sister(4, 5, 21, 57f);
		
		System.out.println("----------------------------------------------");
		Niece niece = new Niece();
		niece.sister();
		niece.sister(4);
		niece.sister(5, 6);
		Niece.sister(4, 6, 7);
		niece.sister(4, 6.7, 6, 8);
		niece.sister(32, 21, 6, 23f);
	}

}
