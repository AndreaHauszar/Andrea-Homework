package project.studentManagement.model;

import java.io.Serializable;

public class Student implements Serializable {
	private static final long serialVersionUID = 1L;

	private String name;

	public Student(String name) {
		this.name = name;

	}

	public boolean hasName(String name2) {
		return name2.equals(name);
	}

	public void edit(String name2) {
		name = name2;

	}

	@Override
	public String toString() {
		return name;
	}

}
