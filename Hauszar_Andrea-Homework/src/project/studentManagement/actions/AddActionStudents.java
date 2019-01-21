package project.studentManagement.actions;

import project.core.keyboard.Keyboard;
import project.core.menu.MenuItem;

public class AddActionStudents extends MenuItem {
	private Keyboard keyboard = Keyboard.getInstance();

	public AddActionStudents() {
		super("1", "Add");
	}

	@Override
	public void doAction() {
		String studentName = keyboard.getString("Student Name: ");

//		int hotWater = keyboard.getInt("Hot water: ");
		// do something with values
	}

}
