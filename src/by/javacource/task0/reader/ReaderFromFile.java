package by.javacource.task0.reader;

import java.util.List;

import by.javacource.task0.exception.ReaderException;

public interface ReaderFromFile {
	
	public List<String> readFile (String pathToFile) throws ReaderException;

}
