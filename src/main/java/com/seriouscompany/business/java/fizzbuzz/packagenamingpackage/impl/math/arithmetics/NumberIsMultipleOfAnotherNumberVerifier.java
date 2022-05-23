package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.math.arithmetics;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.ApplicationContextHolder;
import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.Constants;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.strategies.comparators.integercomparator.IntegerForEqualityComparator;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.strategies.comparators.integercomparator.ThreeWayIntegerComparator;

/**
 * NumberIsMultipleOfAnotherNumberVerifier
 */
@Service
public class NumberIsMultipleOfAnotherNumberVerifier {

	private IntegerDivider integerDivider;
	private ApplicationContextHolder applicationContextHolder;

	/**
	 * @param integerDivider IntegerDivider
	 */
	public NumberIsMultipleOfAnotherNumberVerifier(final IntegerDivider integerDivider) {
		super();
		this.integerDivider = integerDivider;
		final ApplicationContext applicationContext = this.applicationContextHolder.getApplicationContext();
	}

	/**
	 * @param nFirstInteger int
	 * @param nSecondInteger int
	 * @return boolean
	 */
	public boolean isNumberMultipleOfAnotherNumber(final int nFirstInteger, final int nSecondInteger) {
		final int nQuotient = this.integerDivider.divide(nFirstInteger, nSecondInteger);
		final boolean isNumberMultipleOfAnotherNumber =
				new IntegerForEqualityComparator(new ThreeWayIntegerComparator()).areTwoIntegersEqual(nQuotient, Constants.INTEGER_ORIGIN_ZERO_VALUE);
		return isNumberMultipleOfAnotherNumber;
	}

	/**
	 * @param nFirstNumber
	 * @param nSecondNumber
	 * @return
	 */
	public boolean numberIsMultipleOfAnotherNumber(final int nFirstNumber, final int nSecondNumber) {
		try {
			final int nDivideFirstIntegerBySecondIntegerResult =
					(this.integerDivider.divide(nFirstNumber, nSecondNumber));
			final int nMultiplyDivisionResultBySecondIntegerResult =
					nDivideFirstIntegerBySecondIntegerResult * nSecondNumber;
			if (new IntegerForEqualityComparator(new ThreeWayIntegerComparator()).areTwoIntegersEqual(nMultiplyDivisionResultBySecondIntegerResult,
					nFirstNumber)) {
				return true;
			} else {
				return false;
			}
		} catch (final ArithmeticException ae) {
			return false;
		}
	}

}
