package project.studentManagement.model;

import java.io.Serializable;

public class Test implements Serializable {
	private static final long serialVersionUID = 1L;

	private String testID;

	public String getTestID() {
		return testID;
	}

	public void setTestID(String testID) {
		this.testID = testID;
	}

	public Test(String testID) {
		this.testID = testID;

	}

	public boolean hasTestID(String testID2) {
		return testID.equals(testID2);
	}

	public void edit(String testID2) {
		testID = testID2;

	}

	@Override
	public String toString() {
		return testID;
	}

}
