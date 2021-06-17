package com.komissarov.springstore.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Data
@Table(name = "order_item")
public class OrderItem implements Serializable {

    @Id
    @Column(name = "shop_order_id")
    private long orderId;

    @Id
    @Column(name = "product_id")
    private long productId;

    @Column(name = "quantity")
    private int quantity;

    public OrderItem() {
    }

    public OrderItem(long orderId, long productId, int quantity) {
        this.orderId = orderId;
        this.productId = productId;
        this.quantity = quantity;
    }
}
