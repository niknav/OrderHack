package com.ordermanagement.Order.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="orderdetails")
public class OrderDetails{
	@Id
	@Column(name="orderid")
	Integer orderid;
	
	@Column(name="customerid")
	Integer customerid;
	
	@Column(name="amount",nullable = false, length=10)
	Float amount;
	
	Date date;
	
	@Column(name="address",nullable = false, length = 100)
	String address;
	
	@Column(name="status",nullable = false, length = 60)
	String status;
	@Column(name="quantity")
	Integer quantity;
	public Integer getCustomerid() {
		return customerid;
	}
	public void setCustomerid(Integer customerid) {
		this.customerid = customerid;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Float getAmount() {
		return amount;
	}
	public void setAmount(Float amount) {
		this.amount = amount;
	}
	
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Integer getOrderid() {
		return orderid;
	}
	public void setOrderid(Integer orderid) {
		this.orderid = orderid;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public OrderDetails() {
		super();
	}
	
}
