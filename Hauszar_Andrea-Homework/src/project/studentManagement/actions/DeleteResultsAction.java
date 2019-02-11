package project.studentManagement.actions;

import java.util.Date;

import project.core.keyboard.Keyboard;
import project.core.menu.MenuItem;
import project.studentManagement.ApplicationSession;
import project.studentManagement.model.Database;

public class DeleteResultsAction extends MenuItem {
	private Keyboard keyboard = Keyboard.getInstance();

	public DeleteResultsAction() {
		super("3", "Delete");
	}

	@Override
	public void doAction() {
		Database db = ApplicationSession.getInstance().getDatabase();
		Date date = keyboard.getDate("Date: ");
		String name = keyboard.getString("Student Name: ");
		String testID = keyboard.getString("TestID: ");
		db.deleteResults(date, name, testID);

	}

}
