package it.scompo.intervals.merge.implementations.integer;

import it.scompo.intervals.merge.Interval;
import it.scompo.intervals.merge.IntervalsOverlapChecker;
import it.scompo.intervals.merge.algorithms.AbstractFirstMerginAlgorithm;
import it.scompo.intervals.merge.utils.ConsecutiveChecker;
import it.scompo.intervals.merge.utils.OverlapCheck;

public class FirstAlgorithmIntegerImplementation extends
		AbstractFirstMerginAlgorithm<Integer> {

	private static ConsecutiveChecker<Interval<Integer>> consecutiveChecker = IntegerConsecutiveChecker.getInstance();

	private static IntervalsOverlapChecker<Integer> overlapChecker = new OverlapCheck<Integer>();

	public FirstAlgorithmIntegerImplementation() {

		super(consecutiveChecker, overlapChecker);
	}

}
