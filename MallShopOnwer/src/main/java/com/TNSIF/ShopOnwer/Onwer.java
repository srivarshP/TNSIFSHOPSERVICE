package com.TNSIF.ShopOnwer;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Onwer {
	@Id
	@Column(name="Cid")
	private int id;
	@Column(name="Cmoney")
	private int money;
	@Column(name="Cpname")
	private String Pname;
	@Column(name="Cname")
	private String Cname;
	public Onwer(int id, int money, String pname, String cname) {
		super();
		this.id = id;
		this.money = money;
		Pname = pname;
		Cname = cname;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public String getPname() {
		return Pname;
	}
	public void setPname(String pname) {
		Pname = pname;
	}
	public String getCname() {
		return Cname;
	}
	public void setCname(String cname) {
		Cname = cname;
	}
	public Onwer() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}
