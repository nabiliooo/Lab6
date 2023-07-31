import static org.junit.jupiter.api.Assertions.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BevShopTestStudent{

	BevShop bevshoptest1;
	
	@Before
	public void setUp() throws Exception {
		
		bevshoptest1 = new BevShop();
		bevshoptest1.startNewOrder(9, Day.MONDAY, "Nabil", 21);
		
	}

	@After
	public void tearDown() throws Exception {
		
		bevshoptest1 = null;
		
	}

	@Test
	public void testIsValidTime() {
		
		assertTrue(bevshoptest1.isValidTime(bevshoptest1.getCurrentOrder().getOrderTime()));
		
	}

	@Test
	public void testGetMaxNumOfFruits() {
		
		assertEquals(5, bevshoptest1.getMaxNumOfFruits(), 0);
		
	}

	@Test
	public void testGetMinAgeForAlcohol() {

		assertEquals(21, bevshoptest1.getMinAgeForAlcohol());
		
	}

	@Test
	public void testIsMaxFruit() {
		
		bevshoptest1.processSmoothieOrder("Smoothie", Size.SMALL, 7, false);
		
		assertTrue(bevshoptest1.isMaxFruit(7));
		
	}

	@Test
	public void testGetMaxOrderForAlcohol() {
		
		assertEquals(3, bevshoptest1.getMaxOrderForAlcohol(), 0);
		
	}

	@Test
	public void testIsEligibleForMore() {
		
		bevshoptest1.processAlcoholOrder("Beer", Size.LARGE);
		bevshoptest1.processAlcoholOrder("Rum", Size.LARGE);
		bevshoptest1.processAlcoholOrder("Whiskey", Size.LARGE);
		
		assertFalse(bevshoptest1.isEligibleForMore());
		
	}

	@Test
	public void testGetNumOfAlcoholDrink() {
		
		bevshoptest1.processAlcoholOrder("Beer", Size.LARGE);
		bevshoptest1.processAlcoholOrder("Rum", Size.LARGE);
		bevshoptest1.processAlcoholOrder("Whiskey", Size.LARGE);
		
		assertEquals(3, bevshoptest1.getNumOfAlcoholDrink());
		
	}

	@Test
	public void testIsValidAge() {
		
		assertTrue(bevshoptest1.isValidAge(bevshoptest1.getCurrentOrder().getCustomer().getAge()));
		
	}

	@Test
	public void testTotalMonthlySale() {
		
		bevshoptest1.processAlcoholOrder("Beer", Size.LARGE);
		bevshoptest1.processCoffeeOrder("Regular", Size.MEDIUM, true, false);
		bevshoptest1.processSmoothieOrder("Berry Smoothie", Size.SMALL, 1, false);
		
		bevshoptest1.startNewOrder(12, Day.TUESDAY, "Ben", 19);
		
		bevshoptest1.processCoffeeOrder("Latte", Size.MEDIUM, true, true);
		bevshoptest1.processSmoothieOrder("Smoothie", Size.SMALL, 3, false);
		
		assertEquals(2, bevshoptest1.totalNumOfMonthlyOrders());
		
		assertEquals(17.5, bevshoptest1.totalMonthlySale());
		
	}

	@Test
	public void testGetCurrentOrder() {
		
		bevshoptest1.processAlcoholOrder("Beer", Size.LARGE);
		bevshoptest1.processCoffeeOrder("Regular", Size.MEDIUM, true, false);
		bevshoptest1.processSmoothieOrder("Berry Smoothie", Size.SMALL, 1, false);
		
		bevshoptest1.startNewOrder(12, Day.TUESDAY, "Ann", 19);
		
		bevshoptest1.processCoffeeOrder("Latte", Size.MEDIUM, true, true);
		bevshoptest1.processSmoothieOrder("Smoothie", Size.SMALL, 3, false);
		
		assertEquals(7.5, bevshoptest1.getCurrentOrder().calcOrderTotal());
		
	}

	@Test
	public void testGetOrderAtIndex() {
		
		bevshoptest1.processAlcoholOrder("Beer", Size.LARGE);
		bevshoptest1.processCoffeeOrder("Regular", Size.MEDIUM, true, false);
		bevshoptest1.processSmoothieOrder("Berry Smoothie", Size.SMALL, 1, false);
		
		bevshoptest1.startNewOrder(12, Day.TUESDAY, "Ann", 19);
		
		bevshoptest1.processCoffeeOrder("Latte", Size.MEDIUM, true, true);
		bevshoptest1.processSmoothieOrder("Smoothie", Size.SMALL, 3, false);
		
		assertEquals(7.5, bevshoptest1.getOrderAtIndex(1).calcOrderTotal());
		
	}

}