package project.studentManagement.actions;

import project.core.menu.MenuItem;

public class EditActionTests extends MenuItem {
	public EditActionTests() {
		super("2", "Edit");
	}

	@Override
	public void doAction() {
		System.out.println("Aici editam ceva");
	}
}