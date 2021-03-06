package it.scompo.intervals.merge.utils;

import it.scompo.intervals.merge.Interval;
import it.scompo.intervals.merge.IntervalsOverlapChecker;

public class IntervalOverlapCheckImpl<T extends Comparable<T>> implements IntervalsOverlapChecker<T> {

	public IntervalOverlapCheckImpl() {

	}

	@Override
	public boolean overlappingIntervals(Interval<T> first, Interval<T> second) {

		return first.getStart().compareTo(second.getEnd()) <= 0
				&& second.getStart().compareTo(first.getEnd()) <= 0;
	}

}
