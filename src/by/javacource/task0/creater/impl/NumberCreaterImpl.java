package by.javacource.task0.creater.impl;

import by.javacource.task0.creater.NumberCreater;
import by.javacource.task0.entity.CustomNumber;

public class NumberCreaterImpl implements NumberCreater {

	@Override
	public CustomNumber create(double num) {

		CustomNumber customNum = new CustomNumber(num);

		return customNum;
	}

}
