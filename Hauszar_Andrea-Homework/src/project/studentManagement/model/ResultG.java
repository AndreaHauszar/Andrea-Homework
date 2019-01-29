package project.studentManagement.model;

public class ResultG extends Result {
	private static final long serialVersionUID = 1L;
	int corecte;

	public ResultG(Test test, int corecte) {
		super(test);
		this.corecte = corecte;
	}

}
