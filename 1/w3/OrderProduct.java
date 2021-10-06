package com.example;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "order_product", schema = "db_first_test", catalog = "")
//@IdClass(OrderProductPK.class)
public class OrderProduct implements Serializable
{
	//	@EmbeddedId
//	OrderProductPK pk;

	@Basic
	@Column(name = "quantity")
	private int quantity;

	@ManyToOne
	@Id
	@JoinColumn(name = "product_id", referencedColumnName = "id", nullable = false)
	private Product productByProductId;

	@ManyToOne
	@Id
	@JoinColumn(name = "order_id", referencedColumnName = "id", nullable = false)
	private Order1 order1ByOrderId;


	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		OrderProduct that = (OrderProduct) o;
		return quantity == that.quantity;
	}

	@Override
	public int hashCode() {
		return Objects.hash(quantity);
	}
}
