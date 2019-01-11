package com.team.model;

import java.sql.Date;
import java.sql.Timestamp;

public class Demand {
	private int id;
	private String d_account;
	private String title;
	private String content;
	private String industry;
	private String date;
	private Users user;
	
	public Demand() {
		
	}
	
	public Demand(String d_account,String title,String content,String industry) {
		this.d_account=d_account;
		this.title=title;
		this.content=content;
		this.industry=industry;
		
	}
	
	public int getId(){
		return id;
	}
	public void setId(int id) {
		this.id=id;
	}
	
	public String getD_account() {
		return d_account;
	}
	public void setD_account(String d_account) {
		this.d_account=d_account;
	}
	
	public String getTitle () {
		return title;
		
	}
	public void setTitle(String title) {
		this.title=title;
	}
	
	public String getContent() {
		return content;
	}
	
	public void setContent(String content) {
		this.content=content;
	}
	
	
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date=date;
	}
	
	public Users getUser() {
		return user;
	}
	public void setUser(Users user) {
		this.user=user;
	}
	
	public String getIndustry() {
		return industry;
	}
	public void setIndustry(String industry) {
		this.industry=industry;
	}

}









