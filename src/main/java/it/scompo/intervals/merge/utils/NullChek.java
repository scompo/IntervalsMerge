package it.scompo.intervals.merge.utils;

public abstract class NullChek {

	private NullChek() {

	}

	public static <T> boolean notNullElement(T element) {

		return !nullElement(element);
	}

	public static <T> boolean nullElement(T element) {

		return element == null;
	}
}
