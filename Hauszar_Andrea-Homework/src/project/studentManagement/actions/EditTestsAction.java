package project.studentManagement.actions;

import project.core.keyboard.Keyboard;
import project.core.menu.MenuItem;
import project.studentManagement.ApplicationSession;
import project.studentManagement.model.Database;
import project.studentManagement.model.GTest;
import project.studentManagement.model.PTest;
import project.studentManagement.model.Test;

public class EditTestsAction extends MenuItem {
	private Keyboard keyboard = Keyboard.getInstance();

	public EditTestsAction() {
		super("2", "Edit");
	}

	@Override
	public void doAction() {
		Database db = ApplicationSession.getInstance().getDatabase();
		String testID = keyboard.getString("TestID: ");
		Test test = db.getTestID(testID);
		if (test == null) {
			System.out.println("TestID does not exist !!!");
			return;
		}

		String newTestID = keyboard.getString("New TestID: ");

		if (test instanceof GTest) {
			int NrQuestions = keyboard.getInt("Numar intrebari Test Grila: ");// MC = multiple choice test
			test.edit(newTestID, NrQuestions);
		} else if (test instanceof PTest) {
			test.edit(newTestID);
		}

	}
}
