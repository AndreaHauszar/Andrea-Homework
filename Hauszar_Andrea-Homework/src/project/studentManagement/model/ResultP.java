package project.studentManagement.model;

public class ResultP extends Result {
	private static final long serialVersionUID = 1L;
	private int notaFunc;
	private int notaImpl;

	public ResultP(Test test, int notaFunc, int notaImpl) {
		super(test);
		this.notaFunc = notaFunc;
		this.notaImpl = notaImpl;
	}
}
