package project.studentManagement.model;

import java.util.List;

public interface Database {

	List<Student> getStudentName();

	void addStudent(Student student);

	void addTests(Test test);

	void addResults(Result result);

	Test getTestID(String testID);

	void editTestID(String testID);

	Student getStudentByName(String name);

	void deleteStudent(String name);

	void deleteTestID(String testID);

	List<Test> getTestID();

	void editStudentName(String name, String newname);

//	Reading getPreviousReadingByYearAndMonth(int year, int month);

}
