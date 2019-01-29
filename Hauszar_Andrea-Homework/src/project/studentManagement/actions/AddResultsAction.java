package project.studentManagement.actions;

import java.util.Date;

import project.core.keyboard.Keyboard;
import project.core.menu.MenuItem;
import project.studentManagement.ApplicationSession;
import project.studentManagement.model.Database;
import project.studentManagement.model.Tests;

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
		Tests test = db.getTestID(testID);
		if (testID == null) {
			System.out.println("TestID does not exist !!!");
			return;
		} else {
			char firstLetter = testID.charAt(0);
			if (firstLetter == 'G') {
				int testMcNrCorrectAnswers = keyboard.getInt("Numar Raspunsuri Corecte la Test Grila: ");
			} else {
				if (firstLetter == 'P') {
					int practicalTestGradeImplementation = keyboard.getInt("Nota Implementare: ");
					int practicalTestGradeFunctionality = keyboard.getInt("Nota Functionalitate: ");
				}
				System.out.println("Test does not exist !!!");
			}

		}
//		Results results = new Results(date, studentName, testID, testMcNrCorrectAnswers,practicalTestGradeImplementation, practicalTestGradeFunctionality);
//		ApplicationSession.getInstance().getDatabase().addResults(results);

// !! ori setez cumva sa imi arate null la notele de la testul practic daca eu am introdus nota pt test grila
// !! ori trebuie sa schimb cela de aici din results de la final 
	}
}
