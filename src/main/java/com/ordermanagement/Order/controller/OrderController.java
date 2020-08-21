package com.ordermanagement.Order.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


import com.ordermanagement.Order.dto.OrderDetailsDTO;

import com.ordermanagement.Order.service.OrderService;

@RestController
@EnableAutoConfiguration
@CrossOrigin


public class OrderController {
	Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	public OrderService orderService;
	
	@Autowired 
	DiscoveryClient client;
	
	
	@GetMapping(value= "/Vieworderdetails/{orderid}", produces = MediaType.APPLICATION_JSON_VALUE)
	public OrderDetailsDTO getOrderById(@PathVariable Integer orderid) {
		return orderService.getOrderById(orderid);
		
	}
	
	
	@GetMapping(value = "/Vieworderdetails",  produces = MediaType.APPLICATION_JSON_VALUE)
	public List<OrderDetailsDTO> getOrders() {
		return orderService.getOrdersList();
	}
	
	

	@PutMapping(value="/Vieworderdetails/manageOrder/{orderid}",consumes=MediaType.APPLICATION_JSON_VALUE)	
		public void manageOrder(@PathVariable Integer orderid, @RequestBody OrderDetailsDTO orderdetailsDTO) {
		orderService.ChangeStatus(orderdetailsDTO);
	}
	

}