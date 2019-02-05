package project.studentManagement.actions;

import project.core.keyboard.Keyboard;
import project.core.menu.MenuItem;
import project.studentManagement.ApplicationSession;
import project.studentManagement.model.Result;

public class ReviewResultsAction extends MenuItem {
	private Keyboard keyboard = Keyboard.getInstance();

	public ReviewResultsAction() {
		super("4", "View student rankings");
	}

	@Override
	public void doAction() {
		System.out.println("Aici vizualizam ceva");

		for (Result result : ApplicationSession.getInstance().getDatabase().getResults()) {
			System.out.println(result);
		}
		// do something with values
	}

}
