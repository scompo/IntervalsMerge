package it.scompo.intervals.merge;

import java.io.Serializable;

public class Interval<T extends Number & Comparable<? super T>> implements
		Serializable {

	private static final long serialVersionUID = 1L;

	private T start;

	private T end;

	public Interval(T start, T end) {

		this.start = start;
		this.end = end;
	}

	public T getStart() {

		return start;
	}

	public void setStart(T start) {

		this.start = start;
	}

	public T getEnd() {

		return end;
	}

	public void setEnd(T end) {

		this.end = end;
	}

	@Override
	public String toString() {

		return "Interval [start=" + start + ", end=" + end + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((end == null) ? 0 : end.hashCode());
		result = prime * result + ((start == null) ? 0 : start.hashCode());
		return result;
	}

	@SuppressWarnings("unchecked")
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Interval<T> other = (Interval<T>) obj;
		if (end == null) {
			if (other.end != null)
				return false;
		} else if (!end.equals(other.end))
			return false;
		if (start == null) {
			if (other.start != null)
				return false;
		} else if (!start.equals(other.start))
			return false;
		return true;
	}

}
