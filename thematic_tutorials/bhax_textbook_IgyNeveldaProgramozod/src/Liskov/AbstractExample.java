interface DogInterface {
	
	abstract void breed();
	void bark();
	
}

abstract class Dog {
	
	public void bark() {
		System.out.println("Bark!");
	}
	
	public abstract void poop();
	
}

class GermanShepard extends Dog {
	
	public String breed = "I am a cute german shepard!";

	@Override
	public void poop() {
		System.out.println("I just pooped!");	
	}	
	
}

class Greyhound implements DogInterface {

	@Override
	public void bark() {
		System.out.println("Bark!");
	}
	
	@Override
	public void breed() {
		System.out.println("I am an adorable greyhound!");	
	}
	
}

public class AbstractExample {

	public static void main(String[] args) {
		GermanShepard gs = new GermanShepard();
		System.out.println(gs.breed);
		
		Greyhound gh = new Greyhound();
		gh.breed();
	}

}