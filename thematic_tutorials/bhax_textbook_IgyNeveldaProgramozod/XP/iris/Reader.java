import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.DecimalFormat;


public class Reader {

	public static void main(String[] args) {
		if(args.length != 0) {
			System.out.println("Don't be fool, give me one argument! :)");
		}
			
				
	
			String path = args[0];
			String line;
			String[] values;
			
			Integer db1 = 0;
			Float setosa1 = 0.0f;
			Float setosa2 = 0.0f;
			Float setosa3 = 0.0f;
			Float setosa4 = 0.0f;
			
			Integer db2 = 0;
			Float versicolor1 = 0.0f;
			Float versicolor2 = 0.0f;
			Float versicolor3 = 0.0f;
			Float versicolor4 = 0.0f;
			
			Integer db3 = 0;
			Float virginica1 = 0.0f;
			Float virginica2 = 0.0f;
			Float virginica3 = 0.0f;
			Float virginica4 = 0.0f;
			
			try (BufferedReader br = new BufferedReader(new FileReader(path))) {
				
				while((line = br.readLine()) != null) {
					values = line.split(",");
					if (values.length > 1) {
						if (values[4].equals("Iris-setosa")) {
							setosa1 += Float.parseFloat(values[0]);
							setosa2 += Float.parseFloat(values[1]);
							setosa3 += Float.parseFloat(values[2]);
							setosa4 += Float.parseFloat(values[3]);
							db1++;
						}
						else if (values[4].equals("Iris-versicolor")) {
							versicolor1 += Float.parseFloat(values[0]);
							versicolor2 += Float.parseFloat(values[1]);
							versicolor3 += Float.parseFloat(values[2]);
							versicolor4 += Float.parseFloat(values[3]);
							db2++;
						}
						else {
							virginica1 += Float.parseFloat(values[0]);
							virginica2 += Float.parseFloat(values[1]);
							virginica3 += Float.parseFloat(values[2]);
							virginica4 += Float.parseFloat(values[3]);
							db3++;
						}
						
					}
					
					
					
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			
			DecimalFormat df = new DecimalFormat("#.##");
			System.out.println("Átlagok:");
			System.out.println("Iris setosa:");
			System.out.println("Sepal length: " + df.format(setosa1/db1) + "cm");
			System.out.println("Sepal width: " + df.format(setosa2/db1) + "cm");
			System.out.println("Petal length: " + df.format(setosa3/db1) + "cm");
			System.out.println("Petal width: " + df.format(setosa4/db1) + "cm");
			System.out.println();
			
			System.out.println("Iris versicolor:");
			System.out.println("Sepal length: " + df.format(versicolor1/db2) + "cm");
			System.out.println("Sepal width: " + df.format(versicolor2/db2) + "cm");
			System.out.println("Petal length: " + df.format(versicolor3/db2) + "cm");
			System.out.println("Petal width: " + df.format(versicolor4/db2) + "cm");
			System.out.println();
			
			System.out.println("Iris Virginica:");
			System.out.println("Sepal length: " + df.format(virginica1/db3) + "cm");
			System.out.println("Sepal width: " + df.format(virginica2/db3) + "cm");
			System.out.println("Petal length: " + df.format(virginica3/db3) + "cm");
			System.out.println("Petal width: " + df.format(virginica4/db3) + "cm");
	}
}
