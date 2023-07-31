import static org.junit.jupiter.api.Assertions.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SmoothieTestStudent {

	Smoothie smoothie1, smoothie2;
	
	@Before
	public void setUp() throws Exception {
		smoothie1 = new Smoothie("Mango Smoothie", Size.LARGE, 2, true);
		smoothie2 = new Smoothie("Berry Smoothie", Size.MEDIUM, 4, false);
	}

	@After
	public void tearDown() throws Exception {
		smoothie1 = smoothie2 = null;
	}

	@Test
	public void testCalcPrice() {
		assertEquals(6.5, smoothie1.calcPrice(), 0);
		assertEquals(5.0, smoothie2.calcPrice(), 0);
	}

	@Test
	public void testToString() {

		assertEquals("Beverage name: Mango Smoothie, Size: LARGE, Protein was added, 2 fruits were added, Price was: 6.5", smoothie1.toString());
		assertEquals("Beverage name: Berry Smoothie, Size: MEDIUM, 4 fruits were added, Price was: 5.0", smoothie2.toString());
	}

	@Test
	public void testSmoothie(){
		Smoothie smoothie3 = new Smoothie("Smoothie", Size.LARGE, 3, true);
		
		assertTrue(smoothie3.getBevName().equals("Smoothie"));
		assertTrue(smoothie3.getSize() == Size.LARGE);
		assertTrue(smoothie3.getNumOfFruits() == 3);
		assertTrue(smoothie3.getAddProtein() == true);
		
	}

	@Test
	public void testEqualsSmoothie(){
		
		assertFalse(smoothie1.equals(smoothie2));
		
	}

	@Test
	public void testGetAddProtein(){
		
		assertTrue(smoothie1.getAddProtein() == true);
		assertTrue(smoothie2.getAddProtein() == false);
		
	}

	@Test
	public void testGetNumOfFruits(){
		assertEquals(2.0, smoothie1.getNumOfFruits(), 0);
		assertEquals(4.0, smoothie2.getNumOfFruits(), 0);
	}

}