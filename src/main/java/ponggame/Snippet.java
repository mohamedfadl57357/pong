package ponggame;

public class Snippet {
	
	private static int number = 5;
	
	public static void main(String[] args) {
		
		Snippet snippet1 = new Snippet();
		Snippet snippet2 = new Snippet();
		
		
		snippet1.setNumber(50);
		System.out.println("Test1: " + snippet1.getNumber());
		snippet2.setNumber(snippet2.getNumber()/2);
		System.out.println("Test2: " + snippet2.getNumber());
		System.out.println("Test3: " + snippet1.getNumber());
		
		
		
	}

	public static int getNumber() {
		return number;
	}

	public static void setNumber(int number) {
		Snippet.number = number;
	}
}

