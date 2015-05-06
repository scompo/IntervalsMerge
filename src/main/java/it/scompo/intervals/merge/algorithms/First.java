package it.scompo.intervals.merge.algorithms;

import static it.scompo.intervals.merge.utils.ConsecutiveCheck.consecutive;
import static it.scompo.intervals.merge.utils.NullChek.notNullElement;
import static it.scompo.intervals.merge.utils.OverlapCheck.overlapping;
import static it.scompo.intervals.merge.utils.ScompoSerializationUtils.cloneCollection;
import it.scompo.intervals.merge.Interval;
import it.scompo.intervals.merge.IntervalMergingAlgorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class First<T extends Number & Comparable<? super T>> implements
		IntervalMergingAlgorithm<T> {

	private static final int FIRST_ELEMENT = 0;
	private Comparator<Interval<T>> COMPARATOR = new Comparator<Interval<T>>() {

		public int compare(Interval<T> o1, Interval<T> o2) {
			
			return o1.getStart().compareTo(o2.getStart());
		}

	};

	public List<Interval<T>> merge(List<Interval<T>> toMerge) {

		List<Interval<T>> res = new ArrayList<Interval<T>>();

		if (notNullElement(toMerge) && !toMerge.isEmpty()) {

			List<Interval<T>> temp = cloneCollection(toMerge);

			Collections.sort(temp, COMPARATOR);

			Interval<T> last = temp.get(FIRST_ELEMENT);

			for (int i = 1; i < temp.size(); i++) {

				Interval<T> current = temp.get(i);

				if (consecutiveOrOverlappingIntervals(last, current)) {

					T maxEnd = max(current.getEnd(), last.getEnd());

					T minStart = min(current.getStart(), last.getStart());
					
					last.setStart(minStart);
					last.setEnd(maxEnd);
					
				} else {

					res.add(last);
					last = current;
				}
			}
			
			res.add(last);

		}

		return res;
	}
	
	private T min(T first, T second) {
		
		if (first.compareTo(second) <= 0) {

			return first;

		} else {

			return second;
		}
	}

	public static <T extends Number & Comparable<? super T>> boolean consecutiveOrOverlappingIntervals(Interval<T> first,
			Interval<T> second) {

		boolean res = false;

		if (consecutive(first, second) || overlapping(first, second)) {

			res = true;
		}

		return res;
	}

	private T max(T first, T second) {

		if (first.compareTo(second) >= 0) {

			return first;

		} else {

			return second;
		}
	}

	public boolean onlyOneElement(List<Interval<T>> temp) {

		return notNullElement(temp) && temp.size() == 1;
	}

}
