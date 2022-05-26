package org.backend.Models;

public class chamDiemDTO {
	private int id;
	private int diem;
	private int thangDiem;
	private int baitapid;
	private String studentId;
	
	public chamDiemDTO() {
		
	}

	public chamDiemDTO(int id, int diem, int thangDiem, int baitapid, String studentId) {
		super();
		this.id = id;
		this.diem = diem;
		this.thangDiem = thangDiem;
		this.baitapid = baitapid;
		this.studentId = studentId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getDiem() {
		return diem;
	}

	public int getThangDiem() {
		return thangDiem;
	}

	public void setThangDiem(int thangDiem) {
		this.thangDiem = thangDiem;
	}

	public void setDiem(int diem) {
		this.diem = diem;
	}

	public int getBaitapid() {
		return baitapid;
	}

	public void setBaitapid(int baitapid) {
		this.baitapid = baitapid;
	}

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	
}
