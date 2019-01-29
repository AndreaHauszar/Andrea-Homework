package project.studentManagement.actions;

import project.core.keyboard.Keyboard;
import project.core.menu.MenuItem;
import project.studentManagement.ApplicationSession;
import project.studentManagement.model.Student;

public class AddStudentsAction extends MenuItem {
	private Keyboard keyboard = Keyboard.getInstance();

	public AddStudentsAction() {
		super("1", "Add");
	}

	@Override
	public void doAction() {
		String studentName = keyboard.getString("Student Name: ");

		// do something with values

		Student student = new Student(name);
		ApplicationSession.getInstance().getDatabase().addStudent();
	}

}
