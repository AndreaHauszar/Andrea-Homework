package project.studentManagement.actions;

import java.util.Date;

import project.core.keyboard.Keyboard;
import project.core.menu.MenuItem;
import project.studentManagement.ApplicationSession;
import project.studentManagement.model.Database;
import project.studentManagement.model.Result;
import project.studentManagement.model.ResultG;
import project.studentManagement.model.ResultP;
import project.studentManagement.model.Test;

public class AddResultsAction extends MenuItem {
	private Keyboard keyboard = Keyboard.getInstance();

	public AddResultsAction() {
		super("1", "Add");
	}

	@Override
	public void doAction() {
		Date date = keyboard.getDate("Date: ");
		System.out.println(date);
		String studentName = keyboard.getString("Student Name: ");

		// as vrea sa verific daca exista deja Test ID - am metoda deja in
		// EditTestAction - dar nu stiu cum sa o folosesc - plus ca e putin diferita

		Database db = ApplicationSession.getInstance().getDatabase();
		String testID = keyboard.getString("TestID: ");
		Test test = db.getTestID(testID);
		Result result = null;

		if (testID == null) {
			System.out.println("TestID does not exist !!!");
			return;
		} else {
			char firstLetter = testID.charAt(0);

			if (firstLetter == 'G') {
				int correctAnswers = keyboard.getInt("Numar Raspunsuri Corecte la Test Grila: ");
				result = new ResultG(test, correctAnswers);
			} else {
				if (firstLetter == 'P') {
					int gradeImplementation = keyboard.getInt("Nota Implementare: ");
					int gradeFunctionality = keyboard.getInt("Nota Functionalitate: ");
					result = new ResultP(test, gradeImplementation, gradeFunctionality);
				}
				System.out.println("Test does not exist !!!");
			}

		}
		ApplicationSession.getInstance().getDatabase().addResults(result);

// !! ori setez cumva sa imi arate null la notele de la testul practic daca eu am introdus nota pt test grila
// !! ori trebuie sa schimb cela de aici din results de la final 
	}
}
