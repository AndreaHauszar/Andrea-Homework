package project.studentManagement.actions;

import project.core.menu.MenuItem;

public class DeleteStudentsAction extends MenuItem {

	public DeleteStudentsAction() {
		super("3", "Delete");
	}

	@Override
	public void doAction() {
		System.out.println("Aici stergem ceva");

	}

}
