package by.javacource.task0.service;

import by.javacource.task0.entity.CustomNumber;
import by.javacource.task0.exception.ServiceException;

public interface Calculator {

	public CustomNumber addition(CustomNumber a, CustomNumber b);

	public CustomNumber subtraction(CustomNumber a, CustomNumber b);

	public CustomNumber multiplication(CustomNumber a, CustomNumber b);

	public CustomNumber division(CustomNumber a, CustomNumber b) throws ServiceException;
}
