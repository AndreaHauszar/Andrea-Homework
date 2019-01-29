package project.studentManagement.model;

import java.util.List;

public interface Database {
	void addStudent();

	Student getStudentName(String name);

	void editStudentName(String name);

	List<Student> getStudentName();

	void addStudent(Student student);

	void addTests(Tests test);

	void addResults(Results result);

	Tests getTestID(String testID);

	void editTestID(String testID);

//	Reading getPreviousReadingByYearAndMonth(int year, int month);

}
