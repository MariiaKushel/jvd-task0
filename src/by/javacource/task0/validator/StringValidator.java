package by.javacource.task0.validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringValidator {

	private static final String STRING_AS_DIGITAL_REX = "-?\\d\\d*(\\.\\d+)?";

	public static boolean validate(String parameter) {

		Pattern pattern = Pattern.compile(STRING_AS_DIGITAL_REX);
		Matcher matcher = pattern.matcher(parameter);

		return matcher.matches();
	}
}
