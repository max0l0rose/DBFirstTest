package com.example;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Product {
	private int id;
	private String newColumn;
	private Integer userId;
	private Collection<OrderProduct> orderProductsById;

	@Id
	@Column(name = "id")
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Basic
	@Column(name = "new_column")
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

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Product product = (Product) o;
		return id == product.id && Objects.equals(newColumn, product.newColumn) && Objects.equals(userId, product.userId);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, newColumn, userId);
	}

	@OneToMany(mappedBy = "productId")
	public Collection<OrderProduct> getOrderProductsById() {
		return orderProductsById;
	}

	public void setOrderProductsById(Collection<OrderProduct> orderProductsById) {
		this.orderProductsById = orderProductsById;
	}
}
