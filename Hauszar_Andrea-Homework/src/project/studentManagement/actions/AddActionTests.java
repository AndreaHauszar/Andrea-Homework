package project.studentManagement.actions;

import project.core.keyboard.Keyboard;
import project.core.menu.MenuItem;

public class AddActionTests extends MenuItem {
	private Keyboard keyboard = Keyboard.getInstance();

	public AddActionTests() {
		super("1", "Add");
	}

	@Override
	public void doAction() {
		String testID = keyboard.getString("Test ID: ");
		int testMcNrQuestions = keyboard.getInt("Numar intrebari Test Grila: "); // MC = multiple choice test

//		int hotWater = keyboard.getInt("Hot water: ");
		// do something with values
	}

}
