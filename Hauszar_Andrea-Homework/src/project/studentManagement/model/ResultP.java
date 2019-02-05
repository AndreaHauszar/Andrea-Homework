package project.studentManagement.model;

public class ResultP extends Result {
	private static final long serialVersionUID = 1L;
	private int gradeFunctionality;
	private int gradeImplementation;

	public ResultP(Test test, int notaFunc, int notaImpl) {
		super(test);
		this.gradeFunctionality = notaFunc;
		this.gradeImplementation = notaImpl;
	}
}
