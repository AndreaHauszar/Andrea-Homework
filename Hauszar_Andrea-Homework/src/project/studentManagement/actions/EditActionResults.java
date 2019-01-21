package project.studentManagement.actions;

import project.core.menu.MenuItem;

public class EditActionResults extends MenuItem {
	public EditActionResults() {
		super("2", "Edit");
	}

	@Override
	public void doAction() {
		System.out.println("Aici editam ceva");
	}
}
