package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.strategies.comparators.integercomparator.strategies;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.comparers.ResultStrategy;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.strategies.comparators.integercomparator.ThreeWayIntegerComparisonResult;

public final class FirstEqualSecondResultStrategy implements ResultStrategy {
	public boolean checkResult(final int nFirstInteger, final int nSecondInteger) {
		if (nFirstInteger == nSecondInteger) {
			return true;
		} else {
			return false;
		}
	}

	public ThreeWayIntegerComparisonResult getResult() {
		return ThreeWayIntegerComparisonResult.FirstEqualsSecond;
	}
}
