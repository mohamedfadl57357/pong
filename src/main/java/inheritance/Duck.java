package inheritance;

public class Duck extends Animal {

	@Override
	public void printName() {
		System.out.println("Duck " + getName());
	}

}
