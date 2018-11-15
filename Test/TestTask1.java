import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestTask1 {

	Task1 test = new Task1();
//	@BeforeClass
//	public static void setUpBeforeClass() throws Exception {
//	}
//
//	@AfterClass
//	public static void tearDownAfterClass() throws Exception {
//	}
//
//	@Before
//	public void setUp() throws Exception {
//	}
//
//	@After
//	public void tearDown() throws Exception {
//	}

	@Test
	public void main() {
		
	}
	@Test
	public void testAdd() {
		assertEquals(test.add(5, 2),7);
	}

	@Test
	public void testMinus() {
		assertEquals(test.minus(7, 2), 5);
	}

	@Test
	public void testMult() {
		assertEquals(test.mult(7, 2), 14);
	}

	@Test
	public void testDiv() {
		assertEquals(test.div(14, 2), 7);
	}

}
