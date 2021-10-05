package com.example.dbfirsttest;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "order_product")
@IdClass(OrderProductPK.class)
public class OrderProduct {
	@Id
	@Column(name = "order_id")
	private int orderId;
	@Id
	@Column(name = "product_id")
	private int productId;

	@ManyToOne
	@JoinColumn(
			name = "order_id",
			referencedColumnName = "id", nullable = false
	)
	private Order orderByOrderId;

	@ManyToOne
	@JoinColumn(
			name = "product_id",
			referencedColumnName = "id", nullable = false
	)
	private Product productByProductId;


	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		OrderProduct that = (OrderProduct) o;
		return orderId == that.orderId && productId == that.productId;
	}

	@Override
	public int hashCode() {
		return Objects.hash(orderId, productId);
	}
}
