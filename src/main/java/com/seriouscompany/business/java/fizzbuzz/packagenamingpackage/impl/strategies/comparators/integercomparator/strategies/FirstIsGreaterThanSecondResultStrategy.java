package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.strategies.comparators.integercomparator.strategies;

import org.springframework.stereotype.Service;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.comparers.ResultStrategy;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.strategies.comparators.integercomparator.ThreeWayIntegerComparisonResult;

@Service
public final class FirstIsGreaterThanSecondResultStrategy implements ResultStrategy {
	public boolean checkResult(final int nFirstInteger, final int nSecondInteger) {
		if (nFirstInteger > nSecondInteger) {
			return true;
		} else {
			return false;
		}
	}

	public ThreeWayIntegerComparisonResult getResult() {
		return ThreeWayIntegerComparisonResult.FirstIsGreaterThanSecond;
	}
}
