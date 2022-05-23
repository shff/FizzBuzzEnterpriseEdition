package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.loop;

import org.springframework.stereotype.Service;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.strategies.comparators.integercomparator.ThreeWayIntegerComparisonResult;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.comparers.AbstractComparator;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.comparers.AbstractComparisonResult;

/**
 * LoopCondition
 */
@Service
public class LoopCondition {

	private AbstractComparator myAbstractComparator;

	/**
	 * @param myAbstractComparator AbstractComparator
	 */
	public LoopCondition(final AbstractComparator myAbstractComparator) {
		super();
		this.myAbstractComparator = myAbstractComparator;
	}

	/**
	 * @param nCurrentNumber int
	 * @param nTotalCount int
	 * @return boolean
	 */
	public boolean evaluateLoop(final int nCurrentNumber, final int nTotalCount) {
		final ThreeWayIntegerComparisonResult comparisonResult = (ThreeWayIntegerComparisonResult)
			myAbstractComparator.Compare(nCurrentNumber, nTotalCount);
		if (ThreeWayIntegerComparisonResult.FirstIsLessThanSecond == comparisonResult) {
			return true;
		} else if (ThreeWayIntegerComparisonResult.FirstEqualsSecond == comparisonResult) {
			return true;
		} else {
			return false;
		}
	}

}
