package it.scompo.intervals.merge.test.utils;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import it.scompo.intervals.merge.Interval;
import it.scompo.intervals.merge.IntervalsOverlapChecker;
import it.scompo.intervals.merge.utils.OverlapCheck;

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
	
	private IntervalsOverlapChecker<Integer> checker;

	@Before
	public void setUp() throws Exception {
		
		checker = new OverlapCheck<Integer>();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testConsecutiveFalses() {

		assertFalse(checker.overlappingIntervals(ONES, TWOS));
		assertFalse(checker.overlappingIntervals(ZEROES, TWOS));
	}

	@Test
	public void testAllInside() {

		assertTrue(checker.overlappingIntervals(TWOS, ONE_THREE));
		assertTrue(checker.overlappingIntervals(ONE_THREE, TWOS));
	}

	@Test
	public void testSameStartOverlapMore() {

		assertTrue(checker.overlappingIntervals(ONES, ONE_THREE));
		assertTrue(checker.overlappingIntervals(ONE_THREE, ONES));
	}
	
	@Test
	public void testSame() {

		assertTrue(checker.overlappingIntervals(ONES, ONES));
		assertTrue(checker.overlappingIntervals(ONE_THREE, ONE_THREE));
		assertTrue(checker.overlappingIntervals(TWOS, TWOS));
	}
	
	@Test
	public void testOverlapLessSameEnd() {

		assertTrue(checker.overlappingIntervals(TWO_THREE, ONE_THREE));
		assertTrue(checker.overlappingIntervals(ONE_THREE, TWO_THREE));
	}

}
