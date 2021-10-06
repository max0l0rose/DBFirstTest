package com.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
	@Basic
	@Column(name = "user_id")
	private Integer userId;

	@Id
	@Column(name = "id")
	private int id;

	@OneToMany(mappedBy = "productByProductId")
	private Collection<OrderProduct> orderProductsById;

	@Basic
	@Column(name = "column_name")
	private String columnName;

	@OneToOne(
			mappedBy = "product"
	)
	//@JoinColumn(name = "prod_details", referencedColumnName = "id")
	private ProdDetails prodDetails;


	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Product product = (Product) o;
		return id == product.id
				       && Objects.equals(columnName, product.columnName)
				       && Objects.equals(userId, product.userId);
	}

	@Override
	public int hashCode() {
		return Objects.hash(columnName, userId, id);
	}
}
