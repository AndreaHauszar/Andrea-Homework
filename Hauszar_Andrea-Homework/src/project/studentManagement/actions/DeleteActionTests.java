package project.studentManagement.actions;

import project.core.menu.MenuItem;

public class DeleteActionTests extends MenuItem {

	public DeleteActionTests() {
		super("3", "Delete");
	}

	@Override
	public void doAction() {
		System.out.println("Aici stergem ceva");

	}

}
