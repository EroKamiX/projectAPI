package org.backend.Entity;

public class Mon {
	private String id;
	private String tenMon;
	private String khoa;
	private int soTinChi;
	private int soTietHoc;
	private int status;
	private String created_by;
	private String created_at;
	private String updated_at;
	
	public Mon() {
		
	}
	
	public Mon(String id, String tenMon, String khoa, int soTinChi, int soTietHoc, int status, String created_by,
			String created_at, String updated_at) {
		super();
		this.id = id;
		this.tenMon = tenMon;
		this.khoa = khoa;
		this.soTinChi = soTinChi;
		this.soTietHoc = soTietHoc;
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

	public String getTenMon() {
		return tenMon;
	}

	public void setTenMon(String tenMon) {
		this.tenMon = tenMon;
	}

	public String getKhoa() {
		return khoa;
	}

	public void setKhoa(String khoa) {
		this.khoa = khoa;
	}

	public int getSoTinChi() {
		return soTinChi;
	}

	public void setSoTinChi(int soTinChi) {
		this.soTinChi = soTinChi;
	}

	public int getSoTietHoc() {
		return soTietHoc;
	}

	public void setSoTietHoc(int soTietHoc) {
		this.soTietHoc = soTietHoc;
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
