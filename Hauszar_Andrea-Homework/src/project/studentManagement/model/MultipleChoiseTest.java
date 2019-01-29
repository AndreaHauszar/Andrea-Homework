package project.studentManagement.model;

import java.io.Serializable;

public class MultipleChoiseTest extends Test implements Serializable {
	private static final long serialVersionUID = 1L;

	public MultipleChoiseTest(String testID) {
		super(testID);
	}

	private String testID;
	private int testMcNrQuestions;

	public MultipleChoiseTest(String testID, int testMcNrQuestions) {
		super(testID);
		this.testID = testID;
		this.testMcNrQuestions = testMcNrQuestions;

	}

	@Override
	public boolean hasTestID(String testID2) {
		return testID.equals(testID2);
	}

//	public void edit(String testID2, int testMcNrQuestions2) {
//		testID = testID2;
//		testMcNrQuestions = testMcNrQuestions2;
//	}

	@Override
	public String toString() {
		return testID + " " + testMcNrQuestions;
	}

}
