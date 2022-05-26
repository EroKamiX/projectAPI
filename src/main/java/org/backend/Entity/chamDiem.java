package org.backend.Entity;

public class chamDiem {
	private int id;
	private int diem;

	private int thangDiem;
	private int baitapid;
	private String studentId;
	
	public chamDiem() {
		
	}

	public chamDiem(int id, int thangDiem, int diem, int baitapid, String studentId) {
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

	public int getThangDiem() {
		return thangDiem;
	}

	public void setThangDiem(int thangDiem) {
		this.thangDiem = thangDiem;
	}

	public int getDiem() {
		return diem;
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
