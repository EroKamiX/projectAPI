package org.backend.Entity;

public class giangVien {
	private int id;
	private String magv;
	private String tenGV;
	private String khoa;
	private int idBangCap;
	private String quequan;
	private String avatar;
	private int status;
	private String birthday;
	private String created_by;
	private String created_at;
	private String updated_at;
	
	public giangVien() {
		
	}
	
	public giangVien(int id, String magv, String tenGV, String khoa, int idBangCap, String quequan, String avatar,
			int status, String birthday, String created_by, String created_at, String updated_at) {
		super();
		this.id = id;
		this.magv = magv;
		this.tenGV = tenGV;
		this.khoa = khoa;
		this.idBangCap = idBangCap;
		this.quequan = quequan;
		this.avatar = avatar;
		this.status = status;
		this.birthday = birthday;
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

	public String getMagv() {
		return magv;
	}

	public void setMagv(String magv) {
		this.magv = magv;
	}

	public String getTenGV() {
		return tenGV;
	}

	public void setTenGV(String tenGV) {
		this.tenGV = tenGV;
	}

	public String getKhoa() {
		return khoa;
	}

	public void setKhoa(String khoa) {
		this.khoa = khoa;
	}

	public int getIdBangCap() {
		return idBangCap;
	}

	public void setIdBangCap(int idBangCap) {
		this.idBangCap = idBangCap;
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
