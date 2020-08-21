package com.ordermanagement.Order.dto;

import java.util.Date;


import com.ordermanagement.Order.entity.OrderDetails;

public class OrderDetailsDTO {
	
	Integer orderid;
	Integer customerid;
	Float amount;
	Date date;
	String address;
	String status;
	Integer quantity;
	
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
	
	public Integer getCustomerid() {
		return customerid;
	}
	public void setCustomerid(Integer customerid) {
		this.customerid = customerid;
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
	public static OrderDetailsDTO valueOf(OrderDetails orderdetails) {
		OrderDetailsDTO orderdetailsDTO=new OrderDetailsDTO();
		orderdetailsDTO.setAddress(orderdetails.getAddress());
		orderdetailsDTO.setAmount(orderdetails.getAmount());
		orderdetailsDTO.setCustomerid(orderdetails.getCustomerid());
		orderdetailsDTO.setDate(orderdetails.getDate());
		orderdetailsDTO.setOrderid(orderdetails.getOrderid());
		orderdetailsDTO.setStatus(orderdetails.getStatus());
		orderdetailsDTO.setQuantity(orderdetails.getQuantity());
		return orderdetailsDTO;
	}
	@Override
	public String toString() {
		return "OrderDetailsDTO [BuyerId=" + customerid + ", OrderId=" + orderid + ", Amount=" + amount
				+ ", Date=" + date + ", Address=" + address + ", Status =" + status +",quantity=" + quantity +"]";
	}

	public OrderDetails createEntity() {
		OrderDetails order = new OrderDetails();
		order.setAddress(this.getAddress());
		order.setAmount(this.getAmount());
		order.setCustomerid(this.getCustomerid());
		order.setDate(this.getDate());
		order.setOrderid(this.getOrderid());
		order.setStatus(this.getStatus());
		order.setQuantity(this.getQuantity());
		
		return order;
	}
	
}