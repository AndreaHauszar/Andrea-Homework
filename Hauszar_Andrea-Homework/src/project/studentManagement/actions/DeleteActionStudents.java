package project.studentManagement.actions;

import project.core.menu.MenuItem;

public class DeleteActionStudents extends MenuItem {

	public DeleteActionStudents() {
		super("3", "Delete");
	}

	@Override
	public void doAction() {
		System.out.println("Aici stergem ceva");

	}

}
