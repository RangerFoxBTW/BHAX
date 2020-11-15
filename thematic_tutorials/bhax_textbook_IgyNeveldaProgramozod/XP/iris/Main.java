package iris;

import java.io.IOException;
import java.util.ArrayList;

public class Main {
	
	public static void values(ArrayList<Iris> list, ArrayList<Species> species) {
		
		Parser.addingToList(list, species);
		
		Average.avgSepalLength(species);
		Average.avgSepalWidth(species);
		Average.avgPetalLength(species);
		Average.avgPetalWidth(species);
	}

	
	public static void main(String[] args) throws Exception {
		
		if (args.length != 1)
			throw new Exception("Don't be fool, give me one argument please! :)");
		
		ArrayList<Iris> list = new ArrayList<>();
		ArrayList<Species> species = new ArrayList<>();
		
		list = Parser.reader(args[0]);
		
		species = Average.getSpeciesName(list);
		
		values(list, species);
		
		Writer.write(species);
		
	}

}
