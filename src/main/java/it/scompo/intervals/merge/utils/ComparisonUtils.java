package it.scompo.intervals.merge.utils;

import static it.scompo.intervals.merge.utils.NullChekUtils.notNullElement;

public class ComparisonUtils {

	private ComparisonUtils() {

	}

	public static <T extends Comparable<? super T>> T max(T first, T second) {

		T res = null;

		if (notNullElement(first) && notNullElement(second)) {

			if (first.compareTo(second) >= 0) {

				res = first;

			} else {

				res = second;
			}
		}

		return res;

	}

	public static <T extends Comparable<? super T>> T min(T first, T second) {

		T res = null;
		
		if (notNullElement(first) && notNullElement(second)) {

			if (first.compareTo(second) <= 0) {

				res = first;

			} else {

				res = second;
			}
		}
		
		return res;
	}
}
