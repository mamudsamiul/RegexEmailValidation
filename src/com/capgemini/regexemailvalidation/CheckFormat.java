package com.capgemini.regexemailvalidation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckFormat {
	static Pattern pattern = Pattern.compile("^abc[.a-zA-Z0-9]*(@bridgelabz).*$");

	static boolean check(String data) {
		Matcher matcher = pattern.matcher(data);
		boolean matchFound = matcher.find();
		if (matchFound)
			return true;
		else
			return false;
	}
}
