package com.example;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "order_product", schema = "db_first_test", catalog = "")
public class OrderProduct implements Serializable {
	private Product productByProductId_0;
	private Order1 order1ByOrderId;

	@Id
	@ManyToOne
	@JoinColumn(name = "product_id", referencedColumnName = "id", nullable = false)
	public Product getProductByProductId_0() {
		return productByProductId_0;
	}

	public void setProductByProductId_0(Product productByProductId_0) {
		this.productByProductId_0 = productByProductId_0;
	}

	@Id
	@ManyToOne
	@JoinColumn(name = "order_id", referencedColumnName = "id", nullable = false)
	public Order1 getOrder1ByOrderId() {
		return order1ByOrderId;
	}

	public void setOrder1ByOrderId(Order1 order1ByOrderId) {
		this.order1ByOrderId = order1ByOrderId;
	}
}
