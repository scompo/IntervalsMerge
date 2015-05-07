package it.scompo.intervals.merge.test.utils;

import static it.scompo.intervals.merge.utils.ComparisonUtils.max;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestComparisonUtils {

	private static final Integer BIG = 100;
	private static final Integer SMALL = 1;

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testMax() {

		assertEquals(BIG, max(SMALL, BIG));
		assertEquals(BIG, max(BIG, SMALL));
		assertEquals(BIG, max(BIG, BIG));
		assertEquals(null, max(null, null));
	}

	@Test
	public void testMin() {
		fail("Not yet implemented");
	}

}
