package project.studentManagement.actions;

import project.core.menu.MenuItem;

public class DeleteResultsAction extends MenuItem {

	public DeleteResultsAction() {
		super("3", "Delete");
	}

	@Override
	public void doAction() {
		System.out.println("Aici stergem ceva");

	}

}