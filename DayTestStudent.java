import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class DayTestStudent {

	@Test
	public void test() {
		
		Day dayOne = Day.MONDAY;
		assertTrue(dayOne.compareTo(Day.TUESDAY) < 0);
		
		Day dayThree = Day.WEDNESDAY;
		assertTrue(dayThree.compareTo(Day.TUESDAY) > 0);
		
		assertTrue(dayThree.compareTo(Day.WEDNESDAY) == 0);
		
	}

}