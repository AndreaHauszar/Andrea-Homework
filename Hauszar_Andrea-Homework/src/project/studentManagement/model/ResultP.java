package project.studentManagement.model;

public class ResultP extends Result {
	private static final long serialVersionUID = 1L;
	private int gradeFunctionality;
	private int gradeImplementation;

	public ResultP(Test test, int notaFunc, int notaImpl, Student student) {
		super(test, student);
		this.gradeFunctionality = notaFunc;
		this.gradeImplementation = notaImpl;
	}
}
