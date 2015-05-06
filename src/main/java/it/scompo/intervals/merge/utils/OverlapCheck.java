package it.scompo.intervals.merge.utils;

import it.scompo.intervals.merge.Interval;

public abstract class OverlapCheck {

	private OverlapCheck() {

	}

	public static <T extends Number & Comparable<? super T>> boolean overlapping(
			Interval<T> first, Interval<T> second) {
		
		long firstStart = first.getStart().longValue();
		long firstEnd = first.getEnd().longValue();

		long secondStart = second.getStart().longValue();
		long secondEnd = second.getEnd().longValue();
		
		if(firstStart <= secondEnd && secondStart <= firstEnd){
			
			return true;
		}

		return false;
	}

}
