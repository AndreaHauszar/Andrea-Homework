package project.studentManagement.actions;

import project.core.keyboard.Keyboard;
import project.core.menu.MenuItem;

public class ReviewResultsAction extends MenuItem {
	private Keyboard keyboard = Keyboard.getInstance();

	public ReviewResultsAction() {
		super("4", "View student rankings");
	}

	@Override
	public void doAction() {
		System.out.println("Aici vizualizam ceva");
		// do something with values
	}

}
