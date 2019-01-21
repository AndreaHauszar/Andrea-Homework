package project.studentManagement;

import project.core.menu.BackAction;
import project.core.menu.Menu;
import project.core.menu.MenuItem;
import project.studentManagement.actions.AddActionResults;
import project.studentManagement.actions.AddActionStudents;
import project.studentManagement.actions.AddActionTests;
import project.studentManagement.actions.DeleteActionResults;
import project.studentManagement.actions.DeleteActionStudents;
import project.studentManagement.actions.DeleteActionTests;
import project.studentManagement.actions.EditActionResults;
import project.studentManagement.actions.EditActionStudents;
import project.studentManagement.actions.EditActionTests;
import project.studentManagement.actions.ReviewActionResults;

public class Application {
	public static void main(String[] args) {
		Application app = new Application();
		app.run();
	}

	private void run() {
		MenuItem mainMenu = createMenu();
		mainMenu.doAction();
	}

	private MenuItem createMenu() {
		MenuItem addStudent = new AddActionStudents();
		MenuItem editStudent = new EditActionStudents();
		MenuItem deleteStudent = new DeleteActionStudents();
		MenuItem addTest = new AddActionTests();
		MenuItem editTest = new EditActionTests();
		MenuItem deleteTest = new DeleteActionTests();
		MenuItem addResults = new AddActionResults();
		MenuItem editResults = new EditActionResults();
		MenuItem deleteResult = new DeleteActionResults();
		MenuItem reviewResult = new ReviewActionResults();

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
