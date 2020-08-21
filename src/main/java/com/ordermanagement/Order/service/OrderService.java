package com.ordermanagement.Order.service;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.ordermanagement.Order.dto.OrderDetailsDTO;

import com.ordermanagement.Order.entity.OrderDetails;

import com.ordermanagement.Order.repository.OrderRepository;


@Service
public class OrderService {
	Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	public OrderRepository orderrepo;
	
	
	
	
	
	
	public OrderDetailsDTO getOrderById(Integer orderid) {
		return OrderDetailsDTO.valueOf(orderrepo.getOne(orderid));
	}

	
	
	public List<OrderDetailsDTO> getOrdersList() {
		List<OrderDetails> order = orderrepo.findAll();
		List<OrderDetailsDTO> orderDTO = new ArrayList<>();

		for (OrderDetails orderDetails : order) {
			OrderDetailsDTO orderdetailsDTO = OrderDetailsDTO.valueOf(orderDetails);
			orderDTO.add(orderdetailsDTO);
		}

		logger.info("Order details : {}", orderDTO);
		return orderDTO;
	}
	


	public void ChangeStatus(OrderDetailsDTO orderdetailsDTO) {
		OrderDetails orders= orderdetailsDTO.createEntity();
		orderrepo.save(orders);
	
	}

	
}