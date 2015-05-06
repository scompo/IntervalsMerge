package it.scompo.intervals.merge.utils;

import it.scompo.intervals.merge.Interval;

public abstract class ConsecutiveCheck {

	private ConsecutiveCheck() {
		
	}

	public static <T extends Number & Comparable<? super T>> boolean consecutive(Interval<T> first, Interval<T> second) {

		boolean consecutive = false;

		long firstStart = first.getStart().longValue();
		long firstEnd = first.getEnd().longValue();

		long secondStart = second.getStart().longValue();
		long secondEnd = second.getEnd().longValue();

		if (firstEnd + 1 == secondStart || secondEnd + 1 == firstStart) {

			consecutive = true;
		}

		return consecutive;
	}
}
