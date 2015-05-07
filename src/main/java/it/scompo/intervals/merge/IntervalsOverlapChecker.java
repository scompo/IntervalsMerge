package it.scompo.intervals.merge;


public interface IntervalsOverlapChecker<T extends Comparable<T>> {

	boolean overlappingIntervals(Interval<T> first, Interval<T> second);
}
