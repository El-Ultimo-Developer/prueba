package com.elultimodeveloper.misiontic.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Enterprise {
	@Id
	private int id;
	@Column(unique = true)
	private String name;
	@Column(unique = true)
	private String document;
	private String phone;
	private String address;
	private Employee[] users;
	private Transaction[] transactions;
	private Date createdAt;
	private Date updatedAt;
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
	public String getDocument() {
		return document;
	}
	public void setDocument(String document) {
		this.document = document;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Employee[] getUsers() {
		return users;
	}
	public void setUsers(Employee[] users) {
		this.users = users;
	}
	public Transaction[] getTransactions() {
		return transactions;
	}
	public void setTransactions(Transaction[] transactions) {
		this.transactions = transactions;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	public Date getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
}
