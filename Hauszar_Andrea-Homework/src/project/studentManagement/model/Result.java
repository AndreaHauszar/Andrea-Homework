package project.studentManagement.model;

import java.io.Serializable;
import java.util.Date;

public abstract class Result implements Serializable {
	private static final long serialVersionUID = 1L;

	protected Test test;
	protected Student student;

	public Result(Test test, Student stud) {
		super();
		this.test = test;
		student = stud;
	}

	public boolean hasNameAndTestID(String name2, String testID2) {

		return student.hasName(name2) && test.hasTestID(testID2);
	}

	public abstract void edit(Object... params);

	public boolean hasDateStudentTest(Date date, Student student2, Test test2) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean hasStudentAndTest(Student student2, Test test2) {
		return student == student2 && test == test2;
	}

	public abstract double getNota();

//	private int practicalTestGradeImplementation;
//	private int practicalTestGradeFunctionality;
//	private int testMcNrCorrectAnswers;

//	public Results(int testMcNrCorrectAnswers, int practicalTestGradeFunctionality,
//			int practicalTestGradeImplementation) {
//		this.testMcNrCorrectAnswers = testMcNrCorrectAnswers;
//		this.practicalTestGradeFunctionality = practicalTestGradeFunctionality;
//		this.practicalTestGradeImplementation = practicalTestGradeImplementation;
//
//	}

//	public boolean hasYearAndMonth(int year2, int month2) {
//		return year == year2 && month == month2;
//	}

//	public void edit(int coldWater2, int hotWater2) {
//		coldWater = coldWater2;
//		hotWater = hotWater2;
//	}

//	@Override
//	public String toString() {
//		return year + " " + month + " " + coldWater + " " + hotWater;
//	}

}
