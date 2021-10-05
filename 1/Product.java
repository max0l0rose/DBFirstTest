package com.example.dbfirsttest;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "product", schema = "db_first_test"//, catalog = ""
)
public class Product {
	private int id;
	private Integer userId;
	private String newColumn;
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
	@Column(name = "userId")
	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	@Basic
	@Column(name = "new_column")
	public String getNewColumn() {
		return newColumn;
	}

	public void setNewColumn(String newColumn) {
		this.newColumn = newColumn;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Product product = (Product) o;
		return id == product.id && Objects.equals(userId, product.userId) && Objects.equals(newColumn, product.newColumn);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, userId, newColumn);
	}

	@OneToMany(mappedBy = "productByProductId")
	//@OneToMany(mappedBy = "productId")
	public Collection<OrderProduct> getOrderProductsById() {
		return orderProductsById;
	}

	public void setOrderProductsById(Collection<OrderProduct> orderProductsById) {
		this.orderProductsById = orderProductsById;
	}
}
