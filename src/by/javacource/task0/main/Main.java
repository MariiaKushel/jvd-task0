package by.javacource.task0.main;

import java.util.List;

import by.javacource.task0.creater.NumberCreater;
import by.javacource.task0.creater.impl.NumberCreaterImpl;
import by.javacource.task0.entity.CustomNumber;
import by.javacource.task0.exception.ParserException;
import by.javacource.task0.exception.ReaderException;
import by.javacource.task0.exception.ServiceException;
import by.javacource.task0.parser.StringToDoubleParser;
import by.javacource.task0.parser.impl.StringToDoubleParserImpl;
import by.javacource.task0.reader.ReaderFromFile;
import by.javacource.task0.reader.impl.ReaderFromFileImpl;
import by.javacource.task0.service.Calculator;
import by.javacource.task0.service.impl.CalculatorImpl;

public class Main {

	public static void main(String[] args) {

		ReaderFromFile reader = new ReaderFromFileImpl();
		StringToDoubleParser parser = new StringToDoubleParserImpl();
		NumberCreater creater = new NumberCreaterImpl();
		Calculator calc = new CalculatorImpl();

		try {
			List<String> fileContent = reader.readFile("resource\\numbers.txt");
			
			List<Double> numbers = parser.parseAllLines(fileContent);

			CustomNumber num1 = creater.create(numbers.get(0));
			CustomNumber num2 = creater.create(numbers.get(1));

			CustomNumber result;
			result = calc.division(num1, num2);
			//result = calc.addition(num1, num2);
			//result = calc.subtraction(num1, num2);
			//result = calc.multiplication(num1, num2);

			System.out.println(result.getNumber());

		} catch (ReaderException e) {
			// логирование?
			e.printStackTrace();
		} catch (ParserException e) {
			// логирование?
			e.printStackTrace();
		} catch (ServiceException e) {
			// логирование?
			e.printStackTrace();
		}

	}

}
