package it.scompo.intervals.merge.test.utils;

import static it.scompo.intervals.merge.utils.OverlapCheck.overlapping;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import it.scompo.intervals.merge.Interval;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestOverlapCheck {

	private static final Interval<Integer> ZEROES = new Interval<Integer>(0, 0);
	private static final Interval<Integer> ONES = new Interval<Integer>(1, 1);
	private static final Interval<Integer> TWOS = new Interval<Integer>(2, 2);
	private static final Interval<Integer> ONE_THREE = new Interval<Integer>(1,
			3);
	private static final Interval<Integer> TWO_THREE = new Interval<Integer>(2,
			3);

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testConsecutiveFalses() {

		assertFalse(overlapping(ONES, TWOS));
		assertFalse(overlapping(ZEROES, TWOS));
	}

	@Test
	public void testAllInside() {

		assertTrue(overlapping(TWOS, ONE_THREE));
		assertTrue(overlapping(ONE_THREE, TWOS));
	}

	@Test
	public void testSameStartOverlapMore() {

		assertTrue(overlapping(ONES, ONE_THREE));
		assertTrue(overlapping(ONE_THREE, ONES));
	}
	
	@Test
	public void testSame() {

		assertTrue(overlapping(ONES, ONES));
		assertTrue(overlapping(ONE_THREE, ONE_THREE));
		assertTrue(overlapping(TWOS, TWOS));
	}
	
	@Test
	public void testOverlapLessSameEnd() {

		assertTrue(overlapping(TWO_THREE, ONE_THREE));
		assertTrue(overlapping(ONE_THREE, TWO_THREE));
	}

}
