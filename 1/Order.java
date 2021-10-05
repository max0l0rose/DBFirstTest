package com.example.dbfirsttest;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "order1" //, schema = "db_first_test", catalog = ""
)
public class Order {
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
		Order order = (Order) o;
		return id == order.id && Objects.equals(column2, order.column2);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, column2);
	}

	@OneToMany(mappedBy = "orderByOrderId")
	//@OneToMany(mappedBy = "orderId")
	public Collection<OrderProduct> getOrderProductsById() {
		return orderProductsById;
	}

	public void setOrderProductsById(Collection<OrderProduct> orderProductsById) {
		this.orderProductsById = orderProductsById;
	}
}
