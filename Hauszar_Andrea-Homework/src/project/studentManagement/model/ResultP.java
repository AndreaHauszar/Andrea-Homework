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

	@Override
	public String toString() {
		return student + " | " + test + " | " + gradeFunctionality + " | " + gradeImplementation;
	}

	@Override
	public void edit(Object... params) {
		this.gradeFunctionality = (int) params[0];
		this.gradeImplementation = (int) params[1];
	}

	@Override
	public double getNota() {
		return (gradeFunctionality + gradeImplementation) / 2;
	}
}
