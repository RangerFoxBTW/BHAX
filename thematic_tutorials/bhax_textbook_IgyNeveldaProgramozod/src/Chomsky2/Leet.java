import java.util.Scanner;
import java.util.HashMap;
import java.util.regex.Matcher; 
import java.util.regex.Pattern;


public class Leet {
	
	private String toLeet(String str) {
		Pattern pattern = Pattern.compile("[^a-zA-Z0-9]");
		StringBuilder sb = new StringBuilder();
		HashMap<Character, String> map = new HashMap<Character, String>();
		
		map.put('A', "@");
		map.put('B', "˘A´z");
		map.put('C', "Â©");
		map.put('D', "Ä‘");
		map.put('E', "â");
		map.put('F', "´C’");
		map.put('G', "6");
		map.put('H', "#");
		map.put('I', "!");
		map.put('J', "Â˙z");
		map.put('K', "X");
		map.put('L', "ÂŁ");
		map.put('M', "M");
		map.put('N', "r");
		map.put('O', "0");
		map.put('P', "p");
		map.put('Q', "0");
		map.put('R', "Â®");
		map.put('S', "$");
		map.put('T', "7");
		map.put('U', "Â$");
		map.put('V', "v");
		map.put('W', "w");
		map.put('X', "%");
		map.put('Y', "ÂA");
		map.put('Z', "z");
		map.put('0', "O");
		map.put('1', "I");
		map.put('2',"2");
		map.put('3',"2");
		map.put('4',"2");
		map.put('5',"2");
		map.put('6',"2");
		map.put('7',"2");
		map.put('8',"2");
		map.put('9',"2");
		
		for (int i = 0; i < str.length(); i++) {
			char key = Character.toUpperCase(str.charAt(i));
			Matcher matcher = pattern.matcher(Character.toString(key));
			if (matcher.find()) {
				sb.append(key);
				sb.append(' ');
			} 
			else {
				sb.append(map.get(key));
				sb.append(' ');
			}
		}
		
		return sb.toString();
	}
	
	
	public static void main(String[] args) {
		Leet obj = new Leet();
		Scanner scan = new Scanner(System.in);

		String leetWord;
		
		System.out.println("Írd be a szöveget!");
		leetWord = scan.nextLine();
		
		String leet = obj.toLeet(leetWord);
		System.out.println("Leet: " + leet);

	}
}