package testing;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import calsi.Calculator;

class CalculatorTest {

	static Calculator cal;

	@BeforeAll
	public static void beforeAll() {
		System.out.println("BeforeAll");
		cal = new Calculator();

	}
	
	@AfterAll
	public static void afterAll() {
		
			System.out.println("AfterAll");
		
	}
	
	@BeforeEach
	public void before() {
		
		System.out.println("BeforeEach");
		
	}
	
	@AfterEach
	public void after() {
		
		System.out.println("AfterEach");
		
	}
	
	
	

	@Test
	@DisplayName("add")
	void testAdd() {

		int actual = cal.add(5, 4);

		assertEquals(9, actual);

		// assertNotNull(cal);
		System.out.println("testAdd()");

	}

	@Test
	@DisplayName("sub")
	//@Disabled
	void testSub() {

		int actual = cal.sub(5, 5);

		assertEquals(0, actual);

		assertNotEquals(1, actual);

		System.out.println("testSub()");

	}

}
