package project.studentManagement.actions;

import project.core.keyboard.Keyboard;
import project.core.menu.MenuItem;

public class AddActionResults extends MenuItem {
	private Keyboard keyboard = Keyboard.getInstance();

	public AddActionResults() {
		super("1", "Add");
	}

	// ceva in logica mea nu e bine. ca sa adaug rezultate pt un student pt un test
	// anume, va trebui sa specific si numele studentului si testul presupun
	// de aceea nu stiu daca aiai in results trebuie sa mai am si Name si Test ID
	// sau nu???

	@Override
	public void doAction() {
		String studentName = keyboard.getString("Student Name: ");
		String testID = keyboard.getString("Test ID");
		int testMcNrQuestions = keyboard.getInt("Numar intrebari Test Grila: ");
		int testMcNrCorrectAnswers = keyboard.getInt("Numar Raspunsuri Corecte la Test Grila: ");
		int practicalTestGradeImplementation = keyboard.getInt("Nota Implementare: ");
		int practicalTestGradeFunctionality = keyboard.getInt("Nota Functionalitate: ");
//		int hotWater = keyboard.getInt("Hot water: ");
		// do something with values
	}

}
