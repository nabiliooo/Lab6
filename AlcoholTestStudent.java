import static org.junit.jupiter.api.Assertions.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AlcoholTestStudent {
	Alcohol alcoholtest1, alcoholtest2, alcoholtest3;
	
	@Before
	public void setUp() throws Exception {
		alcoholtest1 = new Alcohol("Tequila", Size.SMALL, false);
		alcoholtest2 = new Alcohol("Gin", Size.LARGE, true);
		alcoholtest3 = new Alcohol("Beer", Size.MEDIUM, false);	
	}

	@After
	public void tearDown() throws Exception {
		alcoholtest1 = alcoholtest2 = alcoholtest3 = null;
	}
	

	@Test
	public void testCalcPrice() {
		assertEquals(2.0, alcoholtest1.calcPrice(), 0);
		assertEquals(4.6, alcoholtest2.calcPrice(), 0);
		assertEquals(3.0, alcoholtest3.calcPrice(), 0);
	}

	@Test
	public void testToString() {
		assertEquals("Beverage name: Gin, Size: LARGE, is offered during the weekend, Price was: 4.6", alcoholtest2.toString());
	}

	@Test
	public void testAlcohol() {
		Alcohol alcohol4 = new Alcohol("Beer", Size.MEDIUM, false);
		
		assertTrue(alcohol4.getBevName().equals("Beer"));
		assertTrue(alcohol4.getSize() == Size.MEDIUM);
		assertTrue(alcohol4.isWeekend() == false);
	}
}