package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.strategies;

import org.springframework.stereotype.Service;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.strategies.IsEvenlyDivisibleStrategy;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.strategies.constants.NoFizzNoBuzzStrategyConstants;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.math.arithmetics.NumberIsMultipleOfAnotherNumberVerifier;

/**
 * Strategy for NoFizzNoBuzz
 */
@Service
public class NoFizzNoBuzzStrategy implements IsEvenlyDivisibleStrategy {

	private final NumberIsMultipleOfAnotherNumberVerifier myNumberIsMultipleOfAnotherNumberVerifier;

	/**
	 * @param theNumberIsMultipleOfAnotherNumberVerifier
	 *            NumberIsMultipleOfAnotherNumberVerifier
	 */
	public NoFizzNoBuzzStrategy(final NumberIsMultipleOfAnotherNumberVerifier theNumberIsMultipleOfAnotherNumberVerifier) {
		super();
		this.myNumberIsMultipleOfAnotherNumberVerifier = theNumberIsMultipleOfAnotherNumberVerifier;
	}

	/**
	 * @param theInteger int
	 * @return boolean
	 */
	public boolean isEvenlyDivisible(final int theInteger) {
		if (!myNumberIsMultipleOfAnotherNumberVerifier.numberIsMultipleOfAnotherNumber(theInteger,
				NoFizzNoBuzzStrategyConstants.NO_FIZZ_INTEGER_CONSTANT_VALUE)) {
			if (!myNumberIsMultipleOfAnotherNumberVerifier.numberIsMultipleOfAnotherNumber(theInteger,
					NoFizzNoBuzzStrategyConstants.NO_BUZZ_INTEGER_CONSTANT_VALUE)) {
				return true;
			} else {
				return false;
			}
		} else if (!myNumberIsMultipleOfAnotherNumberVerifier.numberIsMultipleOfAnotherNumber(theInteger,
				NoFizzNoBuzzStrategyConstants.NO_BUZZ_INTEGER_CONSTANT_VALUE)) {
			if (!myNumberIsMultipleOfAnotherNumberVerifier.numberIsMultipleOfAnotherNumber(theInteger,
					NoFizzNoBuzzStrategyConstants.NO_FIZZ_INTEGER_CONSTANT_VALUE)) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}
}
