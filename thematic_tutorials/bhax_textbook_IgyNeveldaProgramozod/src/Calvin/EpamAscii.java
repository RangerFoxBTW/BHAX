import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class EpamAscii {

	public static void paint(String path) throws IOException {
		BufferedImage img = null;
		img = ImageIO.read(new File(path));
		
		try(BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"))) {
			for (int y = 0; y < img.getHeight(); y++)
			{
				for(int x = 0; x < img.getWidth(); x++)
				{
					float[] rgb = new float[4];
					img.getRaster().getPixel(x,y,rgb);
					float r = rgb[0] / 255;

					if(r > 0.75) {
						System.out.print("▓");
						writer.write("▓");
					}
					else if(r > 0.50) {
						System.out.print("▒");
						writer.write("▒");
					}
					else if(r > 0.25) {
						System.out.print("░");
						writer.write("░");
					}
					else {
						System.out.print(" ");
						writer.write(" ");
					}
				}
				System.out.println();
				writer.write("\n");
			}
		} catch (IOException e)  {
			System.err.println("An error has occured!");
		}

	}
	
	public static void main(String[] args) throws IOException {
		paint("D:\\Dokumentumok\\Képek\\sp.jpg");
	}
	
}