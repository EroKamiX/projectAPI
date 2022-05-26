package org.backend.Entity;

public class bangCap {
	private int id;
	private String tenBangCap;
	private String created_by;
	private String created_at;
	private String updated_at;
	
	public bangCap() {
		
	}

	public bangCap(int id, String tenBangCap, String created_by, String created_at, String updated_at) {
		super();
		this.id = id;
		this.tenBangCap = tenBangCap;
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

	public String getTenBangCap() {
		return tenBangCap;
	}

	public void setTenBangCap(String tenBangCap) {
		this.tenBangCap = tenBangCap;
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
