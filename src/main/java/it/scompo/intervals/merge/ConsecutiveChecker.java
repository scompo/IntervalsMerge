package it.scompo.intervals.merge;


public interface ConsecutiveChecker<T extends Interval<?>> {

	boolean isConsecutive(T t1, T t2);
}
