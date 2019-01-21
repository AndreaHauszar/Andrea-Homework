package project.studentManagement.actions;

import project.core.keyboard.Keyboard;
import project.core.menu.MenuItem;

public class ReviewActionResults extends MenuItem {
	private Keyboard keyboard = Keyboard.getInstance();

	public ReviewActionResults() {
		super("4", "View student rankings");
	}

	@Override
	public void doAction() {
		System.out.println("Aici vizualizam ceva");
		// do something with values
	}

}
