package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.stringreturners;

import org.springframework.stereotype.Service;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.stringreturners.StringStringReturner;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.stringreturners.StringSeparator;

/**
 * Returner for NewLineString
 */
@Service
public class NewLineStringReturner implements StringStringReturner {

	final private StringSeparator stringSeparator;

	/**
	 * @param stringSeparator
	 */
	public NewLineStringReturner(final StringSeparator stringSeparator) {
		this.stringSeparator = stringSeparator;
	}

	/**
	 * @return
	 */
	public String getReturnString() {
		final String systemDefaultNewLineString = this.stringSeparator.getSeparator();
		final StringBuilder myStringBuilder = new StringBuilder(systemDefaultNewLineString);
		final String myString = myStringBuilder.toString();
		return new String(myString);
	}

}
