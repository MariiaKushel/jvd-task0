package by.javacource.task0.reader.impl;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import by.javacource.task0.exception.ReaderException;
import by.javacource.task0.reader.ReaderFromFile;

public class ReaderFromFileImpl implements ReaderFromFile {

	@Override
	public List<String> readFile(String pathToFile) throws ReaderException {

		List<String> fileContent = new ArrayList<String>();

		try (BufferedReader reader = new BufferedReader(new FileReader(new File(pathToFile)))) {
			String currentLine;

			while ((currentLine = reader.readLine()) != null) {
				fileContent.add(currentLine);
			}

		} catch (FileNotFoundException e) {
			throw new ReaderException("File " + pathToFile + " was not found.");
		} catch (IOException e) {
			throw new ReaderException(
					"Failed or interrupted I/O operations while working on the file " + pathToFile + ".");
		}

		return fileContent;
	}

}
