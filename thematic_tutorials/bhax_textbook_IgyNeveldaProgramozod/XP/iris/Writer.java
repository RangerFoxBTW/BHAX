package iris;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Writer {
	
	public static void out(ArrayList<Species> species) {
		
		for(Species s : species) {
			System.out.println(s.getSpeciesName());
			System.out.println("Sepal Length: " + s.getAvgSepalLength() + "cm");
			System.out.println("Sepal Width: " + s.getAvgSepalWidth() + "cm");
			System.out.println("Petal Length: " + s.getAvgPetalLength() + "cm");
			System.out.println("Petal Width: " + s.getAvgPetalWidth() + "cm");
		}
	}
	
	public static void write(ArrayList<Species> species) {
		
		try (BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"))) {
			
			for(Species s : species) {
				writer.append(s.getSpeciesName());
				writer.append("Sepal Length: " + s.getAvgSepalLength() + "cm");
				writer.append("Sepal Width: " + s.getAvgSepalWidth() + "cm");
				writer.append("Petal Length: " + s.getAvgPetalLength() + "cm");
				writer.append("Petal Width: " + s.getAvgPetalWidth() + "cm");
			}
			
		} catch (IOException e) {
			System.err.println("IOException detected");
			e.printStackTrace();
			System.exit(0);
		}
	}
}
