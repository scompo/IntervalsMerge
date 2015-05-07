package it.scompo.intervals.merge.test.utils;

import static it.scompo.intervals.merge.utils.CollectionsUtils.deepCopyCollectionIntoList;
import static it.scompo.intervals.merge.utils.CollectionsUtils.onlyOneElement;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestCollectionsUtils {

	private static final Integer[] LIST_NO_ELEMENTS = new Integer[]{};
	private static final Integer[] LIST_TWO_ELEMENTS = new Integer[]{1,2};
	private static final Integer[] LIST_ONLY_ONE_ELEMENT = new Integer[]{1};

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testOnlyOneElement() {
		
		assertTrue(onlyOneElement(Arrays.asList(LIST_ONLY_ONE_ELEMENT)));
		assertFalse(onlyOneElement(Arrays.asList(LIST_TWO_ELEMENTS)));
		assertFalse(onlyOneElement(Arrays.asList(LIST_NO_ELEMENTS)));
		assertFalse(onlyOneElement(null));
	}
	
	@Test
	public void testDeepCopyCollectionIntoList() {
		
		
		List<Integer> asList = Arrays.asList(LIST_TWO_ELEMENTS);
		
		List<Integer> res = deepCopyCollectionIntoList(asList);	
		
		assertFalse(res == asList);
		
		for (int i = 0; i < LIST_NO_ELEMENTS.length; i++) {
			
			Integer integer = LIST_NO_ELEMENTS[i];
			
			Integer integerRes = res.get(0);	
			
			assertFalse(integerRes == integer);
		}
	}

}
