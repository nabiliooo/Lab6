import static org.junit.jupiter.api.Assertions.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CoffeeTestStudent {

	Coffee coffee1, coffee2;
	
	@Before
	public void setUp() throws Exception {
		
		coffee1 = new Coffee("Regular", Size.MEDIUM, true, false);
		coffee2 = new Coffee("Decaf", Size.LARGE, false, true);
		
	}

	@After
	public void tearDown() throws Exception {
		
		coffee1 = coffee2 = null;
		
	}

	@Test
	public void testCalcPrice() {
		
		assertEquals(3.5, coffee1.calcPrice(), 0);
		assertEquals(4.5, coffee2.calcPrice(), 0);
		
	}

	@Test
	public void testToString() {
		
		assertEquals("Beverage name: Regular, Size: MEDIUM, extra shot, Price was: 3.5", coffee1.toString());
		assertEquals("Beverage name: Decaf, Size: LARGE, extra syrup, Price was: 4.5", coffee2.toString());
		
	}

	@Test
	public void testCoffee() {
		
		Coffee coffee3 = new Coffee("Coffee", Size.SMALL, false, false);
		
		assertTrue(coffee3.getBevName().equals("Coffee"));
		assertTrue(coffee3.getSize() == Size.SMALL);
		assertTrue(coffee3.getExtraShot() == false);
		assertTrue(coffee3.getExtraSyrup() == false);
		
	}

	@Test
	public void testEqualsCoffee() {
		
		assertFalse(coffee1.equals(coffee2));
		
	}

	@Test
	public void testGetExtraShot() {
		
		assertTrue(coffee1.getExtraShot() == true);
		
		assertTrue(coffee2.getExtraShot() == false);
		
	}

	@Test
	public void testGetExtraSyrup() {
		
		assertTrue(coffee1.getExtraSyrup() == false);
		
		assertTrue(coffee2.getExtraSyrup() == true);

	}

}