package com.example;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Product {
	private String newColumn;
	private Integer userId;
	private int id;
	private Collection<OrderProduct> orderProductsById;

	@Basic
	@Column(name = "column_name")
	public String getNewColumn() {
		return newColumn;
	}

	public void setNewColumn(String newColumn) {
		this.newColumn = newColumn;
	}

	@Basic
	@Column(name = "user_id")
	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	@Id
	@Column(name = "id")
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Product product = (Product) o;
		return id == product.id
				       && Objects.equals(newColumn, product.newColumn)
				       && Objects.equals(userId, product.userId);
	}

	@Override
	public int hashCode() {
		return Objects.hash(newColumn, userId, id);
	}

	@OneToMany(mappedBy = "productByProductId")
	public Collection<OrderProduct> getOrderProductsById() {
		return orderProductsById;
	}

	public void setOrderProductsById(Collection<OrderProduct> orderProductsById) {
		this.orderProductsById = orderProductsById;
	}
}
