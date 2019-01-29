package project.studentManagement.actions;

import project.core.menu.MenuItem;

public class DeleteTestsAction extends MenuItem {

	public DeleteTestsAction() {
		super("3", "Delete");
	}

	@Override
	public void doAction() {
		System.out.println("Aici stergem ceva");

	}

}
