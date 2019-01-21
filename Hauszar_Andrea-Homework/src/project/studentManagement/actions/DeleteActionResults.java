package project.studentManagement.actions;

import project.core.menu.MenuItem;

public class DeleteActionResults extends MenuItem {

	public DeleteActionResults() {
		super("3", "Delete");
	}

	@Override
	public void doAction() {
		System.out.println("Aici stergem ceva");

	}

}
