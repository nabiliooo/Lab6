import static org.junit.jupiter.api.Assertions.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BeverageTestStudent {

	Beverage coffee, alcohol, smoothie;
	
	@Before
	public void setUp() throws Exception {
		
		coffee = new Coffee("Decaf", Size.SMALL, false, false);
		alcohol = new Alcohol("Beer", Size.MEDIUM, false);
		smoothie = new Smoothie("Strawberry Smoothie", Size.LARGE, 2, false);
		
	}

	@After
	public void tearDown() throws Exception {
		
		coffee = alcohol = smoothie = null;
		
	}

	@Test
	public void testBeverage() {
		
		assertTrue(coffee.getBevName().equals("Decaf"));
		assertEquals(2.0, coffee.getBasePrice(), 0);
		assertTrue(coffee.getType() == Type.COFFEE);
		assertTrue(coffee.getSize() == Size.SMALL);
		
	}

	@Test
	public void testCalcPrice() {
		
		assertEquals(2.0, coffee.calcPrice(), 0);
		assertEquals(3.0, alcohol.calcPrice(), 0);
		assertEquals(5.0, smoothie.calcPrice(), 0);
		
	}

	@Test
	public void testToString() {
		
		assertEquals("Beverage name: Decaf, Size: SMALL, Price was: 2.0", coffee.toString());
		assertEquals("Beverage name: Strawberry Smoothie, Size: LARGE, 2 fruits were added, Price was: 5.0", smoothie.toString());
		assertEquals("Beverage name: Beer, Size: MEDIUM, is offered during the weekend, Price was: 3.6", alcohol.toString());
		
	}

	@Test
	public void testEqualsBeverage() {
		
		assertFalse(coffee.equals(alcohol));
		assertFalse(alcohol.equals(smoothie));
		assertFalse(smoothie.equals(coffee));
		
	}

	@Test
	public void testAddSizePrice() {
		
		assertEquals(4.0, smoothie.addSizePrice(), 0);
		assertEquals(3.0, alcohol.addSizePrice(), 0);
		assertEquals(2.0, coffee.addSizePrice(), 0);
		
	}

	@Test
	public void testGetBasePrice() {
		
		assertEquals(2.0, coffee.getBasePrice(), 0);
		assertEquals(2.0, alcohol.getBasePrice(), 0);
		assertEquals(2.0, smoothie.getBasePrice(), 0);
		
	}

	@Test
	public void testGetType() {
		
		assertTrue(coffee.getType() == Type.COFFEE);
		assertTrue(alcohol.getType() == Type.ALCOHOL);
		assertTrue(smoothie.getType() == Type.SMOOTHIE);
		
	}

	@Test
	public void testGetBevName() {
		
		assertTrue(coffee.getBevName().equals("Decaf"));
		assertTrue(alcohol.getBevName().equals("Beer"));
		assertTrue(smoothie.getBevName().equals("Strawberry Smoothie"));
		
	}

	@Test
	public void testGetSize() {
		
		assertTrue(coffee.getSize() == Size.SMALL);
		assertTrue(alcohol.getSize() == Size.MEDIUM);
		assertTrue(smoothie.getSize() == Size.LARGE);
		
	}

}