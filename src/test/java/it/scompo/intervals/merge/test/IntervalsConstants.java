package it.scompo.intervals.merge.test;

import java.util.ArrayList;
import java.util.List;

import it.scompo.intervals.merge.Interval;

public abstract class IntervalsConstants {

	public static final Interval<Integer> NINE_TWELVE = new Interval<Integer>(
			9, 12);

	public static final Interval<Integer> ONE_THREE = new Interval<Integer>(1,
			3);

	public static final Interval<Integer> TEN_TWELVE = new Interval<Integer>(
			10, 12);

	public static final Interval<Integer> NINE_ELEVEN = new Interval<Integer>(
			9, 11);

	public static final Interval<Integer> THREE_THREE = new Interval<Integer>(
			3, 3);

	public static final Interval<Integer> SIX_SIX = new Interval<Integer>(6, 6);

	public static final Interval<Integer> ONE_ONE = new Interval<Integer>(1, 1);

	public static final Interval<Integer> TWO_TWO = new Interval<Integer>(2, 2);

	public static final List<Interval<Integer>> INTERVALS_TO_MERGE = new ArrayList<Interval<Integer>>() {

		public static final long serialVersionUID = 1L;

		{
			add(TWO_TWO);
			add(TWO_TWO);
			add(ONE_ONE);
			add(SIX_SIX);
			add(THREE_THREE);
			add(NINE_ELEVEN);
			add(TEN_TWELVE);
		}
	};

	public static final List<Interval<Integer>> INTERVALS_MERGED_EXPECTED = new ArrayList<Interval<Integer>>() {

		public static final long serialVersionUID = 1L;

		{
			add(ONE_THREE);
			add(SIX_SIX);
			add(NINE_TWELVE);
		}
	};

	public static final List<Interval<Integer>> INTERVALS_JUST_ONE = new ArrayList<Interval<Integer>>() {

		public static final long serialVersionUID = 1L;

		{
			add(TWO_TWO);
		}
	};

	public static final List<Interval<Integer>> INTERVALS_EMPTY = new ArrayList<Interval<Integer>>();

	private IntervalsConstants() {

	}

}
