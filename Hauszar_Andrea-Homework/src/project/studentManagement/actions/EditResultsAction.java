package project.studentManagement.actions;

import java.util.Date;

import project.core.keyboard.Keyboard;
import project.core.menu.MenuItem;
import project.studentManagement.ApplicationSession;
import project.studentManagement.model.Database;
import project.studentManagement.model.Student;
import project.studentManagement.model.Test;

public class EditResultsAction extends MenuItem {
	private Keyboard keyboard = Keyboard.getInstance();

	public EditResultsAction() {
		super("2", "Edit");
	}

	@Override
	public void doAction() {
		Database db = ApplicationSession.getInstance().getDatabase();

		Date date = keyboard.getDate("Date: ");
		System.out.println(date);

		String studentName = keyboard.getString("Student Name: ");
		String testID = keyboard.getString("TestID: ");

		Date d = db.getDate(date);
		if (date == null) {
			System.out.println("Date does not exist !!!");
			return;
		}

		Student name = db.getStudentByName(studentName);
		if (name == null) {
			System.out.println("Student does not exist !!!");
			return;
		}

		Test test = db.getTestID(testID);
		if (test == null) {
			System.out.println("TestID does not exist !!!");
			return;
		}

		char firstLetter = testID.charAt(0);
		if (firstLetter == 'G') {
			int newCorrectAnswers = keyboard.getInt("Noul Numar de Raspunsuri Corecte la Testul Grila: ");
			db.editCorrectAnswers(date, studentName, testID);
			// result = new ResultG(test, NewCorrectAnswers, name);
		} else {
			if (firstLetter == 'P') {
				int newGradeImplementation = keyboard.getInt("Noua Nota Implementare: ");
				int newGradeFunctionality = keyboard.getInt("Noua Nota Functionalitate: ");
				// result = new ResultP(test, newGradeImplementation, newGradeFunctionality,
				// name);
			}
			System.out.println("Test does not exist !!!");
		}

	}
}
