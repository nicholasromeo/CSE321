import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MathFunctionsTest {
	private int a;
	private int b;

	@Before
	public void setUp() {
		a = 2;
		b = 2;
	}
	
	@Test
	public void addTest(){
		assertEquals(4, MathFunctions.add(a, b));
	}
	
	@Test
	public void subTest(){
		assertEquals(0,MathFunctions.subtract(a, b));
	}
}

