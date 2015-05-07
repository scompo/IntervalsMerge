package it.scompo.intervals.merge.utils;

import it.scompo.intervals.merge.Interval;

public interface ConsecutiveChecker<T extends Interval<?>> {

	boolean isConsecutive(T t1, T t2);
}
