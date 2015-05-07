package it.scompo.intervals.merge.utils;

import static it.scompo.intervals.merge.utils.NullChekUtils.notNullElement;

import java.util.Collection;

public abstract class CollectionsUtils {

	private CollectionsUtils() {

	}

	public static <E> boolean onlyOneElement(Collection<E> temp) {

		return notNullElement(temp) && temp.size() == 1;
	}
}
