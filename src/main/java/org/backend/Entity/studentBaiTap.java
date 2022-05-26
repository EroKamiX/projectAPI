package org.backend.Entity;

public class studentBaiTap {
	private int id;
	private String username;
	private int baiTapId;
	private String lienket;
	
	public studentBaiTap() {
		
	}

	public studentBaiTap(int id, String username, int baiTapId, String lienket) {
		super();
		this.id = id;
		this.username = username;
		this.baiTapId = baiTapId;
		this.lienket = lienket;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public int getBaiTapId() {
		return baiTapId;
	}

	public void setBaiTapId(int baiTapId) {
		this.baiTapId = baiTapId;
	}

	public String getLienket() {
		return lienket;
	}

	public void setLienket(String lienket) {
		this.lienket = lienket;
	}
	
}
