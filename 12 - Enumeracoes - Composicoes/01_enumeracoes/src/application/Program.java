package application;

import java.util.Date;

import etities.Order;
import etities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) {
		
		Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);
		System.out.println(order);
	}

}
