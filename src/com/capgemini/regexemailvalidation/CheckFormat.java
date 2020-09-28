package com.capgemini.regexemailvalidation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckFormat {
	static Pattern pattern = Pattern.compile("^([a-z]){1,}([.+_-]){0,1}[0-9a-z]*(@){1}([0-9a-z]*)(.([a-z]){2,}){1}(.[a-z][a-z])?$");

	static boolean check(String data) {
		Matcher matcher = pattern.matcher(data);
		boolean matchFound = matcher.find();
		if (matchFound)
			return true;
		else
			return false;
	}
}
