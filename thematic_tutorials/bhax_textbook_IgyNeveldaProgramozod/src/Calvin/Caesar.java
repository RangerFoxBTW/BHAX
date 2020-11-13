import java.io.File;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;


public class Caesar {
	
	public static void caesar(String input, int shift) {
		
		try (BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt", true))) {
			for(char c : input.toCharArray()) {
				writer.write((char) ((c + shift) % 128)); //a shift-el eltoljuk a karaktert, és modulózzuk, hogy körbe menjen
			}
			writer.write("\n");
			
		} catch (IOException e) {
			System.err.println("An error has occured!");
		}
	}
	
	public static void main(String[] args) {
		File output = new File("output.txt");
		Scanner scan = new Scanner(System.in);
		
		if (output.exists())
			output.delete();
		
		while (scan.hasNext()) {
			caesar(scan.nextLine(), 5);
		}

	}
	
	
}