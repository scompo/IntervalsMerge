package it.scompo.intervals.merge.utils;

public class ComparisonUtils {

	private ComparisonUtils() {
		
	}

	public static <T extends Comparable<? super T>> T max(T first, T second) {

		if (first.compareTo(second) >= 0) {

			return first;

		} else {

			return second;
		}
	}
	
	public static <T extends Comparable<? super T>> T min(T first, T second) {
		
		if (first.compareTo(second) <= 0) {

			return first;

		} else {

			return second;
		}
	}
}
