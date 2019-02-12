package project.studentManagement.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import project.studentManagement.ApplicationSession;
import project.studentManagement.utils.Serializer;

public class FileDatabase implements Database, Serializable {
	private static final long serialVersionUID = 1L;

	private List<Student> students = new ArrayList<Student>();

	private List<Test> tests = new ArrayList<Test>();

	private List<Result> results = new ArrayList<Result>();

	private List<Date> dates = new ArrayList<Date>();

	@Override
	public List<Student> getStudentName() {
		return students;
	}

	@Override
	public List<Test> getTestID() {
		return tests;
	}

	@Override
	public List<Result> getResults() {
		return results;
	}

	public List<Date> getDate() {
		return dates;
	}

	@Override
	public Date getDate(Date date) {
		for (Date dte : dates) {
			if (dte.compareTo(date) == 0) {
				return dte;
			}
		}
		return null;
	}

	@Override
	public Student getStudentByName(String name) {
		for (Student stud : students) {
			if (stud.hasName(name)) {
				return stud;
			}
		}

		return null;
	}

	@Override
	public void addStudent(Student student) {
		students.add(student);
		Serializer serializer = ApplicationSession.getInstance().getSerializer();
		serializer.save(this);
	}

	@Override
	public void editStudentName(String name, String newname) {
		Student student = getStudentByName(name);
		student.edit(newname);
		Serializer serializer = ApplicationSession.getInstance().getSerializer();
		serializer.save(this);
	}

	@Override
	public void deleteStudent(String name) {
//		students.remove(new Student(name));

		Iterator<Student> iterator = students.iterator();
		while (iterator.hasNext()) {
			Student stud = iterator.next();
			if (stud.hasName(name)) {
				iterator.remove();
			}
		}
		Serializer serializer = ApplicationSession.getInstance().getSerializer();
		serializer.save(this);
	}

	@Override
	public void addTests(Test test) {
		tests.add(test);
		Serializer serializer = ApplicationSession.getInstance().getSerializer();
		serializer.save(this);
	}

	@Override
	public void editTestID(String testID) {
		Test test = getTestID(testID);
		test.edit(testID);
		Serializer serializer = ApplicationSession.getInstance().getSerializer();
		serializer.save(this);
	}

	@Override
	public Test getTestID(String id) {
		for (Test test : tests) {
			if (test.hasTestID(id)) {
				return test;
			}
		}

		return null;
	}

	@Override
	public void deleteTestID(String testID) {
//		students.remove(new Student(name));

		Iterator<Test> iterator = tests.iterator();
		while (iterator.hasNext()) {
			Test test = iterator.next();
			if (test.hasTestID(testID)) {
				iterator.remove();
			}
		}
		Serializer serializer = ApplicationSession.getInstance().getSerializer();
		serializer.save(this);
	}

	@Override
	public void addResults(Result result) {
		results.add(result);
		Serializer serializer = ApplicationSession.getInstance().getSerializer();
		serializer.save(this);
	}

	@Override
	public void editCorrectAnswers(Date date, String studentName, String testID) {

		Serializer serializer = ApplicationSession.getInstance().getSerializer();
		serializer.save(this);
	}

	@Override
	public void deleteResults(Date date, String name, String testID) {
		Iterator<Result> iterator = results.iterator();
		while (iterator.hasNext()) {
			Result r = iterator.next();
			if (r.hasNameAndTestID(name, testID)) {
				iterator.remove();
			}
		}
		Serializer serializer = ApplicationSession.getInstance().getSerializer();
		serializer.save(this);
	}

	@Override
	public void editResult(String name, String testid, Object... params) {
		Result result = getResultByStudentTest(name, testid);
		result.edit(params);
	}

	private Result getResultByStudentTest(String name, String testid) {
		for (Result result : results) {
			if (result.hasNameAndTestID(name, testid)) {
				return result;
			}
		}
		return null;
	}

	@Override
	public List<Student> getStudents() {
		// TODO Auto-generated method stub
		return students;
	}

	@Override
	public List<Test> getTests() {
		// TODO Auto-generated method stub
		return tests;
	}

	@Override
	public Result getResultByStudentAndTest(Student student, Test test) {
		for (Result result : results) {
			if (result.hasStudentAndTest(student, test)) {
				return result;
			}
		}
		return null;
	}

//	if (firstLetter == 'G') {
//		int newCorrectAnswers = keyboard.getInt("Noul Numar de Raspunsuri Corecte la Testul Grila: ");
//		db.editCorrectAnswers(date, studentName, testID);
//		// result = new ResultG(test, NewCorrectAnswers, name);
//	

//	@Override
//	public void editResult(String testID) {
//		Test test = getTestID(testID);
//		test.edit(testID);
//		Serializer serializer = ApplicationSession.getInstance().getSerializer();
//		serializer.save(this);
//	}

//	@Override
//	public Reading getReadingByYearAndMonth(int year, int month) {
//		for (Reading reading : readings) {
//			if (reading.hasYearAndMonth(year, month)) {
//				return reading;
//			}
//		}
//		return null;
//	}
//
//	@Override
//	public void editReading(int year, int month, int coldWater, int hotWater) {
//		Reading reading = getReadingByYearAndMonth(year, month);
//		reading.edit(coldWater, hotWater);
//		Serializer serializer = ApplicationSession.getInstance().getSerializer();
//		serializer.save(this);
//	}
	//
//	@Override
//	public Reading getPreviousReadingByYearAndMonth(int year, int month) {
//		int previousYear = year;
//		int previousMonth = month - 1;
//
//		if (month == 1) {
//			previousYear -= 1;
//			previousMonth = 12;
//		}
//
//		return getReadingByYearAndMonth(previousYear, previousMonth);
//	}

}
