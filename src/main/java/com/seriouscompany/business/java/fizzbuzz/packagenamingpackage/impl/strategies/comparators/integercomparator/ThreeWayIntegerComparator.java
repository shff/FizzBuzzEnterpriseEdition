package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.strategies.comparators.integercomparator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.springframework.stereotype.Service;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.Constants;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.comparers.AbstractComparator;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.comparers.ResultStrategy;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.strategies.comparators.AbstractIntegerComparator;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.strategies.comparators.integercomparator.strategies.FirstEqualSecondResultStrategy;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.strategies.comparators.integercomparator.strategies.FirstIsGreaterThanSecondResultStrategy;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.strategies.comparators.integercomparator.strategies.FirstIsLessThanSecondResultStrategy;

/**
 * Comparator for ThreeWayInteger
 */
@Service
public final class ThreeWayIntegerComparator implements AbstractComparator {

	private final List<ResultStrategy> contexts;
	private final AbstractIntegerComparator myAbstractIntegerComparator;

	public ThreeWayIntegerComparator() {
		this.contexts = new ArrayList<ResultStrategy>();
		this.contexts.add(new FirstEqualSecondResultStrategy());
		this.contexts.add(new FirstIsLessThanSecondResultStrategy());
		this.contexts.add(new FirstIsGreaterThanSecondResultStrategy());
		this.myAbstractIntegerComparator = new AbstractIntegerComparator(this.contexts);
	}

	/**
	 * @param nFirstInteger int
	 * @param nSecondInteger int
	 * @return ThreeWayIntegerComparisonResult
	 */
	public ThreeWayIntegerComparisonResult Compare(final int nFirstInteger, final int nSecondInteger) {
		return (ThreeWayIntegerComparisonResult)this.myAbstractIntegerComparator.Compare(nFirstInteger, nSecondInteger);
	}

}
