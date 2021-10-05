package com.example;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Order1 {
	private int id;
	private Integer column2;
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
	@Column(name = "column_2")
	public Integer getColumn2() {
		return column2;
	}

	public void setColumn2(Integer column2) {
		this.column2 = column2;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Order1 order1 = (Order1) o;
		return id == order1.id && Objects.equals(column2, order1.column2);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, column2);
	}

	@OneToMany(mappedBy = "order1ByOrderId")
	public Collection<OrderProduct> getOrderProductsById() {
		return orderProductsById;
	}

	public void setOrderProductsById(Collection<OrderProduct> orderProductsById) {
		this.orderProductsById = orderProductsById;
	}
}
