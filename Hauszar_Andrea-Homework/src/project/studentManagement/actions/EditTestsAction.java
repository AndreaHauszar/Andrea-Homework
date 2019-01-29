package project.studentManagement.actions;

import project.core.keyboard.Keyboard;
import project.core.menu.MenuItem;
import project.studentManagement.ApplicationSession;
import project.studentManagement.model.Database;
import project.studentManagement.model.Tests;

public class EditTestsAction extends MenuItem {
	private Keyboard keyboard = Keyboard.getInstance();

	public EditTestsAction() {
		super("2", "Edit");
	}

	@Override
	public void doAction() {
		Database db = ApplicationSession.getInstance().getDatabase();
		String testID = keyboard.getString("TestID: ");
		Tests test = db.getTestID(testID);
		if (testID == null) {
			System.out.println("TestID does not exist !!!");
			return;
		}

		String newTestID = keyboard.getString("New TestID: ");

		db.editTestID(testID);
	}
}
