package project.studentManagement.actions;

import project.core.keyboard.Keyboard;
import project.core.menu.MenuItem;
import project.studentManagement.ApplicationSession;
import project.studentManagement.model.Database;
import project.studentManagement.model.Student;

public class EditStudentsAction extends MenuItem {
	private Keyboard keyboard = Keyboard.getInstance();

	public EditStudentsAction() {
		super("2", "Edit");
	}

	@Override
	public void doAction() {
		Database db = ApplicationSession.getInstance().getDatabase();
		String studentName = keyboard.getString("Student Name: ");
		Student student = db.getStudentByName(name);
		if (name == null) {
			System.out.println("Name does not exist !!!");
			return;
		}

		String name = keyboard.getString("New Student Name: ");

		db.editStudentName(studentName);
	}
}
