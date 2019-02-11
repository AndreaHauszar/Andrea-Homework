package project.studentManagement.actions;

import project.core.keyboard.Keyboard;
import project.core.menu.MenuItem;
import project.studentManagement.ApplicationSession;
import project.studentManagement.model.Database;
import project.studentManagement.model.Result;

public class ReviewResultsAction extends MenuItem {
	private Keyboard keyboard = Keyboard.getInstance();

	public ReviewResultsAction() {
		super("4", "View student rankings");
	}

	@Override
	public void doAction() {
		System.out.println("Aici vizualizam ceva");

		Database database = ApplicationSession.getInstance().getDatabase();
		System.out.println("-------------------------------------");
		for (Result result : database.getResults()) {
			System.out.println(result);
			System.out.println("-------------------------------------");
		}

//		int gradeFunctionality = keyboard.getInt("Nota Implementare: ");
//		int gradeImplementation = keyboard.getInt("Nota Functionalitate: ");
//		ResultP gradesP = database.getGradesP(gradeFunctionality, gradeImplementation)
//		
//		int avarageP = (gradeFunctionality + gradeImplementation) / 2;
//		System.out.println("Avarage Score for the practical Test is: " +   avarageP  );

	}

}
