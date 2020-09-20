package yoda;

public class Yoda {

	public static void main(String[] args) {
		String jedi = null;
		
		if (jedi.equals("Yoda"))
			System.out.println("Nem működne");
		if ("Yoda".equals(jedi))
			System.out.println("Ez már jó");

	}

}