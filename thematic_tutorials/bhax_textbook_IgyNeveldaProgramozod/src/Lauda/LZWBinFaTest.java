import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;

public class LZWBinFaTest {

	LZWBinFa binfa = new LZWBinFa();
	String str = "01111001001001000111";
	
	@Test
	public void testIfAtlagIsGivingTheCorrectResult() {
		for(int i = 0; i < str.length(); i++)
			binfa.push_back(str.charAt(i));
		
		double atlag = binfa.getAtlag();
		assertEquals(2.75, atlag, 0.001);
	}
	
	@Test
	public void testIfSzorasIsGivingTheCorrectResult() {
		for(int i = 0; i < str.length(); i++)
			binfa.push_back(str.charAt(i));

		double szoras = binfa.getSzoras();
		assertEquals(0.9574271077563381, szoras, 0.0001);
	}
	
	@Test
	public void testIfMelysegIsGivingTheCorrectResult() {
		for(int i = 0; i < str.length(); i++)
			binfa.push_back(str.charAt(i));
		
		double melyseg = binfa.getMelyseg();
		assertEquals(4, melyseg, 0.0);
	}
}