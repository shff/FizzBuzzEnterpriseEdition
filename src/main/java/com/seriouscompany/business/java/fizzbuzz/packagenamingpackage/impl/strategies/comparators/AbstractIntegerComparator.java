package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.strategies.comparators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.springframework.stereotype.Service;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.Constants;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.comparers.AbstractComparator;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.comparers.AbstractComparisonResult;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.comparers.ResultStrategy;

/**
 * Comparator for ThreeWayInteger
 */
public final class AbstractIntegerComparator implements AbstractComparator {

	private final List<ResultStrategy> contexts;

	public AbstractIntegerComparator(List<ResultStrategy> contexts) {
    this.contexts = contexts;
  }

	/**
	 * @param nFirstInteger int
	 * @param nSecondInteger int
	 * @return AbstractComparisonResult
	 */
	public AbstractComparisonResult Compare(final int nFirstInteger, final int nSecondInteger) {
		final Iterator<ResultStrategy> iterator = this.contexts.iterator();
		while (iterator.hasNext()) {
			final ResultStrategy context = iterator.next();
			if (context.checkResult(nFirstInteger, nSecondInteger)) {
				return context.getResult();
			}
		}

		// If the integers cannot be compared, then something is seriously wrong with the numbers.
		throw new UnsupportedOperationException(Constants.THE_INTEGERS_COULD_NOT_BE_COMPARED);
	}

}
