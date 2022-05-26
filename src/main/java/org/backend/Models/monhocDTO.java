package org.backend.Models;

public class monhocDTO {
	private String id;
	private String monName;
	private String classId;
	
	public monhocDTO() {
		
	}
	
	public monhocDTO(String id, String monName, String classId) {
		super();
		this.id = id;
		this.monName = monName;
		this.classId = classId;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getMonName() {
		return monName;
	}

	public void setMonName(String monName) {
		this.monName = monName;
	}

	public String getClassId() {
		return classId;
	}

	public void setClassId(String classId) {
		this.classId = classId;
	}
	
}
