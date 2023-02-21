package br.com.erichiroshi.course.entities.enums;

public enum OrderStatus {

	WAITING_PAYMENT(1),
	PAID(2),
	SHIPPED(3),
	DELIVERED(4), 
	CANCELED(5);

	private int cod;

	private OrderStatus(int cod) {
		this.cod = cod;
	}

	public int getCod() {
		return cod;
	}

}
