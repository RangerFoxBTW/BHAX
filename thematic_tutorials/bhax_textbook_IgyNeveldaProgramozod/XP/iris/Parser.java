package iris;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Parser {
	
	public static ArrayList<Iris> reader(String path) {
		
		ArrayList<Iris> iris = new ArrayList<Iris>();
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			
			String line;
			String values[];
			
			
			while((line = br.readLine()) != null) {
				Iris i = new Iris();
				values = line.split(",");
				i.setSepalLenth(Double.parseDouble(values[0]));
				i.setSepalWidth(Double.parseDouble(values[1]));
				i.setPetalLength(Double.parseDouble(values[2]));
				i.setPetalWidth(Double.parseDouble(values[3]));
				i.setSpeciesName(values[4]);
				
				iris.add(i);
			}
			
		} catch (IOException e) {
			System.err.println("IOException detected!");
			e.printStackTrace();
			System.exit(0);
		}
		
		return iris;
	}
	
	public static void addingToList(ArrayList<Iris> list, ArrayList<Species> species) {
		
		for(Iris i : list) {
			for(Species s : species) {
				if(i.getSpeciesName().equals(s.getSpeciesName())) {
					s.addSepalLength(i.getSepalLenth());
					s.addSepalWidth(i.getSepalWidth());
					s.addPetalLength(i.getPetalLength());
					s.addPetalWidth(i.getPetalWidth());
				}
			}
		}
	}
	
	
}
