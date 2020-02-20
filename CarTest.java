import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CarTest {
	private final int RANGE = 100;
	private Car car;

	@Before
	public void setUp() throws Exception {
		car = new Car(RANGE);
	}

	@Test
	public void testCar() {
		Car car = new Car(RANGE);
		fail("Not yet implemented");
	}

	@Test
	public void testEqualsCar() {
		fail("Not yet implemented");
	}

	@Test
	public void testEqualsObject() {
		Object o = new String("Car");
		boolean actual = car.equals(o);
		boolean expected = false;
		assertEquals(expected, actual);
		
		o = new Car(RANGE);
		expected = true;
		actual = car.equals(o);
		assertEquals(expected, actual);
	}

	@Test
	public void testToString() {
		// Meet the stringent government requirements
		// for product information
		
		String expected = "This car has a range of 100 miles";
		String actual = car.toString();
		String msg = "Strings informing about the range don't match";
		
		assertEquals(msg, expected, actual);

	}

}
