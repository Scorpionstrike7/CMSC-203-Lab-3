import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GradeBookTest {

	@AfterAll
	public static void tearDownAfterClass() throws Exception {
	}
		GradeBook g1;
		GradeBook g2;
	@BeforeEach
	public void setUp() throws Exception {
		g1 = new GradeBook(5);
		g1.addScore(38.0);
		g1.addScore(76.0);
		
		g2 = new GradeBook(5);
		g2.addScore(49.0);
		g2.addScore(91.0);
	}

	@AfterEach
	public void tearDown() throws Exception {
		g1 = null;
		g2 = null;
	}

	@Test
	public void AddScoreTest() {
		assertTrue((g1.toString()).equals("38.0 76.0 "));
		assertTrue((g2.toString()).equals("49.0 91.0 "));
		
		assertEquals(2, g1.getScoreSize(), .01);
		assertEquals(2, g2.getScoreSize(), .01);
	}

	@Test
	public void testSum() {
		assertEquals(114.0, g1.sum(), .0001);
		assertEquals(140.0, g2.sum(), .0001);
	}

	@Test
	public void testMinimum() {
		assertEquals(38.0, g1.minimum(), .001);
		assertEquals(49.0, g2.minimum(), .001);
	}

	@Test
	public void testGetScoreSize() {
	}

	@Test
	public void testToStringString() {
	}

	@Test
	public void testFinalScore() {
		assertEquals(76, g1.finalScore(), .001);
		assertEquals(91, g2.finalScore(), .001);
	}
}
