package org.backend.Entity;

public class loptinchi {
	private String id;
	private String TenLopTC;
	private String idKhoa;
	private String idKhoaHoc;
	private String idMon;
	private String MaGV;
	private int status;
	private String created_by;
	private String created_at;
	private String updated_at;
	
	public loptinchi() {
		
	}
	
	public loptinchi(String id, String tenLopTC, String idKhoa, String idKhoaHoc, String idMon, String maGV, int status,
			String created_by, String created_at, String updated_at) {
		super();
		this.id = id;
		TenLopTC = tenLopTC;
		this.idKhoa = idKhoa;
		this.idKhoaHoc = idKhoaHoc;
		this.idMon = idMon;
		MaGV = maGV;
		this.status = status;
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

	public String getTenLopTC() {
		return TenLopTC;
	}

	public void setTenLopTC(String tenLopTC) {
		TenLopTC = tenLopTC;
	}

	public String getIdKhoa() {
		return idKhoa;
	}

	public void setIdKhoa(String idKhoa) {
		this.idKhoa = idKhoa;
	}

	public String getIdKhoaHoc() {
		return idKhoaHoc;
	}

	public void setIdKhoaHoc(String idKhoaHoc) {
		this.idKhoaHoc = idKhoaHoc;
	}

	public String getIdMon() {
		return idMon;
	}

	public void setIdMon(String idMon) {
		this.idMon = idMon;
	}

	public String getMaGV() {
		return MaGV;
	}

	public void setMaGV(String maGV) {
		MaGV = maGV;
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
