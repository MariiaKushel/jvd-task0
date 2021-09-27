package by.javacource.task0.parser.impl;

import java.util.ArrayList;
import java.util.List;

import by.javacource.task0.exception.ParserException;
import by.javacource.task0.parser.StringToDoubleParser;
import by.javacource.task0.validator.StringValidator;

public class StringToDoubleParserImpl implements StringToDoubleParser {

	@Override
	public List<Double> parseAllLines(List<String> strList) throws ParserException {

		List<Double> doubleList = new ArrayList<Double>();

		boolean isUncorrectData = false;

		if (!strList.isEmpty()) {
			for (String currentLine : strList) {
				if (StringValidator.validate(currentLine)) {
					Double temp = Double.valueOf(currentLine);
					doubleList.add(temp);
				} else {
					isUncorrectData = true;
					// логирование?
				}
			}
		}

		if (isUncorrectData) {
			throw new ParserException("Validaion was failed.");
		}

		if (doubleList.size() < 2) {
			throw new ParserException("Not enough elements.");
		}

		return doubleList;
	}

}
