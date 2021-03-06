package project.studentManagement.model;

public class ResultG extends Result {
	private static final long serialVersionUID = 1L;
	int correctAnswers;

	public ResultG(Test test, int corecte, Student student) {
		super(test, student);
		this.correctAnswers = corecte;
	}

	@Override
	public String toString() {
		return student + " | " + test + " | " + correctAnswers;
	}

	@Override
	public void edit(Object... params) {
		this.correctAnswers = (int) params[0];
	}

	@Override
	public double getNota() {
		return (double) correctAnswers / ((GTest) test).getNrQuestions() * 10;
	}

}
