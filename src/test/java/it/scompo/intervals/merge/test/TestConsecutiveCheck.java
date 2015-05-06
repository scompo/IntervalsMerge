package it.scompo.intervals.merge.test;

import static it.scompo.intervals.merge.test.IntervalsConstants.ONE_ONE;
import static it.scompo.intervals.merge.test.IntervalsConstants.ONE_THREE;
import static it.scompo.intervals.merge.test.IntervalsConstants.THREE_THREE;
import static it.scompo.intervals.merge.test.IntervalsConstants.TWO_TWO;
import static it.scompo.intervals.merge.utils.ConsecutiveCheck.consecutive;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestConsecutiveCheck {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testConsecutive() {

		assertTrue(consecutive(ONE_ONE, TWO_TWO));
		assertTrue(consecutive(TWO_TWO, ONE_ONE));
		assertFalse(consecutive(ONE_ONE, THREE_THREE));
		assertFalse(consecutive(ONE_ONE, ONE_THREE));
	}

}
