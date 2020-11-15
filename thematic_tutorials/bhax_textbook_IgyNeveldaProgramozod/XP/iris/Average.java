package iris;

import java.util.ArrayList;

public class Average {
	
	public static void avgSepalLength(ArrayList<Species> species) {
		
		double sum = 0;
		
		for(Species s : species) {
			for (int i = 0; i < s.getSepalLength().size(); i++)
				sum += s.getSepalLength().get(i);
			
			s.setAvgSepalLength(sum / s.getQuantity());
		}
	}
	
	public static void avgSepalWidth(ArrayList<Species> species) {
		
		double sum = 0;
		
		for(Species s : species) {
			for (int i = 0; i < s.getSepalWidth().size(); i++)
				sum += s.getSepalWidth().get(i);
			
			s.setAvgSepalWidth(sum / s.getQuantity());
		}
	}
	
	public static void avgPetalLength(ArrayList<Species> species) {
		
		double sum = 0;
		
		for(Species s : species) {
			for(int i = 0; i < s.getPetalLength().size(); i++)
				sum += s.getPetalLength().get(i);
			
			s.setAvgPetalLength(sum / s.getQuantity());
		}
	}
	
	public static void avgPetalWidth(ArrayList<Species> species) {
		
		double sum = 0;
		
		for(Species s : species) {
			for(int i = 0; i < s.getPetalWidth().size(); i++)
				sum += s.getPetalWidth().get(i);
			
			s.setAvgPetalWidth(sum / s.getQuantity());
		}
	}
	
	public static ArrayList<Species> getSpeciesName(ArrayList<Iris> iris) {
		
		ArrayList<String> names = new ArrayList<>();
		ArrayList<Species> species = new ArrayList<>();
		
		for(Iris i : iris) {
			if(!names.contains(i.getSpeciesName())) {
				Species s = new Species(i.getSpeciesName());
				species.add(s);
				names.add(i.getSpeciesName());
			}
		}
		
		
		return species;
	}
}
