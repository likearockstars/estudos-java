package entities;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import entities.enums.OrderStatus;
import java.time.format.DateTimeFormatter;

public class Order {
	
	private LocalDateTime moment;
	private OrderStatus status;
	private Client client;
	
	
	public Order() {
	}
	
	public Order(LocalDateTime moment, OrderStatus status, Client client) {
		
		this.moment = moment;
		this.status = status;
		this.client = client;
	}
	
	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	List<OrderItem> items = new ArrayList<>();
	
	
	
	private static DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
	
	
	public LocalDateTime getMoment() {
		
		return moment;
		
	}
	
	public void setMoment(LocalDateTime moment) {
		
		this.moment = moment;
	
	}
	public OrderStatus getStatus() {
		
		return status;
		
	}
	public void setStatus(OrderStatus status) {
		
		this.status = status;
	}
	
	
	public void addItem(OrderItem item) {
		
		items.add(item);
	}
	
	public void removeItem(OrderItem item) {
		
		items.remove(item);
	}
	
	public Double total() {
		
		Double total = 0.0;
		
		for(OrderItem item: items) {
			
			total = total + item.subTotal();
		}
		
		return total;
		
	}
	
	@Override
	
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		
		sb.append("Order moment: " + dtf2.format(moment) + "\n");
		sb.append("Order status: " + getStatus() + "\n");
		sb.append(client + "\n");
		sb.append("Order Items:\n");
		
		
		for(OrderItem item: items) {
			
			sb.append(item + "\n");
		}
		
		return sb.toString();
	}
	
	
	
}
