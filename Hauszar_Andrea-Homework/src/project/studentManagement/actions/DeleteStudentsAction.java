package project.studentManagement.actions;

import project.core.keyboard.Keyboard;
import project.core.menu.MenuItem;
import project.studentManagement.ApplicationSession;

public class DeleteStudentsAction extends MenuItem {
	private Keyboard keyboard = Keyboard.getInstance();

	public DeleteStudentsAction() {
		super("3", "Delete");
	}

	@Override
	public void doAction() {
		String name = keyboard.getString("Student Name: ");
		ApplicationSession.getInstance().getDatabase().deleteStudent(name);
	}

}
