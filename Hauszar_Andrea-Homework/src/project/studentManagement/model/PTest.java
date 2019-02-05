package project.studentManagement.model;

import java.io.Serializable;

public class PTest extends Test implements Serializable {
	public PTest(String testID) {
		super(testID);
	}

	private static final long serialVersionUID = 1L;

	@Override
	public void edit(Object... params) {
		this.testID = (String) params[0];
	}

}
