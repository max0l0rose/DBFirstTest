package com.example;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Order1 {
	@Id
	@Column(name = "id")
	private int id;

	@Basic
	@Column(name = "column_2")
	private Integer column2;

	@OneToMany(mappedBy = "orderId")
	private Collection<OrderProduct> orderProductsById;


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
}
