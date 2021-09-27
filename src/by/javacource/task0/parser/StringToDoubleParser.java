package by.javacource.task0.parser;

import java.util.List;

import by.javacource.task0.exception.ParserException;

public interface StringToDoubleParser {

	public List<Double> parseAllLines(List<String> strList) throws ParserException;

}
