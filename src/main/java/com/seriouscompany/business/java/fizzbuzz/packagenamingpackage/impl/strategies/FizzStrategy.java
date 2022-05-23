package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.strategies;

import org.springframework.stereotype.Service;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.strategies.IsEvenlyDivisibleStrategy;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.strategies.constants.FizzStrategyConstants;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.math.arithmetics.NumberIsMultipleOfAnotherNumberVerifier;

/**
 * Strategy for Fizz
 */
@Service
public class FizzStrategy implements IsEvenlyDivisibleStrategy {

	private final NumberIsMultipleOfAnotherNumberVerifier myNumberIsMultipleOfAnotherNumberVerifier;

	/**
	 * @param theNumberIsMultipleOfAnotherNumberVerifier
	 *            NumberIsMultipleOfAnotherNumberVerifier
	 */
	public FizzStrategy(final NumberIsMultipleOfAnotherNumberVerifier theNumberIsMultipleOfAnotherNumberVerifier) {
		super();
		this.myNumberIsMultipleOfAnotherNumberVerifier = theNumberIsMultipleOfAnotherNumberVerifier;
	}

	/**
	 * @param theInteger int
	 * @return boolean
	 */
	public boolean isEvenlyDivisible(final int theInteger) {
		if (this.myNumberIsMultipleOfAnotherNumberVerifier.numberIsMultipleOfAnotherNumber(theInteger,
				FizzStrategyConstants.FIZZ_INTEGER_CONSTANT_VALUE)) {
			return true;
		} else {
			return false;
		}
	}

}
