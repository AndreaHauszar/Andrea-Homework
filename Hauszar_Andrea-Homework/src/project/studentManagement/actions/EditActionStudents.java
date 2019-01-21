package project.studentManagement.actions;

import project.core.menu.MenuItem;

public class EditActionStudents extends MenuItem {
	public EditActionStudents() {
		super("2", "Edit");
	}

	@Override
	public void doAction() {
		System.out.println("Aici editam ceva");
	}
}
