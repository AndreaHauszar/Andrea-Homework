package project.studentManagement.actions;

import project.core.keyboard.Keyboard;
import project.core.menu.MenuItem;
import project.studentManagement.ApplicationSession;
import project.studentManagement.model.MultipleChoiseTest;
import project.studentManagement.model.PracticalTest;
import project.studentManagement.model.Test;

public class AddTestsAction extends MenuItem {
	private Keyboard keyboard = Keyboard.getInstance();

	public AddTestsAction() {
		super("1", "Add");
	}

	@Override
	public void doAction() {
		String testID = keyboard.getString("Test ID: ");

		diferentiateTests(testID);

//		do something
	}

	private void diferentiateTests(String testID) {
		char firstLetter = testID.charAt(0);
		Test test = null;
		if (firstLetter == 'G') {
			int testMcNrQuestions = keyboard.getInt("Numar intrebari Test Grila: ");// MC = multiple choice test
			test = new MultipleChoiseTest(testID, testMcNrQuestions);
		} else if (firstLetter == 'P') {
			test = new PracticalTest(testID);
		}
		ApplicationSession.getInstance().getDatabase().addTests(test);
	}

}
