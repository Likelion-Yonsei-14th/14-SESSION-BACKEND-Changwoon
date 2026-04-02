package com.example.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.member.Member;
import com.example.demo.service.OrderService;
import com.example.demo.config.Appconfig;

@SpringBootApplication
public class DemoApplication {
	public static void main(String[] args) {
		Appconfig appconfig = new Appconfig();
		OrderService orderService = appconfig.orderService();
		Member member = new Member("홍길동", "VIP");
		double result = orderService.createOrder(member, 20000);
		System.err.println("결제금액: " + result);
	}
}
