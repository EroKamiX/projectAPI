package org.backend.Entity;

public class svLopQL {
	private int id;
	private String masv;
	private String maLopQL;
	private int status;
	private String created_by;
	private String created_at;
	private String updated_at;
	
	public svLopQL() {
		
	}
	
	public svLopQL(int id, String masv, String maLopQL, int status, String created_by, String created_at,
			String updated_at) {
		super();
		this.id = id;
		this.masv = masv;
		this.maLopQL = maLopQL;
		this.status = status;
		this.created_by = created_by;
		this.created_at = created_at;
		this.updated_at = updated_at;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMasv() {
		return masv;
	}

	public void setMasv(String masv) {
		this.masv = masv;
	}

	public String getMaLopQL() {
		return maLopQL;
	}

	public void setMaLopQL(String maLopQL) {
		this.maLopQL = maLopQL;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
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
