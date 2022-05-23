package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.strategies.comparators.integercomparator;

import org.springframework.stereotype.Service;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.comparers.AbstractComparator;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.comparers.AbstractComparisonResult;

/**
 * Comparator for IntegerForEquality
 */
@Service
public final class IntegerForEqualityComparator {

	private AbstractComparator myAbstractComparator;

	/**
	 * @param myAbstractComparator AbstractComparator
	 */
	public IntegerForEqualityComparator(final AbstractComparator myAbstractComparator) {
		super();
		this.myAbstractComparator = myAbstractComparator;
	}

	/**
	 * @param nFirstInteger int
	 * @param nSecondInteger int
	 * @return boolean
	 */
	public boolean areTwoIntegersEqual(final int nFirstInteger, final int nSecondInteger) {
		final ThreeWayIntegerComparisonResult comparisonResult =
				(ThreeWayIntegerComparisonResult)myAbstractComparator.Compare(nFirstInteger, nSecondInteger);
		if (ThreeWayIntegerComparisonResult.FirstEqualsSecond == comparisonResult) {
			return true;
		} else {
			return false;
		}
	}
}
