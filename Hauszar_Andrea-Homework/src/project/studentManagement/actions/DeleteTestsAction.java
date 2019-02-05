package project.studentManagement.actions;

import project.core.keyboard.Keyboard;
import project.core.menu.MenuItem;
import project.studentManagement.ApplicationSession;

public class DeleteTestsAction extends MenuItem {
	private Keyboard keyboard = Keyboard.getInstance();

	public DeleteTestsAction() {
		super("3", "Delete");
	}

	@Override
	public void doAction() {
		String testID = keyboard.getString("TestID: ");
		ApplicationSession.getInstance().getDatabase().deleteTestID(testID);
	}

}
