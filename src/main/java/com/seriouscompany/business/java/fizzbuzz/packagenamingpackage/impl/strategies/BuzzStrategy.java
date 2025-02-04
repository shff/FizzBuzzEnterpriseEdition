package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.strategies;

import org.springframework.stereotype.Service;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.strategies.IsEvenlyDivisibleStrategy;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.strategies.constants.BuzzStrategyConstants;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.math.arithmetics.NumberIsMultipleOfAnotherNumberVerifier;

/**
 * Strategy for Buzz
 */
@Service
public class BuzzStrategy implements IsEvenlyDivisibleStrategy {

	private final NumberIsMultipleOfAnotherNumberVerifier _numberIsMultipleOfAnotherNumberVerifier;

	/**
	 * @param theNumberIsMultipleOfAnotherNumberVerifier
	 *            NumberIsMultipleOfAnotherNumberVerifier
	 */
	public BuzzStrategy(final NumberIsMultipleOfAnotherNumberVerifier theNumberIsMultipleOfAnotherNumberVerifier) {
		super();
		_numberIsMultipleOfAnotherNumberVerifier = theNumberIsMultipleOfAnotherNumberVerifier;
	}

	/**
	 * @param theInteger int
	 * @return boolean
	 */
	public boolean isEvenlyDivisible(final int theInteger) {
		if (_numberIsMultipleOfAnotherNumberVerifier.numberIsMultipleOfAnotherNumber(theInteger,
				BuzzStrategyConstants.BUZZ_INTEGER_CONSTANT_VALUE)) {
			return true;
		} else {
			return false;
		}
	}

}
