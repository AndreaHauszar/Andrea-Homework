package project.studentManagement.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import project.studentManagement.ApplicationSession;
import project.studentManagement.utils.Serializer;

public class FileDatabase implements Database, Serializable {
	private static final long serialVersionUID = 1L;

	private List<Student> students = new ArrayList<Student>();

	private List<Test> tests = new ArrayList<Test>();

	private List<Result> results = new ArrayList<Result>();

	@Override
	public List<Student> getStudentName() {
		return students;
	}

	@Override
	public List<Test> getTestID() {
		return tests;
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
	public Test getTestID(String testID) {
		// TODO Auto-generated method stub
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
