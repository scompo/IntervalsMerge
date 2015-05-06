package it.scompo.intervals.merge.test.utils;

import static it.scompo.intervals.merge.test.IntervalsConstants.INTERVALS_EMPTY;
import static it.scompo.intervals.merge.test.IntervalsConstants.INTERVALS_JUST_ONE;
import static it.scompo.intervals.merge.test.IntervalsConstants.INTERVALS_MERGED_EXPECTED;
import static it.scompo.intervals.merge.test.IntervalsConstants.INTERVALS_TO_MERGE;
import static org.junit.Assert.assertEquals;
import it.scompo.intervals.merge.Interval;
import it.scompo.intervals.merge.IntervalMergingAlgorithm;
import it.scompo.intervals.merge.algorithms.First;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestMergeIntervals {

	private IntervalMergingAlgorithm<Integer> mergingAlgorithm;

	@Before
	public void setUp() throws Exception {

		mergingAlgorithm = new First<Integer>();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {

		List<Interval<Integer>> res = null;

		res = mergingAlgorithm.merge(INTERVALS_TO_MERGE);

		assertEquals(INTERVALS_MERGED_EXPECTED, res);
	}
	
	@Test
	public void testWithNull() {

		List<Interval<Integer>> res = null;

		res = mergingAlgorithm.merge(null);

		assertEquals(INTERVALS_EMPTY, res);
	}
	
	@Test
	public void testOnlyElement() {

		List<Interval<Integer>> res = null;

		res = mergingAlgorithm.merge(INTERVALS_JUST_ONE);

		assertEquals(INTERVALS_JUST_ONE, res);
	}
	
	@Test
	public void testWithEmpty() {

		List<Interval<Integer>> res = null;

		res = mergingAlgorithm.merge(INTERVALS_EMPTY);

		assertEquals(INTERVALS_EMPTY, res);
	}

}
