package com.example.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.example.demo.member.Member;
import com.example.demo.service.OrderService;
import com.example.demo.config.Appconfig;

@SpringBootApplication
public class DemoApplication {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Appconfig.class);
		OrderService orderService = applicationContext.getBean(OrderService.class);
		Member member = new Member("홍길동", "VIP");
		double result = orderService.createOrder(member, 20000);
		System.err.println("결제금액: " + result);
	}
}
