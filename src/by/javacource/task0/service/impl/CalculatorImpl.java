package by.javacource.task0.service.impl;

import by.javacource.task0.creater.NumberCreater;
import by.javacource.task0.creater.impl.NumberCreaterImpl;
import by.javacource.task0.entity.CustomNumber;
import by.javacource.task0.exception.ServiceException;
import by.javacource.task0.service.Calculator;

public class CalculatorImpl implements Calculator {

	private static NumberCreater creater = new NumberCreaterImpl();

	public CustomNumber addition(CustomNumber a, CustomNumber b) {

		double result = a.getNumber() + b.getNumber();

		return creater.create(result);
	}

	public CustomNumber subtraction(CustomNumber a, CustomNumber b) {

		double result = a.getNumber() - b.getNumber();

		return creater.create(result);
	}

	public CustomNumber multiplication(CustomNumber a, CustomNumber b) {

		double result = a.getNumber() * b.getNumber();

		return creater.create(result);
	}

	public CustomNumber division(CustomNumber a, CustomNumber b) throws ServiceException {

		if (b.getNumber() == 0.0) {
			throw new ServiceException("Division by zero.");
		}

		double result = a.getNumber() / b.getNumber();

		return creater.create(result);
	}

}
