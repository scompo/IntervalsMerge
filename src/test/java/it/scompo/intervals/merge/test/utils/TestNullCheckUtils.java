package it.scompo.intervals.merge.test.utils;

import static it.scompo.intervals.merge.utils.NullChekUtils.notNullElement;
import static it.scompo.intervals.merge.utils.NullChekUtils.nullElement;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestNullCheckUtils {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testNotNullElement() {
		
		assertTrue(notNullElement(""));
		assertFalse(notNullElement(null));
	}

	@Test
	public void testNullElement() {
		
		assertTrue(nullElement(null));
		assertFalse(nullElement(""));
	}

}
