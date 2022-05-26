package org.backend.Models;

public class lichHocDTO {
	private int id;
	private String idLopTc;
	private String ngayBatDau;
	private String ngayKetThuc;
	private String GioHoc;
	private int status;
	private String created_by;
	private String created_at;
	private String updated_at;
	
	public lichHocDTO() {
		
	}

	public lichHocDTO(int id, String idLopTc, String ngayBatDau, String ngayKetThuc, String gioHoc, int status,
			String created_by, String created_at, String updated_at) {
		super();
		this.id = id;
		this.idLopTc = idLopTc;
		this.ngayBatDau = ngayBatDau;
		this.ngayKetThuc = ngayKetThuc;
		GioHoc = gioHoc;
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

	public String getIdLopTc() {
		return idLopTc;
	}

	public void setIdLopTc(String idLopTc) {
		this.idLopTc = idLopTc;
	}

	public String getNgayBatDau() {
		return ngayBatDau;
	}

	public void setNgayBatDau(String ngayBatDau) {
		this.ngayBatDau = ngayBatDau;
	}

	public String getNgayKetThuc() {
		return ngayKetThuc;
	}

	public void setNgayKetThuc(String ngayKetThuc) {
		this.ngayKetThuc = ngayKetThuc;
	}

	public String getGioHoc() {
		return GioHoc;
	}

	public void setGioHoc(String gioHoc) {
		GioHoc = gioHoc;
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
