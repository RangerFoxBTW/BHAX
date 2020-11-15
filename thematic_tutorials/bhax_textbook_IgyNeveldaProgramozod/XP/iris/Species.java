package iris;

import java.util.ArrayList;

public class Species {
	private String speciesName;
	private int quantity;
	
	private ArrayList<Double> sepalLength;
	private ArrayList<Double> sepalWidth;
	private ArrayList<Double> petalLength;
	private ArrayList<Double> petalWidth;
	
	private double avgSepalLength;
	private double avgSepalWidth;
	private double avgPetalLength;
	private double avgPetalWidth;
	
	
	public Species(String speciesName) {
		this.quantity = 0;
		this.speciesName = speciesName;
		this.avgSepalLength = 0;
		this.avgSepalWidth = 0;
		this.avgPetalLength = 0;
		this.avgPetalWidth = 0;
		this.sepalLength = new ArrayList<>();
		this.sepalWidth = new ArrayList<>();
		this.petalLength = new ArrayList<>();
		this.petalWidth = new ArrayList<>();
	}
	
	public int increment() {
		return quantity++;
	}
	
	
	
	public String getSpeciesName() {
		return speciesName;
	}

	public int getQuantity() {
		return quantity;
	}

	public ArrayList<Double> getSepalLength() {
		return sepalLength;
	}

	public void setSepalLength(ArrayList<Double> sepalLength) {
		this.sepalLength = sepalLength;
	}

	public ArrayList<Double> getSepalWidth() {
		return sepalWidth;
	}

	public void setSepalWidth(ArrayList<Double> sepalWidth) {
		this.sepalWidth = sepalWidth;
	}

	public ArrayList<Double> getPetalLength() {
		return petalLength;
	}

	public void setPetalLength(ArrayList<Double> petalLength) {
		this.petalLength = petalLength;
	}

	public ArrayList<Double> getPetalWidth() {
		return petalWidth;
	}

	public void setPetalWidth(ArrayList<Double> petalWidth) {
		this.petalWidth = petalWidth;
	}

	public double getAvgSepalLength() {
		return avgSepalLength;
	}

	public void setAvgSepalLength(double avgSepalLength) {
		this.avgSepalLength = avgSepalLength;
	}

	public double getAvgSepalWidth() {
		return avgSepalWidth;
	}

	public void setAvgSepalWidth(double avgSepalWidth) {
		this.avgSepalWidth = avgSepalWidth;
	}

	public double getAvgPetalLength() {
		return avgPetalLength;
	}

	public void setAvgPetalLength(double avgPetalLength) {
		this.avgPetalLength = avgPetalLength;
	}

	public double getAvgPetalWidth() {
		return avgPetalWidth;
	}

	public void setAvgPetalWidth(double avgPetalWidth) {
		this.avgPetalWidth = avgPetalWidth;
	}
	
	public void addSepalLength(Double n) {
		this.sepalLength.add(n);
	}
	
	public void addSepalWidth(Double n) {
		this.sepalWidth.add(n);
	}
	
	public void addPetalLength(Double n) {
		this.petalLength.add(n);
	}
	
	public void addPetalWidth(Double n) {
		this.petalWidth.add(n);
	}
	
	
}
