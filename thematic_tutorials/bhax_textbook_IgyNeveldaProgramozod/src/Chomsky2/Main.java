public class Main {

	public static void main(String[] args) {
		IntegerStorage store = new IntegerStorage(10);
		for (int i = 6; i < 13; i++) 
			store.add(i);
		store.add(5);
		store.add(3);
		store.add(1);
		
		store.bubble();
		System.out.println(store);
		System.out.println(store.binary(2));
		System.out.println(store.binary(7));
	}

}