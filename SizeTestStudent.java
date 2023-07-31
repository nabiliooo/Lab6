import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class SizeTestStudent {

	@Test
	public void test() {
		
		Size size1 = Size.SMALL;
		Size size2 = Size.MEDIUM;
		Size size3 = Size.LARGE;
		
		assertTrue(size1.compareTo(size2) < 0);
		assertTrue(size3.compareTo(size2) > 0);
		assertTrue(size3.compareTo(size3) == 0);
		
		
		
	}

}