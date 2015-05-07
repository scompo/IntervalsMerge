package it.scompo.intervals.merge.implementations.integer;

import it.scompo.intervals.merge.Interval;
import it.scompo.intervals.merge.utils.ConsecutiveChecker;

public class IntegerConsecutiveChecker implements
		ConsecutiveChecker<Interval<Integer>> {

	private static IntegerConsecutiveChecker instance;
	
	private IntegerConsecutiveChecker() {

	}

	@Override
	public boolean isConsecutive(Interval<Integer> t1, Interval<Integer> t2) {

		return t1.getEnd().equals(t2.getStart() - 1)
				|| t1.getStart().equals(t2.getEnd() + 1);
	}
	
	public static IntegerConsecutiveChecker getInstance(){
		
		if(instance == null){
			
			instance= new IntegerConsecutiveChecker();
		}
		
		return instance;
	}

}
