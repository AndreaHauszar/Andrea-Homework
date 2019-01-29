package project.studentManagement;

import project.core.menu.BackAction;
import project.core.menu.Menu;
import project.core.menu.MenuItem;
import project.studentManagement.actions.AddResultsAction;
import project.studentManagement.actions.AddStudentsAction;
import project.studentManagement.actions.AddTestsAction;
import project.studentManagement.actions.DeleteResultsAction;
import project.studentManagement.actions.DeleteStudentsAction;
import project.studentManagement.actions.DeleteTestsAction;
import project.studentManagement.actions.EditResultsAction;
import project.studentManagement.actions.EditStudentsAction;
import project.studentManagement.actions.EditTestsAction;
import project.studentManagement.actions.ReviewResultsAction;
import project.studentManagement.model.Database;
import project.studentManagement.utils.Serializer;

public class Application {
	public static void main(String[] args) {
		Application app = new Application();
		app.run();
	}

	private void run() {
		Serializer serializer = ApplicationSession.getInstance().getSerializer();
		Database database = serializer.load();
		if (database == null) {
			return;
		}

		ApplicationSession.getInstance().setDatabase(database);

		MenuItem mainMenu = createMenu();
		mainMenu.doAction();
	}

	private MenuItem createMenu() {
		MenuItem addStudent = new AddStudentsAction();
		MenuItem editStudent = new EditStudentsAction();
		MenuItem deleteStudent = new DeleteStudentsAction();
		MenuItem addTest = new AddTestsAction();
		MenuItem editTest = new EditTestsAction();
		MenuItem deleteTest = new DeleteTestsAction();
		MenuItem addResults = new AddResultsAction();
		MenuItem editResults = new EditResultsAction();
		MenuItem deleteResult = new DeleteResultsAction();
		MenuItem reviewResult = new ReviewResultsAction();

		BackAction back = new BackAction("0", "Back");

		Menu studentMenu = new Menu("1", "Student Management");
		studentMenu.addItem(addStudent);
		studentMenu.addItem(editStudent);
		studentMenu.addItem(deleteStudent);
		studentMenu.addItem(back);
		studentMenu.setBackAction(back);

		Menu testsMenu = new Menu("2", "Tests Management");
		testsMenu.addItem(addTest);
		testsMenu.addItem(editTest);
		testsMenu.addItem(deleteTest);
		testsMenu.addItem(back);
		testsMenu.setBackAction(back);

		Menu resultsMenu = new Menu("3", "Resulta Management");
		resultsMenu.addItem(addResults);
		resultsMenu.addItem(editResults);
		resultsMenu.addItem(deleteResult);
		resultsMenu.addItem(reviewResult);
		resultsMenu.addItem(back);
		resultsMenu.setBackAction(back);

		Menu mainMenu = new Menu("", "Main");
		mainMenu.addItem(studentMenu);
		mainMenu.addItem(testsMenu);
		mainMenu.addItem(resultsMenu);
		mainMenu.addItem(back);
		mainMenu.setBackAction(back);
		return mainMenu;
	}
}
