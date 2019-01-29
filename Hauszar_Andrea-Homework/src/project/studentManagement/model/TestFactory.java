package project.studentManagement.model;

import project.core.keyboard.Keyboard;

public class TestFactory {
	private Keyboard keyboard = Keyboard.getInstance();

	private void diferentiateTests(String testID) {
		char firstLetter = testID.charAt(0);

		if (firstLetter == 'G') {
			int testMcNrQuestions = keyboard.getInt("Numar intrebari Test Grila: ");// MC = multiple choice test
		}
	}

}
