package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.stringreturners;

import org.springframework.stereotype.Service;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.Constants;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.stringreturners.StringSeparator;

/**
 * Returner for NewLineString
 */
@Service
public class SystemStringSeparator implements StringSeparator {

	/**
	 * @return
	 */
	public String getSeparator() {
    return System.getProperty(Constants.LINE_SEPARATOR);
	}

}
