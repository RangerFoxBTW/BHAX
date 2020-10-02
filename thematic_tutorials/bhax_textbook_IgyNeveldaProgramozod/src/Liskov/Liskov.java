public class Liskov {
	class Animals {
		public void bark() {
			System.out.println("Barking!");
		}
	}
	
	class Function {
		public void barking(Animals animals) {
			animals.bark();
		}
	}
	
	class Doggo extends Animals {
	}
	
	class Cat extends Animals {
	}
	
	public static void main(String[] args) {
		Liskov l = new Liskov();
		Function f = l.new Function();
		Animals animals = l.new Animals();
		f.barking(animals);
		
		Doggo dog = l.new Doggo();
		f.barking(dog);
		Cat cat = l.new Cat();
		f.barking(cat);
	}

}