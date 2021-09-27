package test.javacoure.task0.reader.impl;

import java.util.Arrays;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import by.javacource.task0.exception.ReaderException;
import by.javacource.task0.reader.impl.ReaderFromFileImpl;

public class ReaderFromFileImplTest {

	private ReaderFromFileImpl reader;

	@BeforeMethod
	public void initialize() {
		reader = new ReaderFromFileImpl();
	}

	@DataProvider(name = "readFile")
	public static Object[][] dataCreate() {
		return new Object[][] { { "resource\\numbers.txt", Arrays.asList("15.6", "-0.75", "0") } };
	}

	@Test(dataProvider = "readFile")
	public void testReadFile(String path, List<String> expected) throws ReaderException {

		List<String> actual = reader.readFile(path);
		Assert.assertEquals(actual, expected);

	}

}
