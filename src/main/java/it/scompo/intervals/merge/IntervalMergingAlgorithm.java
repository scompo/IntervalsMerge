package it.scompo.intervals.merge;

import java.util.List;

public interface IntervalMergingAlgorithm <T extends Number & Comparable<? super T>>{

	List<Interval<T>> merge(List<Interval<T>> toMerge);
}
