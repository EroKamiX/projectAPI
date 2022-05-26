package org.backend.Entity;

public class lopQL {
	private String id;
	private String tenLop;
	private String khoaHoc;
	private String khoa;
	private String MGV;
	private int Status;
	private String created_by;
	private String created_at;
	private String updated_at;
	
	public lopQL() {
		
	}
	
	public lopQL(String id, String tenLop, String khoaHoc, String khoa, String mGV, int status, String created_by,
			String created_at, String updated_at) {
		super();
		this.id = id;
		this.tenLop = tenLop;
		this.khoaHoc = khoaHoc;
		this.khoa = khoa;
		MGV = mGV;
		Status = status;
		this.created_by = created_by;
		this.created_at = created_at;
		this.updated_at = updated_at;
	}

	

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTenLop() {
		return tenLop;
	}

	public void setTenLop(String tenLop) {
		this.tenLop = tenLop;
	}

	public String getKhoaHoc() {
		return khoaHoc;
	}

	public void setKhoaHoc(String khoaHoc) {
		this.khoaHoc = khoaHoc;
	}

	public String getKhoa() {
		return khoa;
	}

	public void setKhoa(String khoa) {
		this.khoa = khoa;
	}

	public String getMGV() {
		return MGV;
	}

	public void setMGV(String mGV) {
		MGV = mGV;
	}

	public int getStatus() {
		return Status;
	}

	public void setStatus(int status) {
		Status = status;
	}

	public String getCreated_by() {
		return created_by;
	}

	public void setCreated_by(String created_by) {
		this.created_by = created_by;
	}

	public String getCreated_at() {
		return created_at;
	}

	public void setCreated_at(String created_at) {
		this.created_at = created_at;
	}

	public String getUpdated_at() {
		return updated_at;
	}

	public void setUpdated_at(String updated_at) {
		this.updated_at = updated_at;
	}
}
