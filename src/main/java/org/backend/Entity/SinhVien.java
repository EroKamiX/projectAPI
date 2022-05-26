package org.backend.Entity;

public class SinhVien {
	private int id;
	private String masv;
	private String tenSV;
	private String khoaHoc;
	private String khoa;
	private String quequan;
	private String avatar;
	private String birthday;
	private int status;
	private String created_by;
	private String created_at;
	private String updated_at;
	
	public SinhVien() {
		
	}
	
	public SinhVien(int id, String masv, String tenSV, String khoaHoc, String khoa, String quequan, String avatar,
			int status, String created_by, String created_at, String updated_at) {
		super();
		this.id = id;
		this.masv = masv;
		this.tenSV = tenSV;
		this.khoaHoc = khoaHoc;
		this.khoa = khoa;
		this.quequan = quequan;
		this.avatar = avatar;
		this.status = status;
		this.created_by = created_by;
		this.created_at = created_at;
		this.updated_at = updated_at;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
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

	public String getTenSV() {
		return this.tenSV;
	}

	public void setTenSV(String tenSV) {
		this.tenSV = tenSV;
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

	public String getQuequan() {
		return quequan;
	}

	public void setQuequan(String quequan) {
		this.quequan = quequan;
	}

	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
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
