package inheritance;

public class Animal {
	
	private String name;
	
	public void printName() {
		System.out.println("Animal " + name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
