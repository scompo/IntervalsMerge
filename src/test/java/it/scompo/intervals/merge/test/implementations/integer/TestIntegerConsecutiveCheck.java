package it.scompo.intervals.merge.test.implementations.integer;

import static it.scompo.intervals.merge.test.IntervalsConstants.ONE_ONE;
import static it.scompo.intervals.merge.test.IntervalsConstants.ONE_THREE;
import static it.scompo.intervals.merge.test.IntervalsConstants.THREE_THREE;
import static it.scompo.intervals.merge.test.IntervalsConstants.TWO_TWO;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import it.scompo.intervals.merge.ConsecutiveChecker;
import it.scompo.intervals.merge.Interval;
import it.scompo.intervals.merge.implementations.integer.IntegerConsecutiveChecker;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestIntegerConsecutiveCheck {
	
	private ConsecutiveChecker<Interval<Integer>> checker;

	@Before
	public void setUp() throws Exception {
		
		checker = IntegerConsecutiveChecker.getInstance();
	}

	@After
	public void tearDown() throws Exception {
		
		checker = null;
	}

	@Test
	public void testConsecutiveTrue() {

		assertTrue(checker.isConsecutive(ONE_ONE, TWO_TWO));
		assertTrue(checker.isConsecutive(TWO_TWO, ONE_ONE));
	}
	
	@Test
	public void testConsecutiveFalse() {

		assertFalse(checker.isConsecutive(ONE_ONE, THREE_THREE));
		assertFalse(checker.isConsecutive(ONE_ONE, ONE_THREE));
	}

	@Test
	public void testConsecutiveSameNumber() {

		assertFalse(checker.isConsecutive(ONE_ONE, ONE_ONE));
	}
}
