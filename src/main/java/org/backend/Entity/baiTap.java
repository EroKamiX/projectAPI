package org.backend.Entity;

public class baiTap {
	private int id;
	private String name;
	private String username;
	private String deadline;
	private String tenBaiTap;
	private String noiDungBaiTap;
	private String loptinchi;
	private String lopql;
	private int thangDiem;

	public baiTap() {
	}

	public baiTap(int id, String name, String username, String deadline, String tenBaiTap, String noiDungBaiTap, String loptinchi, String lopql, int thangDiem) {
		this.id = id;
		this.name = name;
		this.username = username;
		this.deadline = deadline;
		this.tenBaiTap = tenBaiTap;
		this.noiDungBaiTap = noiDungBaiTap;
		this.loptinchi = loptinchi;
		this.lopql = lopql;
		this.thangDiem = thangDiem;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getDeadline() {
		return deadline;
	}

	public void setDeadline(String deadline) {
		this.deadline = deadline;
	}

	public String getTenBaiTap() {
		return tenBaiTap;
	}

	public void setTenBaiTap(String tenBaiTap) {
		this.tenBaiTap = tenBaiTap;
	}

	public String getNoiDungBaiTap() {
		return noiDungBaiTap;
	}

	public void setNoiDungBaiTap(String noiDungBaiTap) {
		this.noiDungBaiTap = noiDungBaiTap;
	}

	public String getLoptinchi() {
		return loptinchi;
	}

	public void setLoptinchi(String loptinchi) {
		this.loptinchi = loptinchi;
	}

	public String getLopql() {
		return lopql;
	}

	public void setLopql(String lopql) {
		this.lopql = lopql;
	}

	public int getThangDiem() {
		return thangDiem;
	}

	public void setThangDiem(int thangDiem) {
		this.thangDiem = thangDiem;
	}
}
