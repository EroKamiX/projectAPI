package org.backend.Entity;

public class dkTinChi {
	private int id;
	private String maSV;
	private String idLopTC;
	private int status;
	private String created_by;
	private String created_at;
	private String updated_at;
	
	public dkTinChi() {
		
	}

	public dkTinChi(int id, String maSV, String idLopTC, int status, String created_by, String created_at,
			String updated_at) {
		super();
		this.id = id;
		this.maSV = maSV;
		this.idLopTC = idLopTC;
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

	public String getMaSV() {
		return maSV;
	}

	public void setMaSV(String maSV) {
		this.maSV = maSV;
	}

	public String getIdLopTC() {
		return idLopTC;
	}

	public void setIdLopTC(String idLopTC) {
		this.idLopTC = idLopTC;
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
