package com.example;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "prod_details", schema = "db_first_test", catalog = "")
public class ProdDetails {
	@Id
	@Column(name = "id")
	private int id;

	@Basic
	@Column(name = "prod_descr")
	private String prodDescr;


	@OneToOne
	@JoinColumn(name = "id", referencedColumnName = "id", nullable = false)
	private Product product;


	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		ProdDetails that = (ProdDetails) o;
		return id == that.id && Objects.equals(prodDescr, that.prodDescr);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, prodDescr);
	}
}
