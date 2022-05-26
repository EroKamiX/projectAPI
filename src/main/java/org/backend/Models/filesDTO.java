package org.backend.Models;

public class filesDTO {
	private int id;
	private String filename;
	private int baiTapId;
	private int nopBaiTapId;
	
	public filesDTO() {
		
	}

	public filesDTO(int id, String filename, int baiTapId, int nopBaiTapId) {
		super();
		this.id = id;
		this.filename = filename;
		this.baiTapId = baiTapId;
		this.nopBaiTapId = nopBaiTapId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	public int getBaiTapId() {
		return baiTapId;
	}

	public void setBaiTapId(int baiTapId) {
		this.baiTapId = baiTapId;
	}

	public int getNopBaiTapId() {
		return nopBaiTapId;
	}

	public void setNopBaiTapId(int nopBaiTapId) {
		this.nopBaiTapId = nopBaiTapId;
	}
	
}
