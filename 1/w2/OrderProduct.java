package com.example;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
//@Table(name = "order_product", schema = "db_first_test", catalog = "")
//@IdClass(OrderProductPK.class)
public class OrderProduct implements Serializable {
	@Id
	@Column(name = "product_id")
	private int productId;

	@Id
	@Column(name = "order_id")
	private int orderId;

//	@Basic
//	@Column(name = "quantity")
	private int quantity;


	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		OrderProduct that = (OrderProduct) o;
		return productId == that.productId && orderId == that.orderId && quantity == that.quantity;
	}

	@Override
	public int hashCode() {
		return Objects.hash(productId, orderId, quantity);
	}
}
