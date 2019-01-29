package project.studentManagement.actions;

import project.core.menu.MenuItem;

public class EditResultsAction extends MenuItem {
	public EditResultsAction() {
		super("2", "Edit");
	}

	@Override
	public void doAction() {
		System.out.println("Aici editam ceva");
	}
}
