package it.scompo.intervals.merge;

import java.util.Comparator;

public class IntervalStartComparator<T extends Comparable<T>> implements
		Comparator<Interval<T>> {

	public IntervalStartComparator() {

	}

	@Override
	public int compare(Interval<T> o1, Interval<T> o2) {

		return o1.getStart().compareTo(o2.getStart());
	}

}
