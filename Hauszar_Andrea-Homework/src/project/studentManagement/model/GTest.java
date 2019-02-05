package project.studentManagement.model;

import java.io.Serializable;

public class GTest extends Test implements Serializable {
	private static final long serialVersionUID = 1L;

	public GTest(String testID) {
		super(testID);
	}

	private String testID;
	private int NrQuestions;

	public GTest(String testID, int testMcNrQuestions) {
		super(testID);
		this.testID = testID;
		this.NrQuestions = testMcNrQuestions;

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
		return testID + " " + NrQuestions;
	}

}
