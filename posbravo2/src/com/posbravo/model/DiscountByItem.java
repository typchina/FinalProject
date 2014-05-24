package com.posbravo.model;

// Generated Jan 31, 2014 8:16:08 PM by Hibernate Tools 4.0.0

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * DiscountByItem generated by hbm2java
 */
@Entity
@Table(name = "discount_by_item", catalog = "posbravo")
public class DiscountByItem implements java.io.Serializable {

	private DiscountByItemId id;

	public DiscountByItem() {
	}

	public DiscountByItem(DiscountByItemId id) {
		this.id = id;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "purchaseId", column = @Column(name = "PurchaseId")),
			@AttributeOverride(name = "promId", column = @Column(name = "PromId")) })
	public DiscountByItemId getId() {
		return this.id;
	}

	public void setId(DiscountByItemId id) {
		this.id = id;
	}

}