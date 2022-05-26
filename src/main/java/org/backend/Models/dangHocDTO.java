package org.backend.Models;

public class dangHocDTO {
	private int id;
	private String classId;
	private String idMon;
	private String idTeacher;
	
	public dangHocDTO() {
		
	}

	public dangHocDTO(int id, String classId, String idMon, String idTeacher) {
		super();
		this.id = id;
		this.classId = classId;
		this.idMon = idMon;
		this.idTeacher = idTeacher;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getClassId() {
		return classId;
	}

	public void setClassId(String classId) {
		this.classId = classId;
	}

	public String getIdMon() {
		return idMon;
	}

	public void setIdMon(String idMon) {
		this.idMon = idMon;
	}

	public String getIdTeacher() {
		return idTeacher;
	}

	public void setIdTeacher(String idTeacher) {
		this.idTeacher = idTeacher;
	}
	
}
