package it.scompo.intervals.merge.algorithms;

import static it.scompo.intervals.merge.utils.ComparisonUtils.max;
import static it.scompo.intervals.merge.utils.ComparisonUtils.min;
import static it.scompo.intervals.merge.utils.NullChekUtils.notNullElement;
import static it.scompo.intervals.merge.utils.CollectionsUtils.*;
import it.scompo.intervals.merge.ConsecutiveChecker;
import it.scompo.intervals.merge.Interval;
import it.scompo.intervals.merge.IntervalMergingAlgorithm;
import it.scompo.intervals.merge.IntervalStartComparator;
import it.scompo.intervals.merge.IntervalsOverlapChecker;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class AbstractFirstMerginAlgorithm<T extends Comparable<T>>
		implements IntervalMergingAlgorithm<T> {

	private static final int FIRST_ELEMENT = 0;

	private ConsecutiveChecker<Interval<T>> consecutiveChecker;

	private IntervalsOverlapChecker<T> overlapChecker;

	private IntervalStartComparator<T> comparator;
	
	public AbstractFirstMerginAlgorithm(
			ConsecutiveChecker<Interval<T>> consecutiveChecker,
			IntervalsOverlapChecker<T> overlapChecker) {
		
		this.consecutiveChecker = consecutiveChecker;
		this.overlapChecker = overlapChecker;
		this.comparator = new IntervalStartComparator<T>();
	}

	public List<Interval<T>> merge(List<Interval<T>> toMerge) {

		List<Interval<T>> res = new ArrayList<Interval<T>>();

		if (notNullElement(toMerge) && !toMerge.isEmpty()) {

			List<Interval<T>> temp = deepCopyCollectionIntoList(toMerge);

			Collections.sort(temp, comparator);

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

	public boolean consecutiveOrOverlappingIntervals(Interval<T> first,
			Interval<T> second) {

		return consecutiveChecker.isConsecutive(first, second)
				|| overlapChecker.overlappingIntervals(first, second);
	}

}
