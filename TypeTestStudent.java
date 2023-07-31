import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class TypeTestStudent {

	@Test
	public void test() {
		
		Type typeOne = Type.ALCOHOL;
		Type typeTwo = Type.COFFEE;
		Type typeThree = Type.SMOOTHIE;
		
		assertFalse(typeOne.equals(typeTwo));
		assertFalse(typeTwo.equals(typeThree));
		assertFalse(typeThree.equals(typeOne));
		
	}

}